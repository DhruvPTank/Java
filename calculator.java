import java.io.*;
import java.util.*;
 
 public class calculator {

 	public static void main (String [] args)
 	{
 	
 		System.out.println("enter number 1");
 		Scanner sc=new Scanner (System.in);
 		int a=sc.nextInt ();

 		System.out.println("enter number 2");
         int b=sc.nextInt();

         System.out.println("enter the operation from +,-,*,/");
         int answer;
            String  c=sc.next();
         if(c.compareTo("+") == 0)
         {
         	answer=a+b;
         }
          else if(c.compareTo("-") == 0)
         {
         	answer=a-b;
         }

         else if(c.compareTo("*")== 0)
         {
         	answer=a*b;
         }

         else
         {
         	answer=a/b;
         }

         System.out.println("answer = " +answer);
 	}
 }