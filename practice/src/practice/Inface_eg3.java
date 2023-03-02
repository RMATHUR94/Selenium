package practice;

interface Vehicle
{
	void ChangeGear(int a);
	void SpeedUp(int a);
	void ApplyBreak(int a);
}

 class Bycycle implements Vehicle
{
	int gear;
	int speed;
	public void ChangeGear(int putgear)
	{
		gear = putgear;
	}
	public void SpeedUp(int increment)
	{
		speed = speed + increment;
	}
	public void ApplyBreak(int decrement)
	{
		speed = speed - decrement;
	}
	
	public void PrintState()
	{
		System.out.println(" BYCYCLE Gear is: " + gear + " BYCLCLE Speed is " + speed);
	}
}
 class Byke implements Vehicle
{
	int gear;
	int speed;
	public void ChangeGear(int putgear)
	{
		gear = putgear;
	}
	public void SpeedUp(int increment)
	{
		speed = speed + increment;
	}
	public void ApplyBreak(int decrement)
	{
		speed = speed - decrement;
	}
	public void PrintState()
	{
		System.out.println(" BYKE Gear is: " + gear + " BYKE Speed is " + speed);
	}
}
public class Inface_eg3
{

	public static void main(String[] args) 
	{ 
		Bycycle hero = new Bycycle();
		hero.ChangeGear(2);
		hero.SpeedUp(2);
		hero.ApplyBreak(1);
		hero.PrintState();
		
		Byke b1 = new Byke();
		b1.ChangeGear(3);
	    b1.SpeedUp(5);
	    b1.ApplyBreak(2);
	    b1.PrintState();

	}

}
