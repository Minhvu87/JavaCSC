package Lession8;

public class GiftBox {
	public String hinhDang;
	public String mauSac;
	final int phiLamHop = 10000;
	public GiftBox(String hinhDang, String mauSac) {
		this.hinhDang = hinhDang;
		this.mauSac = mauSac;
	}
	class Gift{
		public String ten;
		public Double trongLuong;
		final int donGia = 200;
		public Gift(String ten, Double trongLuong) {
			this.ten = ten;
			this.trongLuong = trongLuong;
		}
		public Double tinhTienGui() {
			return trongLuong*donGia + GiftBox.this.phiLamHop;
		}
	}
}
