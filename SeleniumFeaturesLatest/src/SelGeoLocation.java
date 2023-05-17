import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class SelGeoLocation {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		        
		ChromeDriver driver = new ChromeDriver();
		// Madrid : 40 3

		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		Map<String,Object> coordinates = new HashMap<String,Object>();
		coordinates.put("latitude",40);
		coordinates.put("longitude",3);
		coordinates.put("accuracy",1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		String title = driver.findElement(By.cssSelector(" default-ltr-cache-qsjwmk")).getText();
		System.out.println(title);
		

	}

}
