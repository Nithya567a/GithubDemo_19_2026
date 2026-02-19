package handling_disabledelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Nithya%20G/Documents/t1.html");
		driver.findElement(By.id("un")).sendKeys("1324");
		Thread.sleep(2000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('pwd').value='4321'");
		Thread.sleep(1000);
		driver.quit();
		
	}

}
