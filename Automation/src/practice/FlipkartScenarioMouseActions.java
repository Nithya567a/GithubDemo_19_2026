package practice;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartScenarioMouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions a = new Actions(driver);
		a.moveToElement(fashion).perform();
		Thread.sleep(1000);
		
		WebElement foot = driver.findElement(By.linkText("Men Footwear"));
        a.moveToElement(foot).perform();
        
       driver.findElement(By.linkText("Men's Sports Shoes")).click();
      
	   String title = driver.getTitle();
       
       if(title.equals("Men's Sports Shoes")) {
    	System.out.println("Men's Sports Shoes page is Displayed");   
       }else {
    	   System.out.println("Men's Sports Shoes page is Displayed");   
       }
 List<WebElement> checkboxces = driver.findElements(By.xpath("//div[text()='Brand']/../..//input[@type='checkbox']"));
       
     System.out.println(checkboxces.size());
		Thread.sleep(2000);
		
		for(WebElement ele:checkboxces) {
		ele.click();
		}

	}

}
