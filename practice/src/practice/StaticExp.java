package practice;


public class StaticExp 
{
	//in here static block is printing at first.
	static 
	{
		System.out.println("Hello I m in the static ");
	}
	
	int a , b;
	public int add(int x ,int y)
	{
		this.a=x;
		this.b=y;
		int p = x+y;
		return p;
	}
	
	public static void main(String[] args)
	{
		
       System.out.println("Hello lets Start main");
       
       StaticExp s = new StaticExp();
       System.out.println(s.add(15,20));
	}

}
