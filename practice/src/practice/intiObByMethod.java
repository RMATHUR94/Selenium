package practice;

class Employee{
	
	int roll;
	String name ;
	int salary;
	
	void initOb(String Fname , int id , int sal)
	{
		roll = id ;
		name = Fname;
		salary = sal;
	}
     void display()
     {
    	 System.out.println(roll +" "+name+" "+salary);
     }

}
public class intiObByMethod {

	public static void main(String[] args) 
	{
	    Employee e1 = new Employee();
	    Employee e2 = new Employee();
	    e1.initOb("ramu",05,25000);
	    e2.initOb("KALU",07,20000);
	    e1.display();
	    e2.display();

	}

}
