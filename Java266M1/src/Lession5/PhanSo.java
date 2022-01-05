package Lession5;

public class PhanSo {
	// Bien Instance
	private int tuso;
	private int mauso;
	
	// Phuong thuc khoi tao -> mac dinh tuong minh
	public PhanSo() {
		
	}
	public PhanSo(int tuso, int mauso) {
		this.tuso = tuso;
		this.mauso = mauso;
	}
	//Setter va getter
	public int getTuso() {
		return tuso;
	}
	public void setTuso(int tuso) {
		this.tuso = tuso;
	}
	public int getMauso() {
		return mauso;
	}
	public void setMauso(int mauso) {
		this.mauso = mauso;
	}
	public PhanSo CongPhanSo(PhanSo ps2) {
		tuso = this.tuso*ps2.getMauso() + this.mauso*ps2.getTuso();
		mauso = this.mauso*ps2.getMauso();
		return new PhanSo(tuso,mauso);
	}
	public PhanSo TruPhanSo(PhanSo ps2) {
		tuso = this.tuso*ps2.getMauso() - this.mauso*ps2.getTuso();
		mauso = this.mauso*ps2.getMauso();
		return new PhanSo(tuso,mauso);
	}
	public PhanSo NhanPhanSo(PhanSo ps2) {
		tuso = this.tuso*ps2.getTuso();
		mauso = this.mauso*ps2.getMauso();
		return new PhanSo(tuso,mauso);
	}
	public PhanSo ChiaPhanSo(PhanSo ps2) {
		tuso = this.tuso*ps2.getMauso();
		mauso = this.mauso*ps2.getTuso();
		return new PhanSo(tuso,mauso);
	}
	@Override
	public String toString() {
		return tuso + "/" + mauso;
	}
	
}
