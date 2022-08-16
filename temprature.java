import java.util.Scanner;
public class temprature{
void fahrenhit (float fah)
{
	float celcius=(fah-32)*5/9;
	System.out.println("the converted temprature id::--" +celcius);

}
public static void main(String [] args)
{
     System.out.println("enter the value to convert");
     Scanner scan=new Scanner(System.in);
     float ans=scan.nextFloat();
     temprature object1=new temprature();
     object1.fahrenhit(ans);
    }
}