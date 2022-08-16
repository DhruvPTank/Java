import java.io.*;
import java.util.*;

public class palindrom{
 
 public static void main (String[] args)
 { 
 	int n=0,rem=0,rev=0;
 	System.out.println("enter the number");
    Scanner num=new Scanner(System.in);
    int number=num.nextInt();
int temp=number;

while(number>0)
{
 rem=number%10;
rev=(rev*10) + rem ;
number=number/10;
} 

if(rev == temp)
{
	System.out.println("nember is palindrom.");
}
else
{
System.out.println("nember is not palindrom");
}
}



}
