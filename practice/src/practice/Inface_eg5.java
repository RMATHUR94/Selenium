package practice;

 interface In1
{
   public void show1();
   public void show2();
}
 interface In2 extends In1
{
	public void show3();
}

public class Inface_eg5 implements In1,In2{
	
	public void show1()
	{
		System.out.println("Show 1 implementation");
	}
	public void show2()
	{
		System.out.println("Show 2 implementation");
	}
	public void show3()
	{
		System.out.println("Show 3 implementation");
	}

	public static void main(String[] args)
	{
		Inface_eg5 e1 = new Inface_eg5();
		e1.show1();
		e1.show2();
		e1.show3();

	}

}
