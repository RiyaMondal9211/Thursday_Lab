package basicprogram;

import java.util.Scanner;

public class CheckVowelOrConsonant {

	public static void  main(String args[]) {
		
		char c;
		System.out.println("Enter the character");
		Scanner sc =new Scanner(System.in);
	    c=sc.next().charAt(0);
		
		if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
			System.out.println(c+ " is vowel");
		else
			System.out.println(c+ " is a consonant");
		
	}
}
