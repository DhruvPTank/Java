import java.io.*;
import java.util.*;

public class result {

	public static void main(String[] args)
	{
		int total;
     Scanner sc=new Scanner (System.in);

		
	System.out.println("Enter marks of subject 1");
	int a=sc.nextInt();
	
	System.out.println("Enter marks of subject 2");
    int b=sc.nextInt();

	System.out.println("Enter marks of subject 3");
    int c=sc.nextInt();

	System.out.println("Enter marks of subject 4");
    int d=sc.nextInt();

	System.out.println("Enter marks of subject 5");
    int e=sc.nextInt();

	total=(a+b+c+d+e)/5;

	if(total >=60)
	{
		System.out.println("you are first class");
	}

	else if(total >=50)
	{
		System.out.println("you are second class");
		
	}

	else if(total >=40)
	{
		System.out.println("you are third class");
	}

	else
	{
		System.out.println("you are first class");
		
	}
	}



}