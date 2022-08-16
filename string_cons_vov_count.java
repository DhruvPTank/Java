import java.util.Scanner;
public class string_cons_vov_count {
	public static void main(String[] args) {

		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);

		String s1="quit";
		String entered_string =sc.next();
		int v=0, c=0;
		String s2=entered_string.toLowerCase();
  
if(s2.equals(s1)){
		System.out.println("===========you quit the process===========");
	}


else{
		for(int i=0;i<s2.length();i++){

			char ch=s2.charAt(i);

			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			     v++;

			else 
				c++;
		}

		System.out.println("no of vowels="+v);
		System.out.println("no of consonants="+c);
	}
	       }
	            }
