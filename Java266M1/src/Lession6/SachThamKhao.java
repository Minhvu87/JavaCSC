package Lession6;

public class SachThamKhao extends Sach {
	private double Thue;

	public SachThamKhao(double Thue) {
		super();
		// TODO Auto-generated constructor stub
		this.Thue = Thue;
	}
	@Override
	public Double ThanhTien() {
		return super.getSoLuong()*super.getDonGia()*(1+Thue/100);
	}
}
