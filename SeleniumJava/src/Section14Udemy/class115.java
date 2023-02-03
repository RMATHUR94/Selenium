package Section14Udemy;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class class115 {

	public static void main(String[] args) 
	{
		//click of column name once
		//grab the webelement into a list
		//get the text from that list into a original list
		//sort the original list into a new sorted list
		//compare both original and sorted list return boolean value that list is sorted or not
		
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");

        WebDriver driver=new ChromeDriver();		         
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
       
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//tr/th[1]")).click();
        
       List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
     
       //get the text from that list into a original list
       List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
     
       //sort the original list into a new sorted list
       List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
       
     //compare both original and sorted list return boolean value that list is sorted or not  
       Assert.assertTrue(originalList.equals(sortedList));
       
    //scan the name column with getText ->Rice->Print the price of the veggies
       
      List<Object> price = elementList.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
      price.forEach(a->System.out.println(a));
	}

	private static Object getPriceVeggie(WebElement s) 
	{
		String beansprice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return beansprice;
	}

}









