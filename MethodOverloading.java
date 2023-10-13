/**************************************************************
* File        :   MethodOverloading.java
* Description :   My Java Program showcasing MethodOverloading
* Author      :   Amal Joy
* Date        :   13-10-2023
***************************************************************/
import java.util.Scanner;
public class MethodOverloading{
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Base of triangle:");
		float base=sc.nextFloat();
		System.out.println("Enter the Height of triangle:");
		float height=sc.nextFloat();
		System.out.println("Enter the width of Rectangle:");
		int width=sc.nextInt();
		System.out.println("Enter the length of Rectangle:");
		int length=sc.nextInt();
		System.out.println("Enter the Radius of Circle:");
		float radius=sc.nextFloat();
		Shapes shapes=new Shapes();
		shapes.Area(base, height);
		shapes.Area(width, length);
		shapes.Area(radius);
	}
}
class Shapes{
	float area;
	void Area(float base,float height) {
		area=(float)(0.5*base*height);
		System.out.printf("Area of Triangle with base %.2f and height %.2f is %.2f\n",base,height,area);
	}
	void Area(int width,int length) {
		area=width*length;
		System.out.printf("Area of Rectangle with width %d and length %d is %.0f\n",width,length,area);
	}
	void Area(float radius) {
		area=(float)(3.14*radius*radius);
		System.out.printf("Area of Circle with radius %.2f is %.3f\n",radius,area);
	}
	
}