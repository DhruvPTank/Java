import java.io.*;
import java.util.*;
public class con_vov {
	public static void main (String[] args)
	{
		int consonants=0;
		int vovels=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string for count consonants and vovels");
		String  s1= scan.next();
		String s2= s1.toLowerCase();
		int n=s2.length();


		for (int i=0;i<n;i++)
		{
		
			char ch=s2.charAt(i);
		

			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vovels++;
			}


			else {
				consonants++;
			}
		} 
           System.out.println("the conso0nants are:" +consonants);
           System.out.println("the vovels are:" +vovels);
	}
}