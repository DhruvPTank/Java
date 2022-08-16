//area of circle by two diffrent files this is a main file
import java.util.Scanner;
public class circlearea {
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the redious");
		float b=sc.nextFloat();
		circle a1=new circle();
		a1.circlearea(b);
	}
}