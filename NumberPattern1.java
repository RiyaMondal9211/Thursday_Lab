package basicprogram;

import java.util.Scanner;

public class NumberPattern1
{

	public static void main(String args[])
	{
		int i,j,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows: ");
		r=sc.nextInt();
		
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
