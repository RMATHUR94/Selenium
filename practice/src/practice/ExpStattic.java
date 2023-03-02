package practice;

public class ExpStattic {
	
	int id ;
	String name ;
	static String bus;
	
	ExpStattic(int no,String name)
	{
		this.id = no;
		this.name = name;
	}
	
	public void Disp()
	{
		System.out.println(name+" address is "+id);
	}
	
	public static void main(String[] args) 
	{
		ExpStattic a1 = new ExpStattic(15,"GMDS");
		a1.Disp();
		ExpStattic a2 = new ExpStattic(18,"BMHC");
		a2.Disp();


	}

}
