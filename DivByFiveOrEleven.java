package basicprogram;

import java.util.Scanner;

public class DivByFiveOrEleven {
	
	public static void main(String args[]) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();	
		
		if((num%5==0)&&(num%11==0))
			System.out.println(num+ " is divisible by 5 and 11");
		else
			System.out.println(num+ " is not divisible by 5 and 11");
	}

}
