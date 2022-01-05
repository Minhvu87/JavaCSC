package Lession6;

public class TauThuy implements PhuongTienGiaoThong, DongCo{
	double trongLuong;
	int sucTai;
	double vanTocNuocXuoiDong;
	double vanTocNuocNguocDong;
	double nhienLieuTieuHao;
	public TauThuy(double trongLuong, 
			int sucTai, double vanTocNuocXuoiDong, 
			double vanTocNuocNguocDong, double nhienLieuTieuHao) {
		this.trongLuong = trongLuong;
		this.sucTai = sucTai;
		this.vanTocNuocXuoiDong = vanTocNuocXuoiDong;
		this.vanTocNuocNguocDong = vanTocNuocNguocDong;
		this.nhienLieuTieuHao = nhienLieuTieuHao;
	}
	public double getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(double trongLuong) {
		this.trongLuong = trongLuong;
	}
	public int getSucTai() {
		return sucTai;
	}
	public void setSucTai(int sucTai) {
		this.sucTai = sucTai;
	}
	public double getVanTocNuocXuoiDong() {
		return vanTocNuocXuoiDong;
	}
	public void setVanTocNuocXuoiDong(double vanTocNuocXuoiDong) {
		this.vanTocNuocXuoiDong = vanTocNuocXuoiDong;
	}
	public double getVanTocNuocNguocDong() {
		return vanTocNuocNguocDong;
	}
	public void setVanTocNuocNguocDong(double vanTocNuocNguocDong) {
		this.vanTocNuocNguocDong = vanTocNuocNguocDong;
	}
	public double getNhienLieuTieuHao() {
		return nhienLieuTieuHao;
	}
	public void setNhienLieuTieuHao(double nhienLieuTieuHao) {
		this.nhienLieuTieuHao = nhienLieuTieuHao;
	}
	@Override
	public double tinhVanToc(double QuangDuong, double ThoiGian) {
		double vanToc = (QuangDuong/ThoiGian)+this.vanTocNuocXuoiDong - 
				this.vanTocNuocNguocDong;
		return vanToc;
	}
	@Override
	public double tinhTieuThuNhienLieu(double QuangDuong, double SoLit) {
		return QuangDuong/(SoLit - this.nhienLieuTieuHao);
	}

}
