package practice;

public class ConsExp {	
	ConsExp()  /*It calls a default constructor 
	            if there is no constructor available in the class. In such case,
	            Java compiler provides a default constructor by default.*/
	{
	   System.out.println("construct is created");	
	}		
	public static void main(String[] args)
	{
	   ConsExp	a1 = new ConsExp();
	   ConsExp  a3 = new ConsExp();

	}

}
