import java.io.*;
import java.util.*;

public class operator_precidance 
{
	public static void main (String[] args)
	{
        	System.out.println("enter number 1");
		Scanner n1=new Scanner(System.in);
		int a=n1.nextInt();

		System.out.println("enter number 2");
		int b=n1.nextInt();

		System.out.println("enter number 3");
		 int c=n1.nextInt();

		 System.out.println("enter number 4");
		 int d=n1.nextInt();

    int output=a+(b*(c/d));
    System.out.println("output = "+output); 

	}
}