package practice;

//Java program to demonstrate working of
//interface

interface It1
{
	public final int a = 10;
	
	void display();			
}
 class Testdemo implements It1
 {
	public void display()
	{
		System.out.println("STARTED IMPLIMENTATION");
	}
 }

public class inface_eg2 {

	public static void main(String[] args)
	{
	    Testdemo t1 = new Testdemo();
	    t1.display();
	    System.out.println(t1.a);
	    		

	}

}
