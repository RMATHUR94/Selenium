package Section11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.transform.Source;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (2)/chromedriver");
		    WebDriver driver = new ChromeDriver();  
		    driver.get("https://www.makemytrip.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    WebElement popup = driver.findElement(By.cssSelector(".autopop__wrap.autopop__wrap__new.makeFlex.column.defaultCursor"));
		    WebElement login = driver.findElement(By.xpath("//li[@data-cy='account']"));
		    if(popup.isDisplayed())
		    {
		    	login.click();
		    }
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		    
		    WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		    source.sendKeys("Mumbai");
		    Thread.sleep(3000);
		    source.sendKeys(Keys.ARROW_DOWN);
		    source.sendKeys(Keys.ENTER);
		    
		    driver.findElement(By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget ']")).click();
		    WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To']"));
		    dest.sendKeys("Bangkok");
		    Thread.sleep(3000);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    dest.sendKeys(Keys.ARROW_DOWN);
		    dest.sendKeys(Keys.ENTER);
		    
		    driver.findElement(By.xpath("//label[@for='departure']")).click();
		    WebElement month = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));
		    while(!month.getText().contains("August"))
		    {
		    	driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		    	System.out.println(month.getText());
		    }
		    
		   List<WebElement> element = driver.findElements(By.cssSelector("div[class='dateInnerCell']"));
		    
		    int dateCount = driver.findElements(By.cssSelector("div[class='dateInnerCell']>p")).size();
		    
		    for(int i=0 ; i<dateCount ; i++)
		    {
		    	int day =05;
		    	String date =  driver.findElements(By.cssSelector("div[class='dateInnerCell']>p")).get(i).getText();
		    	
		    	if(date.equalsIgnoreCase("05"))
		    	{
		    		driver.findElements(By.cssSelector("div[class='dateInnerCell']>p")).get(i).click();
		    		System.out.println(date);
		    		break;
		    	}
		    }
		    /*List<WebElement> days = driver.findElements(By.className("DayPicker-Day"));

		    int countOfDays = driver.findElements(By.className("DayPicker-Day")).size();



		    for (int i = 0; i < countOfDays; i++) {

		    String day = driver.findElements(By.className("DayPicker-Day")).get(i).getText();
            Thread.sleep(2000);
		    if (day.contains("28")) {

		    driver.findElements(By.className("DayPicker-Day")).get(i).click();
		    break;

		    }

		    }*/
		    
	}

}
