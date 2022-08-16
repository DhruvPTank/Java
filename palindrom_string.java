import java.io.*;
import java.util.*;

public class palindrom_string{
 
 public static void main (String[] args)
 { 

 	System.out.println("enter the string");
    Scanner sc=new Scanner(System.in);
   String s1= sc.nextLine();
   int len=s1.length();
    String s2="";
for(int i=len-1;i>=0;i--)
{
   s2=s2 + s1.charAt(i);
} 

if(s1.equals(s2))
{
	System.out.println("string is palindrom.");
}
else
{
System.out.println("string is not palindrom");
}
}



}
