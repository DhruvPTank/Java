/*Write a complete program to accept N integer numbers from the command line. Raise
and handle exceptions for following cases :
a. - when a number is –ve
b. - when a number is evenly divisible by 10
c. - when a number is greater than 1000 and less than 2000
d. - when a number is greater than 7000
Skip the number if an exception is raised for it, otherwise add it to find total sum.*/

import java.util.Scanner;
public class lab_8b
{
	public static void main(String[] args) {
			try{
				int [] arr =new int[100];
				int sum=0;
				Scanner scan=new Scanner(System.in);
				for (int i=0;i<100;i++)
				{ 
					System.out.println("enter number ");
					arr[i]=scan.nextInt();


   			//int n=Integer.parseInt(args[0]);
		
		System.out.println("Hello how aRE YOU");

		//condition 1
		if(arr[i]<0)
		{
			throw new Exception("your number is positive sorry");
		}
		//condition 2

		if(arr[i]%10==0){
			throw new Exception("your number is divided by 10 so sorry");
		}

        //condition 3
         if (arr[i]>1000 && arr[i]<2000)
		{
			throw new Exception("your number is greater then  1000 and less then 2000 so sorry");
		}

		//condition 4
         if(arr[i]>7000)
           {
           	throw new Exception("sorry number is greater then 7000");
           }
       }
}
catch(Exception e)

{
   System.out.println(e);
}




	}
} 