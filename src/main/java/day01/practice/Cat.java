package day01.practice;

public class Cat {

	private boolean hasCats;
	private int age;
	private String color;
	private String speaks;
	// Getters and setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpeaks() {
		return speaks;
	}
	public void setSpeaks(String speaks) {
		this.speaks = speaks;
	}
	// Main method to create Cat objects
	public static void main(String[] args) {
		// Create two Cat objects
		Cat cat1 = new Cat();
		cat1.setAge(4);
		cat1.setColor("White");
		cat1.setSpeaks("Meow!");
		Cat cat2 = new Cat();
		cat2.setAge(3);
		cat2.setColor("Black");
		cat2.setSpeaks("Meow!");
		// Print the attributes of each Cat
		System.out.println("Cat 1:");
		System.out.println("Age: " + cat1.getAge());
		System.out.println("Color: " + cat1.getColor());
		System.out.println("Speaks: " + cat1.getSpeaks());
		System.out.println("Dog 2:");
		System.out.println("Age: " + cat2.getAge());
		System.out.println("Color: " + cat2.getColor());
		System.out.println("Speaks: " + cat2.getSpeaks());
	}
}
