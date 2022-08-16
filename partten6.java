import java.util.Scanner;
class partten6{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter value for partten =");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0){
					System.out.print("1");	
				}
				else{
					System.out.print("0");	
				}
			}
			System.out.print("\n");	
		}
	}
}
