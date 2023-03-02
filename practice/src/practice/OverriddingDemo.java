package practice;

class Shape
{
   public void draw()
   {
   System.out.println("inside parent class");
   System.out.println("drawing shape");
   }
}
class Circle extends Shape
{
	public void draw()
	   {
	   System.out.println("inside child class");
	   System.out.println("drawing circle");
	   }
}	
public class OverriddingDemo {

	public static void main(String[] args)
	{

		// If a Parent type reference refers
		    // to a Parent object, then Parent's draw() method is called
		Shape ob1 = new Shape();
		ob1.draw();
		// If a Parent type reference refers to a Child object Child's draw() method is called.
	    //This is called RUN TIME POLYMORPHISM.
		
		Shape ob2 = new Circle();
		ob2.draw();

	}

}
