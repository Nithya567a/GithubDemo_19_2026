package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handlinframes3 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//iframe[1]")).click();
        
		//driver.findElement(By.xpath("//span[text()='NSE']")).click();

		Thread.sleep(2000);

		driver.switchTo().parentFrame();

		driver.findElement(By.xpath("//a[text()='Sign in']")).click();

		Thread.sleep(2000);

		driver.quit();

	}

}
