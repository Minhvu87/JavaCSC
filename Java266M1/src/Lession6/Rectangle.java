package Lession6;

public class Rectangle extends Shape {
	private double chieudai;
	private double chieurong;
	
	public Rectangle(double chieudai, double chieurong) {
		super();
		// TODO Auto-generated constructor stub
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}
	public double getChieudai() {
		return chieudai;
	}
	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}
	public double getChieurong() {
		return chieurong;
	}
	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	@Override
	public double perimeter() {
		return (this.chieudai + this.chieurong)*2;
	}
	@Override
	public double area() {
		return (this.chieudai * this.chieurong);
	}
}
