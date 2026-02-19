package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingHiddenDivisonPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	    driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
	    driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("Nithya");
		driver.findElement(By.name("email")).sendKeys("nithyagdevang@gmail.com");
		WebElement ele = driver.findElement(By.id("prod"));
		Select s= new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.name("message")).sendKeys("It's a good product");
		driver.findElement(By.xpath("//button[text()='X']")).click();
		//driver.quit();
		
		
		
		
		
		
	}

}
