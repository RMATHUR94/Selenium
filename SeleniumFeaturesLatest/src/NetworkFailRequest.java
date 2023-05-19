import java.lang.reflect.Array;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v111.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v111.network.model.ErrorReason;
import org.openqa.selenium.devtools.v112.fetch.Fetch;

import com.google.common.base.Optional;

public class NetworkFailRequest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");

		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		// java.util.Optional<java.lang.String> urlPattern

		Optional<List<RequestPattern>> patternss = Optional
				.of(Array.asList(new RequestPattern(Optional.of("*GetBook*"), Optional.empty(), Optional.empty())));

		devTools.send(Fetch.enable(patternss, Optional.empty()));

		devTools.addListener(Fetch.requestPaused(), request -> {
			devTools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
		});

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink*='library']")).click();
		Thread.sleep(3000);
	}

}
