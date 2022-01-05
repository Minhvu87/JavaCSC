package Lession6;

public class Circle extends Shape {
	public double r;

	
	public Circle(double r) {
		super();
		// TODO Auto-generated constructor stub
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double perimeter() {
		return 2*Math.PI * r;
	}
	@Override
	public double area() {
		return Math.PI * Math.pow(r, 2);
	}
	
}
