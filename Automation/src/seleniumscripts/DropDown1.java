package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Nithya%20G/Documents/Course.html");
		
		WebElement ele = driver.findElement(By.id("course"));
		ele.click();
		Thread.sleep(2000);
		Select s = new Select(ele);
		//s.selectByValue("java");
		//s.selectByIndex(1);
		s.selectByVisibleText("Java");
		
		Thread.sleep(2000);
		
		driver.quit();
		
	

	
	}
}
