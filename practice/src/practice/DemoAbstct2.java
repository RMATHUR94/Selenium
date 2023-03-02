package practice;

abstract class Bike
{
	public abstract void gearChange();	
	public void fuel()
	{
		System.out.println("petrol");
	}
}
    
class Honda extends Bike
{
	public void gearChange()
	{
		System.out.println("Manual");
	}
}
class yamaha extends Bike
{
	public void gearChange()
	{
		System.out.println("Auto-M");
	}
}
public class DemoAbstct2 
{

	public static void main(String[] args) 
	{
		Honda v1 = new Honda();
		v1.fuel();
		v1.gearChange();
		yamaha v2 = new yamaha();
		v2.fuel();
		v2.gearChange();
				
	}

}
