package practice;

 interface linos
{
    void osdesign();
   
   default void author()
   {
	   System.out.println("Auth:name");
   }
   private void price()
   {
	   System.out.println("5$");
   }
}

 interface Maxprint
 {
	void marketing();
	
 }
 class newOs implements linos,Maxprint
{
	public void osdesign()
	{
		System.out.println("For android");
	}
	public void marketing()
	{
		System.out.println("For Ios");
	}
}
public class Inface_eg1 
{

	public static void main(String[] args) 
	{
		newOs u = new newOs();
		u.author();
		u.osdesign();
		u.marketing();
		

	}

}
