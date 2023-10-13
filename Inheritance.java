/**************************************************************
* File        :   Inheritence.java
* Description :   Exercise to understand Inheritance.
* Author      :   Amal Joy
* Date        :   13-10-2023
***************************************************************/
import java.util.Scanner;
public class Inheritance {
	public static void main(String [] args) {
		Officer officer=new Officer();
		Manager manager=new Manager();
		System.out.println("Enter the officer details:");
		officer.getDetails();
		officer.getSpec();
		officer.printDetails();
		officer.printSpec();
		System.out.println("Enter the manager details:");
		manager.getDetails();
		manager.getDept();
		manager.printDetails();
		manager.printDept();
		
	}

}
class Employee{
	String name;
	int age;
	long phNo;
	String address;
	int salary;
	Scanner sc=new Scanner(System.in);
	public void getDetails() {
		System.out.println("Enter name,age,PhoneNo.,address,salary:");
		name=sc.nextLine();
		age=sc.nextInt();
		phNo=sc.nextLong();
		sc.nextLine();
		address=sc.nextLine();
		salary=sc.nextInt();
	}
	public void printDetails() {
		System.out.printf("Name=%s\nAge=%d\nPhoneNo.=%d\nAddress=%s\nSalary=%d\n",name,age,phNo,address,salary);
	}
	
}
class Officer extends Employee{
	String specialization;
	public void getSpec() {
		System.out.println("Enter specialization:");
		sc.nextLine();
		specialization=sc.nextLine();
	}
	public void printSpec() {
		System.out.println("Specialization="+specialization);
	}
}

class Manager extends Employee{
	String department;
	public void getDept() {
		System.out.println("Enter Department:");
		sc.nextLine();
		department=sc.nextLine();
	}
	public void printDept() {
		System.out.println("Department="+department);
	}
	
}
