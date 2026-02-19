package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllFlipKartLinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		Thread.sleep(2000);
		
		System.out.println(alllinks.size());
		
		for(int i=0; i<alllinks.size(); i++) {
			
			WebElement links = alllinks.get(i);
			
			String text = links.getText();
			System.out.println(text);
		}
		driver.quit();
		
	}

}
