package basicprogram;

import java.util.Scanner;

public class CheckUpperOrLower {
	
	public static void main(String args[]) {
		
		char character;
		System.out.println("Enter the character: ");
		Scanner sc=new Scanner(System.in);
		character=sc.next().charAt(0);
		
		if((character>='A')&&(character<='Z'))
			System.out.println(character+ " is in uppercase ");
		else if((character>='a')&&(character<='z'))
			System.out.println(character+ " is in lowercase ");
		
	}

}
