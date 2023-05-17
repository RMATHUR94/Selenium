import java.util.Optional;

import org.asynchttpclient.Request;
import org.asynchttpclient.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v111.network.Network;

public class NetworkLogActivity {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		        
		ChromeDriver driver = new ChromeDriver();
		//log file --> 

		DevTools devtools = driver.getDevTools();
		devtools.createSession(); 
		devtools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
		
		devtools.addListener(Network.requestWillBeSent(), request ->
		{
		       Request req = (Request) request.getRequest();
		         System.out.println(req.getUrl());
		
			
		});
		
		//Event will get fired-
		devtools.addListener(Network.responseReceived(), response ->
		{
			Response res  = (Response) response.getResponse();
			System.out.println(res.getUri());
			System.out.println(res.getStatusCode());
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
		
		
		
		
	}

}
