package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromLocal {

	public static void main(String[] args) throws IOException 
	{
		FileReader file = new FileReader("/home/vyrazu-66/Documents/f_day");
		
		BufferedReader fileInput = new BufferedReader(file);
		
		for(int counter = 1 ; counter <=3 ;counter++)
		{
			System.out.println(fileInput.readLine());
		}
		fileInput.close();
	}

}
