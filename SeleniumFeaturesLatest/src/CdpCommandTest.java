import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

public class CdpCommandTest {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		        
		ChromeDriver driver = new ChromeDriver();
		
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		Map<String, Object> deviceMetrics = new HashMap<String, Object>();
		deviceMetrics.put("width", 428);
		deviceMetrics.put("height", 926);
		deviceMetrics.put("deviceScaleFactor", 50);
		deviceMetrics.put("mobile", true);
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		
		driver.findElement(By.cssSelector(".navbar-toggler")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();
		
	}

}
