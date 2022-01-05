package Chapter5;

public class Sach {
	public String TenSach;
	public String TacGia;
	public String NXB;
	public double GiaBia;
	public Sach() {
	}
	public Sach(String tenSach, String tacGia, String nXB, double giaBia) {
		this.TenSach = tenSach;
		this.TacGia = tacGia;
		this.NXB = nXB;
		this.GiaBia = giaBia;
	}
	public String getTenSach() {
		return TenSach;
	}
	public void setTenSach(String tenSach) {
		this.TenSach = tenSach;
	}
	public String getTacGia() {
		return TacGia;
	}
	public void setTacGia(String tacGia) {
		this.TacGia = tacGia;
	}
	public String getNXB() {
		return NXB;
	}
	public void setNXB(String nXB) {
		this.NXB = nXB;
	}
	public double getGiaBia() {
		return GiaBia;
	}
	public void setGiaBia(double giaBia) {
		this.GiaBia = giaBia;
	}
	
	
	
}
