package Lession5;

public class CD {
	public CD() {
		
	}
	String maCD;
	String tenCD;
	String caSi;
	int soBaiHat;
	double giaThanh;
	public CD(String maCD, String tenCD, String caSi, int soBaiHat, double giaThanh) {
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.caSi = caSi;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}
	//Getter va Setter
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}
	public String getTenCD() {
		return tenCD;
	}
	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}
	public String getCaSi() {
		return caSi;
	}
	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}
	public double getGiaThanh() {
		return giaThanh;
	}
	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}
	// Business method
	@Override // nạp chồng hàm
	public String toString() {
			return maCD + " - " + tenCD + " - " + caSi + " - " + soBaiHat + " - " + giaThanh;
	}

	
}
