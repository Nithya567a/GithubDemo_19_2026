package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//write a script to print all the links in a web page

public class AllLinks {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
		for(int i=0; i<alllinks.size(); i++) {
			
			WebElement ele = alllinks.get(i);
			String text = ele.getText();
			System.out.println(text);
			
		}
		driver.quit();
	}

}
