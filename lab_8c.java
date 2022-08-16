/*WAP to create Account class, which is representing a bank account where we can
deposit and withdraw money. if we want to withdraw money which exceed our bank
balance? We will not be allowed, create InSufficientFundException to handle above
situation and display proper error message.*/



import java.util.Scanner;
public class lab_8c
{
public static void main(String[] args) {
			Scanner scan=new Scanner(System.in)
	class Account
	{
	     System.out.println("Enter your balance");
		double balance=scan.nextDouble();

		System.out.println("Enter you want to deposit of withdraw");
		String S1=scan.nextLine()
		System.out.println("Enter your ammount");
		double ammount=scan.nextDouble();
		if(S1.equals("withdraw"))
		{
		void deposit()
		{
           balance=balance+ammount;
		}
	     }

	     else {
	     	void withdraw()
	     	{
	     		balance=balance-ammount;
	     	}
	     }
		}
	}
}