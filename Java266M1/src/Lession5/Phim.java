package Lession5;

public class Phim {
	String tenPhim;
	String theLoai;
	String ngayChieu;
	String rap;
	
	public Phim(String tenPhim, String theLoai, String ngayChieu, String rap) {
		this.tenPhim = tenPhim;
		this.theLoai = theLoai;
		this.ngayChieu = ngayChieu;
		this.rap = rap;
		
	}
	public Phim() {
		
	}
	// Ham getter va setter
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public String getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(String ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public String getRap() {
		return rap;
	}
	public void setRap(String rap) {
		this.rap = rap;
	}
	
	
}
