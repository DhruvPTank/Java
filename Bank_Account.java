import java.util.Scanner;

public class Bank_Account{
Scanner scan=new Scanner(System.in);

int accountNo;
String userName,email,account_type;
double 	account_balance;
void Getaccountdetails()
{

        System.out.println("Enter you account number");
        accountNo=scan.nextInt();
		System.out.println("Enter your user name");
		userName=scan.next();
        System.out.println("Enter your Email id");
	    email=scan.next();
	    System.out.println("Enter your account_type");
		account_type=scan.next();
		System.out.println("Enter your account_balance");
	    account_balance=scan.nextDouble();
}
void DisplayAccountDetails()
{
		System.out.println("UserName is======>>" +userName);
		System.out.println("accountNo is======>>" +accountNo);
		System.out.println("email is======>>" +email);
        System.out.println("account_type is======>>" +account_type);
        System.out.println("account_balance======>>" +account_balance);
}


		{

		}
	}