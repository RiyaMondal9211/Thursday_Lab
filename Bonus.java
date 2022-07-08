package basicprogram;

import java.util.Scanner;

public class Bonus {
	
	public static void main(String args[]) {
		
		int servingyear,bonus=0,joiningyear,currentyear;
		System.out.println("Enter the joining year: ");
		Scanner sc=new Scanner(System.in);
		joiningyear=sc.nextInt();
		
		System.out.println("Enter the current year: ");
		currentyear=sc.nextInt();
		
		servingyear=currentyear-joiningyear;
		
		if(servingyear>3)
			bonus=2500;
		
		System.out.println("Bonus is: "+bonus);	
			
	}
	

}
