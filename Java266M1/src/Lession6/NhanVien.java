package Lession6;

public class NhanVien {
	protected final double LUONGCOBAN = 1550000;
	private double hesoLuong;
	public NhanVien(double hesoLuong) {
		this.hesoLuong = hesoLuong;
	}
	public double getHesoLuong() {
		return hesoLuong;
	}
	public void setHesoLuong(double hesoLuong) {
		this.hesoLuong = hesoLuong;
	}
	public double tinhLuong() {
		return this.LUONGCOBAN * this.hesoLuong;
	}
	
	
}
