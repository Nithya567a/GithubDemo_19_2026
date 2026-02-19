package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		 WebElement src = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		 WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		 Actions a = new Actions(driver);
		 a.dragAndDrop(src, target).perform();
		 Thread.sleep(2000);
		 driver.quit();
		
	}

}
