package Lession6;

public class Animal {
	String name;
	String image;
	public String getName() {
		return name;
	}
	public String getImage() {
		return image;
	}
	public Animal() {
	}
	public Animal(String name, String image) {
		this.name = name;
		this.image = image;
	}
	public String sayHello() {
		return "Hello";
	}
}
