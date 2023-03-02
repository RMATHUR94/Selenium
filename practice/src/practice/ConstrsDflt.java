package practice;

public class ConstrsDflt {
	
	String name ;
	int id;
	
	public void disp()
	{
		System.out.println(name +" "+id);
	}
	

	public static void main(String[] args) 
	{
		ConstrsDflt s1 = new ConstrsDflt();
		ConstrsDflt s2 = new ConstrsDflt();
		s1.disp();
		s2.disp();

	}

}
