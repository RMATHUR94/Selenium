package practice;
//The interface contains multiple abstract methods, so write the implementation in implementation classes. 
//If the implementation is unable to provide implementation of all  abstract methods,then declare the implementation class with abstract modifier, 
//and complete the remaining method implementation in next created child classes. 
//It is possible to declare multiple child classes but at final we have complete the implementation of all abstract methods.
interface bank
{
	  void deposit();
	  void withdraw();
	  void loan();
	  void account();
}
abstract class Dev1 implements bank
{
	int cashdep = 1000;
	public void deposit()
	{
		System.out.println(cashdep);
	}
}
abstract class Dev2 extends Dev1
{
	int cashwith = 500;
	public void withdraw()
	{
		System.out.println(cashwith);
	}
}
class Dev3 extends Dev2
{
	public void loan()
	{
		System.out.println("loan no : 1245622");
	}
	public void account()
	{
	  System.out.println("Acc no : 131546512");  	  
	}
}
public class Inface_eg6 {

	public static void main(String[] args) 
	{
		Dev3 d = new Dev3();
		d.deposit();
		d.withdraw();
		d.loan();
		d.account();

	}

}
