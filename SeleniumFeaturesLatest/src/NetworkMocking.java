import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.fetch.Fetch;

public class NetworkMocking {

	//issue in exceution
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");
		        
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		
		devTools.addListener(Fetch.requestPaused(), request->
		{
			if(request.getRequest().getUrl().contains("shetty"))
			{
			   String mockedUrl = request.getRequest().getUrl().replace("=shetty","=BadGuy");
				
				System.out.println(mockedUrl);
				
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(mockedUrl), Optional.empty(), Optional.empty(), Optional.empty()));
			}
			driver.get("https://rahulshettyacademy.com/angularAppdemo/");
			driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
			
		});
		

	}

}
