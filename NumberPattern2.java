package basicprogram;

import java.util.Scanner;

public class NumberPattern2 
{
	public static void main(String args[])
	{
		int i,j,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		r=sc.nextInt();
		
		for(i=0;i<=r;i++)
		{
			for(j=r;j>i;j--)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
