package Chapter5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author phaolo
 *
 */
public class TestConnectDB2 {
	
	// Moi DBMS thi chuoi Driver la khac nhau
	private static final String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	
	
	/**
	 * Thuc hien demo ket noi va xu ly du lieu trong DB
     * B1: Open connection
     * B2: Execution (bao gom B4,B5,B6 trong slide)
     * B3: Close connection
	 * @param args
	 */
	public static void main(String[] args) {
		
		// B1. Kiem tra viec nap trinh dieu cau noi (optional)
		try {
			Class.forName(JDBC_DRIVER_CLASS);
		} catch (Exception e) {
			System.out.println("Chua nap trinh dieu khien cau noi (chua import thu vien).");
			System.exit(0);
		}
		
		// B2: thong tin de ket noi den DB gom: URL, user, password
		final String USER = "root";
		final String PASSWORD = "Minh@vu08072000";
		
		// Moi DBMS -> URL thay doi
		final String URL = "jdbc:mysql://localhost:3306/phan_cong_nhan_vien_1_1_nam";
		
		try {
			// B3: Thuc hien connection
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// B4: Tao doi tuong Statement -> doi tuong quan ly thuc thi truy van
			String sqlUpdate = "update nhan_vien set ho_ten = ? where id = ?";
			PreparedStatement stm = conn.prepareStatement(sqlUpdate);
			
			
			// update nhan_vien voi id = 1
			stm.setString(1, "Pham Duc De");
			stm.setInt(2, 1);
			stm.executeUpdate();
			
			// update nhan_vien voi id = 2
			stm.setString(1, "Nguyen Van A");
			stm.setInt(2, 2);
			stm.executeUpdate();
			
			String sqlSelect = "select ID, Ho_ten, cmnd, muc_luong from nhan_vien limit 5";
			ResultSet rs = stm.executeQuery(sqlSelect);
			
			// B6: Xu ly ket qua
			List<Employee> listOfEmployee = new ArrayList<>();
			while (rs.next()) {
				int id = rs.getInt(1);
				String hoTen = rs.getString("Ho_ten");
				String cmnd = rs.getString(3);
				long luong = rs.getLong("muc_luong");
				
				Employee employee = new Employee(id, hoTen, cmnd, luong);
				listOfEmployee.add(employee);
			}
			
			listOfEmployee.stream().forEach(e -> System.out.println(e));
			
			
			// B7: Dong ket noi
			conn.close();
		} catch (Exception e) {
			System.out.println("Connection fail.");
			e.printStackTrace();
		}
		
		
		
		System.out.println("Done.");
	}

}
