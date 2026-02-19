package handling_iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Nithya%20G/Documents/t1.html");
		driver.findElement(By.id("un")).sendKeys("Bin Laden");
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("fn")).sendKeys("Nithya");
		driver.switchTo().frame(0);
		driver.findElement(By.id("pwd")).sendKeys("nithya@123");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("ln")).sendKeys("shetty");
		WebElement frameaddress = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frameaddress);
		driver.findElement(By.id("pwd2")).sendKeys("twin tower");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("pwd1")).sendKeys("Twin");

		driver.quit();
	}

}
