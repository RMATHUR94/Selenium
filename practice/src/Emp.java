
 class Bank
{
	private long currBalance = 0 ;
	
	 long bank_id;
	 String name;
	
	public long getBalance(long id)
	{
		if(this.bank_id == id)
		{
			return currBalance;
		}
		return -1 ;
	}
	
	public void setBalance(long balance , long id )
	{
		if(this.bank_id==id)
		{
			currBalance = currBalance+balance;
		}
		
		
	}
	
}

public class Emp {

	public static void main(String[] args)
	{
		Bank employee = new Bank();
		
		employee.bank_id =1111;
		employee.name = "ChamanData";
		
		employee.getBalance(1234);
		employee.setBalance(5000, 1111);
		long emp_balance = employee.getBalance(1111);
		
		System.out.println("current Balance"+emp_balance);

	}

}
