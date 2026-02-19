package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to print auto suggestions in google after entering java

public class AutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> allsuggs = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	    int count = allsuggs.size();
	    System.out.println(count);
	    for(WebElement ele:allsuggs) {
	    	String text = ele.getText();
	    	System.out.println(text);
	    }
	    driver.quit();
	}
}
	
	


