import java.util.*;
public class Estimation
{
	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("Select the type of material to be used:\n\t1.Standard\n\t2.Above Standard\n\t3.High Standard\n\t4.High Standardwith Full Automated");
		try{
		int result=0;
		int ch=sc.nextInt();
		System.out.println("Enter total area of house in Square Feet");
		int a=sc.nextInt();
		switch(ch)
		{
		    case 1:result=a*1200;
		    case 2:result=a*1500;
		    case 3:result=a*1800;
		    case 4:result=a*2500;
		    default:result=a*1200;
		    
		}
// 		System.out.println("ddfd"+result);
		System.out.println("Total cost for construction is  ₹"+result);
		}
		catch (Exception e)
		{
		    System.out.println("Please enter the corret input");
		}
	    
	}
}
