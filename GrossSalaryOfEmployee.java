package basicprogram;
import java.util.Scanner;
public class GrossSalaryOfEmployee
{
     public static void main(String args[])
     {
    	 int basicsalary,HRA=0,DA=0,grosssalary=0;
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the basic salary:");
    	 basicsalary=sc.nextInt();
    	 
    	 if(basicsalary>=1500)
    	 {
    		 HRA=(basicsalary*20)/100;
    		 DA=(basicsalary*90)/100;
    	 }
    	 else
    	 {
    		 HRA=500;
    		 DA=(basicsalary*70)/100; 
    	 }
    	 
    	 grosssalary=basicsalary+HRA+DA;
    	 System.out.println("The gross salary is:" +grosssalary);
     }
}
