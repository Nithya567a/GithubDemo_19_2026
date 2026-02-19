package seleniumscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> allsugs = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		
		int count = allsugs.size();
		System.out.println(count);
		
		for(WebElement ele:allsugs) {
			String text = ele.getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
