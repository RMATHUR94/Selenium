package udemyFunctional;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class72 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String[] itemNeeded = { "Cucumber", "Brocolli", "Tomato" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().window().maximize();

		addItems(driver, itemNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();  // //*[text()='PROCEED TO CHECKOUT']
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("r");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

	}

	public static void addItems(WebDriver driver, String[] itemNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String FormattedName = name[0].trim();
			// format it to actual vegitable name cucumber 1kg to "cucumber"//
			// check whether name you have extracted is present in array or note
			// convert array into arrayList

			List itemNeededList = Arrays.asList(itemNeeded);

			if (itemNeededList.contains(FormattedName)) // name changed to formatted name
			{
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				// break; cannot use break

				if (j == 3) {
					break;
				}
			}

		}

	}

}
