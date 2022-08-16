/*Write a method for computing xy doing repetitive multiplication. X and y are of type
integer and are to be given as command line arguments. Raise and handle exception(s)
for invalid values of x and y.*/


	public class lab8a
{
static void multi(int x,int y)
{
	int answer=x*y;
	System.out.println("answer is " +answer); 
}

public static void main(String[] args) {
	double answer=0;
	int x=Integer.parseInt(args [0]);
	int y=Integer.parseInt(args [2]);
	try{
		multi(x,y);
	}
	catch (Exception e)
	{
		e.printStackTrace();
		System.out.println(e);	
	}
}
}