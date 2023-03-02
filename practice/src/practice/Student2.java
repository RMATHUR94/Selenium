package practice;

class school
{
	String sch;
	int id;
	
}
//object initialize through ref variable 
public class Student2 {

	public static void main(String[] args)
	{
		//creating object
	    school a1 = new school();
	    school a2 = new school();
	    //initializing objects
	    a1.sch = "bts";
	    a1.id = 10; 
	    a2.sch = "cms";
	    a2.id =20;
	    //printing data
	    System.out.println(a1.sch+" "+a1.id);
	    System.out.println(a2.sch+" "+a2.id);
	}

}
