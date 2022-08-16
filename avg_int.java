import java.io.*;
import java.util.*;
public class avg_int {
	public static void main(String[] args)
	{
		double sum=0;
		double numbers[]=new double[5];
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the five numbers");
        
        for (int i=0;i<5 ;i++ ) {
        	numbers[i] = scan.nextDouble();
        	sum=sum+numbers[i];

         	 } 
	      double average=sum/5;
	      System.out.println("the average is:" +);
	}
}
