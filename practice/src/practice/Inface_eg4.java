package practice;

interface Hereku
{
	public final int x = 10;
	
	default void work()
	{
       System.out.println("football fever");		
	}
   public static void result()
   {
	   System.out.println("You are passed.");
   }
}


public class Inface_eg4 implements	Hereku
{

	public static void main(String[] args) 
	{
        
		Inface_eg4 t1 = new Inface_eg4();
		t1.work();
		
		Hereku.result();  // caliing by class name bevause of static mehtods
	}

}
