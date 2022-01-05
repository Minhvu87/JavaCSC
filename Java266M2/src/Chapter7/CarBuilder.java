package Chapter7;

public class CarBuilder {
	private int wheels;
	private String color;
	
	
	public CarBuilder buildWheels(int wheels) {
	   this.wheels = wheels;
	   return this;
   }
   
   public CarBuilder buildColor(String color) {
	   this.color = color;
	   return this;
   }
}
