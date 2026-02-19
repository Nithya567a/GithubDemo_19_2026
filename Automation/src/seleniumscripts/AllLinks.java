package seleniumscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		int count = alllinks.size();
		System.out.println(count);

		for(int i=0; i<count; i++) {
			WebElement ele = alllinks.get(i);

			String text = ele.getText();

			System.out.println(text);
		}
		driver.quit();
	}

}
