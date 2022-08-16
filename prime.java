import java.io.*;
import java.util.*;

public class prime{
	public static void main (String [] args)
	{ int num;
		 boolean flag=false;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		for (int i=2; i<num;i++)
		{
           int b=num%i;
           if(b==0)
           {
           flag=true;
       }

		}

		if(!flag) 
		{
			System.out.println("number is Prime");
		}

		else 
		{
			System.out.println("number is  not Prime");
		}
	}
}