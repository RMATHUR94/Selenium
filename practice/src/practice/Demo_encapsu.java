package practice;

class Bank
{
	private int act_no;
	
	
	public void setActno(int accno)
	{
		act_no = accno;
	}
	
	public int getActno()
	{
		return act_no;
	}
}
public class Demo_encapsu {

	public static void main(String[] args)
	{
		Bank axis = new Bank();
		axis.setActno(7894561);
		System.out.println(axis.getActno());

	}

}
