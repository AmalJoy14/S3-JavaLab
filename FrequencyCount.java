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
