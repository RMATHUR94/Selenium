package Section10;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Multiple Windows")).click();
	    driver.findElement(By.cssSelector("a[href*='windows']")).click();//a[href='/windows'] = we can use css selector also //
	    Set<String> handles = driver.getWindowHandles();
	    java.util.Iterator<String> pages =handles.iterator();
	    String parentId = pages.next();
		String childId = pages.next();
	    
	    driver.switchTo().window(childId);
	    System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
	    driver.switchTo().window(parentId);
	    System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());


	}

}
