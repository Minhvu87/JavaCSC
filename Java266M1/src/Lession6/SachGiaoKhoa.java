package Lession6;

public class SachGiaoKhoa extends Sach{
	@Override
	public Double ThanhTien() {
		return (super.getSoLuong() * super.getDonGia());
	}
}
