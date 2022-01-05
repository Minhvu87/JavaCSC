package Chapter5;


import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class QLCSDL {
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Login";
	private static final String JDBC_URL1 = "jdbc:mysql://localhost:3306/TTLH";
	private static final String JDBC_URL2 = "jdbc:mysql://localhost:3306/QLSach";
	private static final String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "Minh@vu08072000";
			// các phương thức cần thiết khác
	public Connection connect() throws SQLException, ClassNotFoundException {
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		return conn;
	}
	public Connection connect1() throws SQLException, ClassNotFoundException {
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL1, JDBC_USERNAME, JDBC_PASSWORD);
		return conn;
	}
	public Connection connect2() throws SQLException, ClassNotFoundException {
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL2, JDBC_USERNAME, JDBC_PASSWORD);
		return conn;
	}
	public User timUser(String username, String password) throws SQLException,ClassNotFoundException{
		User user = null;
		try (Connection conn = this.connect()) {
			java.sql.Statement statement = conn.createStatement();
//			String sqlUpdate = "update User set username = 'Thanh', password = '1966' where id = 3";
//			statement.executeUpdate(sqlUpdate);
//			String query = "insert into User(username,password) values('Hieu','3011'),('Bong','1903')";
//			statement.executeUpdate(query);
			String sql = "SELECT * FROM User WHERE username = '" + username + "' and password = '" + 
					password + "'";
			ResultSet resultSet = statement.executeQuery(sql);
			
			
			
			while (resultSet.next()) {
				user = new User();
				user.setUsername(resultSet.getString("username"));
				user.setUsername(resultSet.getString("password"));
				break;
			}
			conn.close();
		}
		return user;
	}
	public boolean themLienHe(LienHe c) throws SQLException, ClassNotFoundException,UnsupportedEncodingException {
		boolean execute = false;
		try (Connection conn = this.connect1()) {
			String sql = "INSERT INTO lienhe VALUES(NULL,'" + c.getHoten() + "' ,'" + c.getDtdd() + "' ,'"+ 
					c.getHinhanh() + "')";
			PreparedStatement statement = conn.prepareStatement(sql);
			execute = statement.execute();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return execute;
	}
	public void themSach(Sach s) throws ClassNotFoundException, SQLException, UnsupportedEncodingException{
		try(Connection conn = this.connect2()){
			String sql = "insert into SACH values(Null,"+s.TenSach+","+
		s.TacGia+","+s.NXB+","+s.GiaBia+")";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();
			conn.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public List <Sach>dsSach(String tenSach)throws ClassNotFoundException, SQLException{
		List<Sach> rs;
		try(Connection conn = this.connect2()){
			rs = new ArrayList<>();
			java.sql.Statement statement = conn.createStatement();
			String sql = "SELECT * FROM SACH WHERE TenSach like '%" + tenSach + "%'";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				Sach p = new Sach();
				p.setTenSach(resultSet.getString("TenSach"));
				p.setTacGia(resultSet.getString("TacGia"));
				p.setNXB(resultSet.getString("NXB"));
				p.setGiaBia(resultSet.getDouble("GiaBia"));
				rs.add(p);
			}
			conn.close();
		}
		return rs;
	}
	public void xoaSach(String tenSach) throws ClassNotFoundException,SQLException,UnsupportedEncodingException{
		try(Connection conn = this.connect2())
		{
			String sql = "DELETE FROM SACH WHERE TenSach = '" + tenSach + "'";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();
		}
	}
	public void capnhatSach(Sach s) throws ClassNotFoundException, SQLException,UnsupportedEncodingException {
		try (Connection conn = this.connect2()) {
			String sql = "UPDATE sach SET TacGia = '" + s.getTacGia() + "', NXB = '" + s.getNXB() + "'GiaBia = '" + 
								s.getGiaBia() + "' WHERE TenSach = '" + s.getTenSach() + "'";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.execute();
		}
	}
}
