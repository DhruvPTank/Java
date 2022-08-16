import java.io.*;
import java.util.*;
class fibonacci_seris {
	public static void main (String[] args)
	{ Scanner dhruv=
		new  Scanner(System.in);
		int n1=0; //dhruv.nextInt();
		int n2=1; //dhruv.nextInt();
		int number=10;

		 for( int i=2;i<number;++i)    
 {    
   int n3=n1+n2;
  System.out.println(n3);       
  n1=n2;    
  n2=n3;


	}
	
   System.out.println(n1);
	System.out.println(n2);
	
}
}