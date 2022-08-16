/*The Transport interface declares a deliver () method. The abstract class Animal is the
super class of the Tiger, Camel, Deer and Donkey classes. The Transport interface is
implemented by the Camel and Donkey classes. Write a test program that initialize an
array of four Animal objects. If the object implements the Transport interface, the
deliver () method is invoked.*/


interface Transport {
	public void deliver();
}
	abstract class Animal{
		void AnimalShow()
		{
			System.out.println("method of an Animal");
		}
	}


 class camel extends Animal implements Transport
 {
 	public void deliver()
 	{
         System.out.println("abstract camel");
 	}
 	void camelshow()
 	{
          System.out.println("CAMEL SHOW CALLED");
 	}
 }


 class donkey extends Animal implements Transport
 {
 	public void deliver()
 	{
         System.out.println("abstract camel");
 	}
 	void donkeyShow()
 	{
          System.out.println("DONKEY SHOW CALLED");
 	}
 }



public class lab_7_5 
{
	public static void main(String[] args) {
 		camel c=new camel();
 		donkey d=new donkey();
 		c.AnimalShow();
 		d.donkeyShow();
	}
}
    


