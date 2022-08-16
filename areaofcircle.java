/* Finding the area of circle in one file*/



import java.util.Scanner;
public class areaofcircle{
	void circlearea(float red)   //body of function
		{
			double area= (float)3.14*red*red;
			System.out.println ("area of circle is::=" +area);
		} 
 public static void main(String[] args)

{
			Scanner scan=new Scanner (System.in);
		System.out.println ("enter the radious of a circle::"); 
		float red=scan.nextFloat();
		areaofcircle object1 = new areaofcircle();
     

          object1.circlearea(red);   
           

		
	}
}