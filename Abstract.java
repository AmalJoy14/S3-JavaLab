/**************************************************************
* File        :   Abstract.java
* Description :   Java program to understand polymorphism
* Author      :   Amal Joy
* Date        :   20-10-2023
***************************************************************/

public class Abstract {
	public static void main(String [] args) {
		Rectangle rectangle=new Rectangle();
		Triangle triangle= new Triangle();
		Hexagon hexagon=new Hexagon();
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
	}
}

abstract class Shape{
	abstract public void numberOfSides();
}

class Rectangle extends Shape{
	public void numberOfSides() {
		System.out.println("Number of sides of Rectangle=4");
	}	
}

class Triangle extends Shape{
public void numberOfSides() {
	System.out.println("Number of sides of Triangle=3");
	}
}

class Hexagon extends Shape{
	public void numberOfSides() {
		System.out.println("Number of sides of Hexagon=6");
	}
}