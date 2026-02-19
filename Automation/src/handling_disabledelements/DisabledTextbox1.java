package handling_disabledelements;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextbox1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Nithya%20G/Documents/t2.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('fn').value='nithya'");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('ln').value='shetty'");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
