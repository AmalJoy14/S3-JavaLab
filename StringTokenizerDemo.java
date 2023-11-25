/**************************************************************
* File        :   StringTokenizerDemo.java
* Description :   Program to understand StringTokenizer
* Author      :   Amal Joy
* Date        :   25-11-2023
***************************************************************/

import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerDemo {
    public static void main(String [] args) {
    	int sum=0;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Integers");
    	String lineOfIntegers=sc.nextLine();
    	StringTokenizer tokenizer=new StringTokenizer(lineOfIntegers);
    	while (tokenizer.hasMoreTokens()) {
    		int num=Integer.parseInt(tokenizer.nextToken());
    		System.out.println(num);
    		sum+=num;
    	}
    	System.out.println("Sum="+sum);
    	sc.close();
    }
}
