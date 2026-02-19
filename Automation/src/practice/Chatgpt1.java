package practice;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Open Flipkart → print title → print URL → refresh page → close browser.
public class Chatgpt1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	
		String title = driver.getTitle();
		System.out.println(title);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		System.out.println(alllinks.size());
		
		for(int i =1; i<alllinks.size(); i++) {
			
			WebElement ele = alllinks.get(i);
			
			String text = ele.getText();
			
			System.out.println(text);
			
			//driver.navigate().refresh();
		}
		driver.navigate().refresh();
			
			driver.quit();
		
			
		
		
	}

}
