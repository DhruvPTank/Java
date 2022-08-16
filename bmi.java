import java.io.*;
import java.util.*;

public class bmi
{
	public static void main (String[] args)
	{
		System.out.println("enter weight in pounds");
		Scanner n1=new Scanner(System.in);
		float a=n1.nextFloat();
		System.out.println("enter height in inches");
		float b=n1.nextFloat();
          
          double weight=(a*0.453592);
           double height=(b*0.0254);

               double bmi= weight/(height*height);

               		System.out.println("bmi is =" +bmi);

	}
}