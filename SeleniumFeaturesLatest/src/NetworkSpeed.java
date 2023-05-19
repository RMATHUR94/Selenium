import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v111.network.Network;
import org.openqa.selenium.devtools.v111.network.model.ConnectionType;

import com.google.common.base.Optional;

public class NetworkSpeed {
//error on 21 & 22
	public static void main(String[] args)
	{
		//how can we reduce the network connection speed
		//3000 mili sec = 3 sec  , 20000 bytes throghput upload thoghput=100000
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		        
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		devTools.send(Network.emulateNetworkConditions(false,3000,20000, 100000,Optional.of(ConnectionType.ETHERNET)));
        long startTime = System.currentTimeMillis();
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		driver.close();
	}

}
