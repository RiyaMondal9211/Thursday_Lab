package basicprogram;
import java.util.Scanner;
public class Bank
{
     public static void main(String args[]) 
     {
		
		int amount,availablebalance;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account balance: ");
		availablebalance=sc.nextInt();
		System.out.println("Enter the amount you want to withdraw: ");
		amount=sc.nextInt();
		
		if(availablebalance>amount)
		{
		    System.out.println("Withdraw Successful.");
		    
		}
		else
		{
			System.out.println("You don't have sufficient balance.");	
		}
		
		availablebalance+=5000;
	    System.out.println("The account balance is: " +availablebalance);
		
     }
}
