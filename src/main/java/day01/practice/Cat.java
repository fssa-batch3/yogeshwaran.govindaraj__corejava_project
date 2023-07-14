package day01.practice;

public class Cat {
	  	private int age;
	    private String color;
	    
	    // Constructor 
	    public Cat(int age, String color) {
	        this.age = age;
	        this.color = color;
	    }
	   
	   
	    // Getters and setters
	    public int age() {
	        return age;
	    }
	    public void setage(int age) {
	        this.age = age;
	    }
	    public String getColor() {
	        return color;
	    }
	    public void setColor(String color) {
	        this.color = color;
	    }
		public void speak() {
	        System.out.println("Speaks: oww!");
	    }
		
	    // Main method to create Cat objects
	    public static void main(String[] args) {
	        // Create two Cat objects
	        Cat Cat1 = new Cat(4, "White");
	        Cat Cat2 = new Cat(3, "Black");
	        Cat Cat3 = new Cat (6,"Red");
	        
	        // Print the attributes of each Cat
	        System.out.println("Cat 1:");
	        System.out.println("Age: " + Cat1.age());
	        System.out.println("Color: " + Cat1.getColor());
			Cat1.speak();
			
			
	        System.out.println("Cat 2:");
	        System.out.println("Age: " + Cat3.age());
	        System.out.println("Color: " + Cat3.getColor());
			Cat1.speak();
	    }
}