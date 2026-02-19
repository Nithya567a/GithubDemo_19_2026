package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleRightClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
		Thread.sleep(2000);
		
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		edit.click();
	
		Alert a1 =driver.switchTo().alert();
		a1.accept();
		//System.out.println(a1.getText());
		Thread.sleep(2000);
		
		
	}

}
