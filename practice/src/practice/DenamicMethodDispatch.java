package practice;
//we are deciding which method to call in runtime thats why it is called dynamic method dispatch

class A 
{
	public void show()
	{
		System.out.println("into class A method");
	}
}
class B extends A 
{
	public void show()
	{
		System.out.println("into class B method");
	}
}
class C extends A
{
	public void show()
	{
		System.out.println("into class C method");
	}
}

public class DenamicMethodDispatch {

	public static void main(String[] args) 
	{
           A ref1 = new A();
           B ref2 = new B();
           C ref3 = new C();
           
           A obj1;
           
           obj1 = ref1;
           obj1.show();
           
           
           obj1 = ref2;
           obj1.show();
           
           
           obj1=ref3;
           obj1.show();

	}

}
