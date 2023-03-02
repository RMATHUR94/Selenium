package practice;

public class House 
{
	String houseName;
    int houseNo ;
    
    House(String n , int no)
    {
    	houseName = n;
    	houseNo = no;
    }
    
    void disp()
    {
       System.out.println(houseName + " is located at " +houseNo );
    }
	public static void main(String[] args) 
	{
		House a1 = new House("BALA",15);
		House a2 = new House("Hulu",8);		

		a1.disp();
		a2.disp();
	}

}
