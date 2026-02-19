package assignments;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindowPopup2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		Thread.sleep(1000);
		//	    driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		//		Thread.sleep(2000);

		String parentwin = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Thread.sleep(2000);

		for(String wid:allwindows) {
			driver.switchTo().window(wid);
			if (driver.getTitle().contains("Luxury Watch")) {
				driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
				break;
			}
		}
	}

}


