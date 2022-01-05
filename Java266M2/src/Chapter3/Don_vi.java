package Chapter3;

public class Don_vi {
	private String ten;
	private int so_nhan_vien;
	public Don_vi(String ten, int so_nhan_vien) {
		this.ten = ten;
		this.so_nhan_vien = so_nhan_vien;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSo_nhan_vien() {
		return so_nhan_vien;
	}
	public void setSo_nhan_vien(int so_nhan_vien) {
		this.so_nhan_vien = so_nhan_vien;
	}
	@Override
	public String toString() {
		return 	"Tên đơn vị: " + ten
				+"\nSố nhân viên: " + so_nhan_vien;
	}
	
	
}
