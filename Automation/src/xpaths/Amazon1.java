package xpaths;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		//List<WebElement> ele = driver.findElements(By.xpath("(//div[@class='a-cardui-header'])[2]/following-sibling::div//a[contains(@class,'image-window')]"));
		
		////h2[contains(text(),'Bulk order discounts')]/../..//div/div/div
List<WebElement> ele = driver.findElements(By.xpath("//h2[contains(text(),'Appliances for your home')]/ancestor::div[contains(@class,'a-cardui')]//span[contains(@class,'a-color-base')]"));
		for(int i=0; i<ele.size(); i++) {
			String text = ele.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
