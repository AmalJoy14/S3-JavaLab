abstract class Animal{
	protected int legs;
	protected Animal(int legs) {
		this.legs=legs;
	}
	public abstract void eat();
	public void walk() {
		System.out.println("This animal walks by "+legs+" legs");
	}
}

class Spider extends Animal{
	public Spider(){
		super(8);
	}
	public void eat() {
		System.out.println("Spider eats insects");
	}
}

interface Pet{
	public String getName();
	public void setName(String name);
	public void play();
}

class Cat extends Animal implements Pet{
	private String name;
	public Cat(String name) {
		super(4);
		this.name=name;
	}
	Cat(){
		this("");
	}
	public void eat() {
		System.out.println("Cat eat fishes");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void play() {
		System.out.println("The Cat is playing");
	}	
}

class Fish extends Animal implements Pet{
	String name;
	public Fish() {
		super(0);
	}
	public void eat() {
		System.out.println("Fish eats plants");
	}
	public void play() {
		System.out.println("The Fish is playing");
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	@Override
	public void walk() {
		System.out.println("Fish has no legs");
	}
}


public class TestAnimals{
	public static void main(String args []) {
		Fish fish =new Fish();
		Cat cat =new Cat("Fluffy");
		Spider spider =new Spider();
		
		System.out.println("FISH");
		fish.setName("Mimi");
		System.out.println("The fish's name is "+fish.getName());
		fish.eat();
		fish.walk();
		fish.setName("Momo");
		System.out.println("The fish's name is "+fish.getName());
		
		
	    System.out.println("\nCAT");
	    System.out.println("The cat's name is "+cat.getName());
	    cat.walk();
	    cat.eat();
	    cat.setName("Moose");
	    System.out.println("The cat's name is "+cat.getName());
	    
		System.out.println("\nSPIDER");
		spider.eat();
		spider.walk();
	}
}