package practice;

class Encapsulate
{
	private String name;
	private int rollNo;
	private int Age;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getRollNo() 
	{
		return rollNo;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
//	public int getAge()  not giving priority to access the age.
//	{
//	
//		return Age;
//	}
	public void setAge(int age) 
	{
		if(age>0)
		Age = age;
	}	
}

public class Demo_encapsuEg2 
{

	public static void main(String[] args)
	{
		Encapsulate  e = new Encapsulate();
		e.setName("Mathur");
		e.setAge(25);
		e.setRollNo(61);
		
		System.out.println(e.getName());
		//System.out.println(e.getAge());
		System.out.println(e.getRollNo());

	}

}
