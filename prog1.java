import java.io.*;
import java.util.*;
public class prog1 
{
	public static void main(String[] args)

	{
		double x=Double.parseDouble(args [0]);
		double y=Double.parseDouble(args [1]);
		double avg=(x+y)/2;
		double sum=(x+y);
		System.out.println("the average is: " +avg);
		System.out.println("the sum is: " +sum);

	}
}