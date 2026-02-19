package practice;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chatgpt3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		for(int i=0; i<alllinks.size();i++) {
			WebElement ele = alllinks.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
			driver.navigate().to("https://www.flipkart.com/");
			String title1 = driver.getTitle();
			System.out.println(title1);
			@Nullable
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.navigate().to("https://www.amazon.com/");
			@Nullable
			String title2 = driver.getTitle();
			System.out.println(title2);
			@Nullable
			String url1 = driver.getCurrentUrl();
			System.out.println(url1);
			
			driver.quit();
		
		
	}

}
