package practice;

abstract class vehicle
{
	abstract void start();
		
}
class car extends vehicle
{
	public void start()
	{
		System.err.println("start the car by key press");
	}
}
class bike extends vehicle
{
	public void start()
	{
		System.err.println("start the bike by key");
	}
}

public class DemoAbstct 
{

	public static void main(String[] args)
	{
		car c = new car();
		c.start();
		bike b = new bike();
		b.start();

	}

}
