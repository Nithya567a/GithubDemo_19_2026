package practice;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartScenario {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com");

		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions a = new Actions(driver);
		a.moveToElement(fashion).perform();
		Thread.sleep(1000);
		
		WebElement foot = driver.findElement(By.linkText("Men Footwear"));
        a.moveToElement(foot).perform();
        
       driver.findElement(By.linkText("Men's Sports Shoes")).click();
     
//     driver.findElement(By.xpath("//div[text()='Brand']")).click();
//     driver.findElement(By.xpath("//div[text()='ADIDAS']")).click();
     @Nullable
	   String title = driver.getTitle();
     if(title.contains("Sports Shoes")) {
    	    System.out.println("Sports Shoes page is displayed");
    	} else {
    	    System.out.println("Sports Shoes page is NOT displayed");
    	}
     driver.quit();
     
       

	}

}
