package Lession6;

public class LanhDao extends NhanVien{
	
	public LanhDao(double hesoLuong) {
		super(hesoLuong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong()*1.1;
	}
}
