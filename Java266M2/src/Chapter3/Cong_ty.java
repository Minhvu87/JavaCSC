package Chapter3;

public class Cong_ty {
	private String ten;
	private String dia_chi;
	private String mail;
	private String dien_thoai;
	public Cong_ty(String ten, String dia_chi, String mail, String dien_thoai) {
		this.ten = ten;
		this.dia_chi = dia_chi;
		this.mail = mail;
		this.dien_thoai = dien_thoai;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDia_chi() {
		return dia_chi;
	}
	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDien_thoai() {
		return dien_thoai;
	}
	public void setDien_thoai(String dien_thoai) {
		this.dien_thoai = dien_thoai;
	}
	@Override
	public String toString() {
		return "*****Thông tin công ty*****\n"
				+ "Tên công ty: "+ten
				+ "\nĐịa chỉ: "+dia_chi
				+ "\nMail: "+ mail
				+ "\nĐiện thoại: "+dien_thoai;		
	}
	
	
}
