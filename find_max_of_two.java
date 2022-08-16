import java.io.*;
import java.util.*;

public class find_max_of_two
{
	public static void main (String[] args)
	{
		System.out.println("enter n1");
		Scanner n1=new Scanner(System.in);
		int a=n1.nextInt();
		System.out.println("enter n2");
		int b=n1.nextInt();


if (a>b)
 {
		System.out.println("max = " +a);
}
  else 
  {
  	System.out.println("max = " +b);	
  }

	}
}