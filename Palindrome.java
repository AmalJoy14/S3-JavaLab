/**************************************************************
* File        :   Palindrome.java
* Description :   Program to find Palindrome of a String
* Author      :   Amal Joy
* Date        :   29-09-2023
***************************************************************/

import java.util.Scanner;
public class Palindrome {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.next();
		boolean isPalindrome=check(input);
		if(isPalindrome)
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	
	}
/*Function that takes a string as input and returns,
 * true:if it is a palindrome
 * false:if it is not a palindrome*/
	static boolean check(String input)
	{
		char[] charArray=input.toCharArray();
		int length =input.length();
		for (int i=0;i<=length/2;i++)
		{
			if (charArray[i]!=charArray[length-1-i]){
				return false;
			}
                                                    
		}
		return true;
	}

}
