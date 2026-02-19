package xpaths;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//div[text()='Top picks of the sale']/../../../../../../../..//div[contains(@style,'place-items')]"));
		
		for(int i=0; i<ele.size(); i++) {
			String text = ele.get(i).getText();
			System.out.println(text);
		}
		driver.quit();

}
}
