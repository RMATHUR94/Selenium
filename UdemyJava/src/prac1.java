import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");

		WebDriver driver = new ChromeDriver();

		String[] item = { "Beetroot","Brinjal","Carrot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().window().maximize();
		
		List<WebElement>  products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i = 0 ; i< products.size();i++)
		{
			String [] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			List itemList = Arrays.asList(item);
			
			int j = 0;
			if(itemList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				
				if(j==3)
				{
					break;
				}
				
			}
			
			
			
			
			
		}
		
		

}
}