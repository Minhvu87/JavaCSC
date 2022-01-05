package Chapter5;

public class LienHe {
	public String hoten;
	public String dtdd;
	public String hinhanh;
	
	public LienHe() {
	}
	public LienHe(String hoten, String dtdd, String hinhanh) {
		this.hoten = hoten;
		this.dtdd = dtdd;
		this.hinhanh = hinhanh;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDtdd() {
		return dtdd;
	}
	public void setDtdd(String dtdd) {
		this.dtdd = dtdd;
	}
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
}
