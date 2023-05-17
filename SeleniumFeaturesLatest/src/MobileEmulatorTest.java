import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v111.network.Network;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

public class MobileEmulatorTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		        
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		DevTools devTools = driver.getDevTools();
		
		devTools.createSession();
		
		devTools.send(Emulation.setDeviceMetricsOverride(800, 1000, 50,true,Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();
		//Network.getRequestPostData
		//Network.getRequestPostData(null)
		
	}

}
///home/vyrazu-66/Downloads/chromedriver_linux64 (1)/