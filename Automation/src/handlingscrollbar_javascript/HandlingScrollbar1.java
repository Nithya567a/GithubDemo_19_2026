package handlingscrollbar_javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import jdk.javadoc.internal.doclets.toolkit.util.JavaScriptScanner;

public class HandlingScrollbar1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("(//a[contains(@title,'India Women vs Sri Lanka Women')])[3]")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,-500)");
		Thread.sleep(1000);
		
		driver.quit();

	}

	
}
