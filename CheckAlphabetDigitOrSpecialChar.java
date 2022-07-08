package basicprogram;

import java.util.Scanner;

public class CheckAlphabetDigitOrSpecialChar {
	
	public static void main(String args[]) {
		
		char c;
		System.out.println("Enter the character: ");
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		
		if((c>='A' && c<='Z')||(c>='a' && c<='z'))
			System.out.println(c+ " is a Alphabet");
		else if(c>=0 && c<=0)
				System.out.println(c+ " is a Digit");
		else
			System.out.println(c+ " is a Special Character");
		
				
		
	}
	

}
