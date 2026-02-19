package practice;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformHiddenDivisionPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/modal-dialogs");
		driver.findElement(By.id("showLargeModal")).click();
		WebElement modeltitle = driver.findElement(By.id("example-modal-sizes-title-lg"));
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("closeLargeModal")).click();
		Thread.sleep(2000);
		System.out.println("large model popup closed sucessfully");
		driver.quit();
	}
}
		
		
		

		
	





