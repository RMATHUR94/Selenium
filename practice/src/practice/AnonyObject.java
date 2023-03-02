package practice;

import java.util.Scanner;

public class AnonyObject {
	//Let's see the full example of an anonymous object in Java.
   
	void fact(int n)
    {
	
	 int fact=1;  
	 for(int i=1;i<=n;i++)
	 {  
	   fact=fact*i;  
	 } 
	 System.out.println(fact);
    }

	 
	public static void main(String[] args)
	{
      
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		new AnonyObject().fact(x);
	}

}
