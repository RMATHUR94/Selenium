import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkCount93 {

	public static void main(String[] args) 
	{
		//1 . Give me the count of of links of the page.
		//2. Get me counts of links present in the footer section.
		//3. links counts of footer section first coloumn.
		//4. click on each link , check if the pages are opening or not.

	    System.setProperty("webdriver.chrome.driver","/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        //1.
        System.out.println(driver.findElements(By.tagName("a")).size());
        //2.
     
        WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver Scope
        System.out.println(footerdriver.findElements(By.tagName("a")).size());   
        //3.
        WebElement columnDriver = footerdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
        System.out.println(columnDriver.findElements(By.tagName("a")).size());
        
        //4. 
        for(int i = 1;i<columnDriver.findElements(By.tagName("a")).size();i++)
        {
        	String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
        }
	}

}
