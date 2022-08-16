/*Create interface EventListener with performEvent() method. Create MouseListener
interface which inherits EventListener along with mouseClicked(), mousePressed(),
mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener
interface which inherits EventListener along with keyPressed(), keyReleased() methods.
 WAP to create EventDemo class which implements MouseListener and
KeyListener and demonstrate all the methods of the interfaces.*/


import java.util.*;
public class lab_6_4
{
	public static void main (String[] args)
	{      EventDemo obj=new EventDemo();
       		obj.performEvent();
        	obj.mouseClicked();
			obj.mousePressed();
          	obj.mouseReleased();
			obj.mouseMoved();
			obj.mouseDragged();
			obj.keyPressed();
			obj.keyReleased();
	}
}

//interface EventListener			
			interface EventListener
			{
				public void performEvent();
			}
//interface mouseListener
			interface MouseListener extends EventListener
			{
				public void mouseClicked();
			    public void mousePressed();
          		public void mouseReleased();
			    public void mouseMoved();
			    public void mouseDragged();
			}

			interface  KeyListener extends EventListener,MouseListener
			{

			public void  keyPressed();
			public void  keyReleased();
			}



			 class EventDemo
			{
				public void performEvent(){
					System.out.println("Event performed");
				}
				public void mouseClicked(){
					System.out.println("mouse Clicked");
				}
			    public void mousePressed(){
					System.out.println("mouse pressed");
				}
          		public void mouseReleased(){
					System.out.println("mouse Released");
				}
			    public void mouseMoved(){
					System.out.println("mouse Moved");
				}
			    public void mouseDragged(){
					System.out.println("mouse Dragged");
				}
			    public void  keyPressed(){
					System.out.println("key Pressed");
				}
			    public void  keyReleased(){
					System.out.println("key Released");
				}
			}

