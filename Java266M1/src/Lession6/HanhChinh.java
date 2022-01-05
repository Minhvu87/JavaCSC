package Lession6;

public class HanhChinh extends NhanVien {
	private double phuCap;

	public HanhChinh(double phuCap, double hesoLuong) {
		// TODO Auto-generated constructor stub
		super(hesoLuong);
		this.phuCap = phuCap;
	}

	public double getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	@Override
	public double tinhLuong() {
		return super.tinhLuong()+this.phuCap;
	}

}
