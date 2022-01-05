package Lession6;

public class Sach {
	private String MaSach;
	private String TenSach;
	private String NgayNhap;
	private double DonGia;
	private double SoLuong;
	private String NhaXuatBan;
	public Sach() {
		
	}
	public Sach(String maSach, String tenSach, String ngayNhap, double donGia, double soLuong, String nhaXuatBan) {
		super();
		MaSach = maSach;
		TenSach = tenSach;
		NgayNhap = ngayNhap;
		DonGia = donGia;
		SoLuong = soLuong;
		NhaXuatBan = nhaXuatBan;
	}
	
	

	public String getMaSach() {
		return MaSach;
	}



	public void setMaSach(String maSach) {
		MaSach = maSach;
	}



	public String getTenSach() {
		return TenSach;
	}



	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}



	public String getNgayNhap() {
		return NgayNhap;
	}



	public void setNgayNhap(String ngayNhap) {
		NgayNhap = ngayNhap;
	}



	public double getDonGia() {
		return DonGia;
	}



	public void setDonGia(double donGia) {
		DonGia = donGia;
	}



	public double getSoLuong() {
		return SoLuong;
	}



	public void setSoLuong(double soLuong) {
		SoLuong = soLuong;
	}



	public String getNhaXuatBan() {
		return NhaXuatBan;
	}



	public void setNhaXuatBan(String nhaXuatBan) {
		NhaXuatBan = nhaXuatBan;
	}



	public Double ThanhTien() {
		return 0.0;
	}
	

}
