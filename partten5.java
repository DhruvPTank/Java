import java.util.Scanner;
class partten5{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value for partten");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(""+count);
				System.out.print(" ");
				count++;
			}
			System.out.print("\n");	
		}
	}
}