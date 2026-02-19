package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleScrollbar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Starting ₹70,348')]"));
		Actions a =new Actions(driver);
		a.scrollByAmount(0,4000).perform();
		Thread.sleep(2000);
		a.scrollToElement(ele).perform();
		Thread.sleep(2000);
		a.scrollByAmount(0, -3000).perform();
		Thread.sleep(2000);
		driver.quit();
		 
		 
	}

}
