package udemyFunctional;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class71 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/home/vyrazu-66/Downloads/chromedriver_linux64 (1)/chromedriver");

		WebDriver driver = new ChromeDriver();

		String[] itemNeeded = { "Cucumber", "Brocolli", "Tomato" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		driver.manage().window().maximize();

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String FormattedName = name[0].trim();
			// format it to actual vegitable name cucumber 1kg to "cucumber"//
			// check whether name you have extracted is present in array or note 
			// convert array into arrayList

			List itemNeededList = Arrays.asList(itemNeeded);

			int j = 0;
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
