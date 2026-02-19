package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allsugs = driver.findElements(By.xpath("//span[text()='iphone')"));
		
		System.out.println(allsugs.size());
		
		for(WebElement ele:allsugs) {
			
			String text = ele.getText();
			System.out.println(text);
			
		}
		driver.quit();
	}

}
