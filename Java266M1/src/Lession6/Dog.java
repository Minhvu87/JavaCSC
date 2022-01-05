package Lession6;

public class Dog extends Animal {
	@Override
	public String sayHello() {
		return "Gâu gâu gâu";
	}
	public Dog() {
	}
	public Dog(String name, String image) {
		super(name,image);
	}

}
