package Lession6;

public class KinhDoanh extends NhanVien {
	private double soSanpham;

	public KinhDoanh(double soSanpham, double hesoLuong) {
		super(hesoLuong);
		// TODO Auto-generated constructor stub
		this.soSanpham = soSanpham;
	}

	public double getSoSanpham() {
		return soSanpham;
	}

	public void setSoSanpham(double soSanpham) {
		this.soSanpham = soSanpham;
	}
	@Override
	public double tinhLuong() {
		return super.tinhLuong() + this.soSanpham * 20000;
	}
}
