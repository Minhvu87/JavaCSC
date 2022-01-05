package Lession6;

public class KyThuat extends NhanVien{
	private double soDuan;
	

	public KyThuat(double soDuan, double hesoLuong) {
		super(hesoLuong);
		// TODO Auto-generated constructor stub
		this.soDuan = soDuan;
	}

	public double getSoDuan() {
		return soDuan;
	}

	public void setSoDuan(double soDuan) {
		this.soDuan = soDuan;
	}
	@Override
	public double tinhLuong() {
		return super.tinhLuong() + this.soDuan*1000000;
	}
}
