package Lession6;

public class XeHoi implements PhuongTienGiaoThong, DongCo {
	String tenXe;
	String hangSanXuat;
	public XeHoi(String tenXe, String hangSanXuat) {
		this.tenXe = tenXe;
		this.hangSanXuat = hangSanXuat;
	}
	public String getTenXe() {
		return tenXe;
	}
	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	/*
	 * @Param QuangDuong
	 * 
	 * @Param ThoiGian
	 * 
	 * @return
	 */
	@Override
	public double tinhVanToc(double QuangDuong, double ThoiGian) {
		return QuangDuong/ThoiGian;
	}
	/*
	 * @param QuangDuong
	 * 
	 * @param SoLit
	 * 
	 * @return
	 */
	@Override
	public double tinhTieuThuNhienLieu(double QuangDuong, double SoLit) {
		return QuangDuong/SoLit;
	}
}
