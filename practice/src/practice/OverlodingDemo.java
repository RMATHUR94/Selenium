package practice;

class Demo
{
	public void show(int a)
	{
		System.out.println("value is "+ a);
	}
	public void show(String s)
	{
		System.out.println("name is :"+s);
	}
	public void show(byte b)
	{
		System.out.println("in byte"+ b);
	}
}

public class OverlodingDemo {

	public static void main(String[] args) 
	{
	   int b = 250;
	   Demo ob = new Demo();
	   ob.show(b);
	   
	   ob.show("hello");
	   ob.show('A');
	   ob.show("A");
	   // since float datatype
       // is not available and so it's higher
       // datatype, so at this step their
       // will be an error.
	   //ob.show(7.5f);;
	   

	}

}
