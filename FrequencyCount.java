/**************************************************************
* File        :   FrequencyCount.java
* Description :   Program to find Frequency of a character in 
                  a String
* Author      :   Amal Joy
* Date        :   29-09-2023
***************************************************************/

import java.util.Scanner;
public class FrequencyCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String input=sc.nextLine();
		System.out.println("Enter a character:");
		char checkMe=sc.next().charAt(0);
		int charCount=checkFreq(input,checkMe);
		System.out.println("The number of occurence of character = "+charCount);
	}
	
/*Function that returns the count of character present in the string*/
	static int checkFreq(String input,char checkMe) {
		char []charArray=input.toCharArray();
		int charCount=0;
		for (int i=0;i<input.length();i++) {
			if (charArray[i]==checkMe) {
				charCount++;
			}
		}
		return charCount;
	}
}
