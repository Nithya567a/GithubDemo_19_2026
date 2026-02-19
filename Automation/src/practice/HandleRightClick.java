package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleRightClick {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		/*
		WebElement target = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a = new Actions(driver);
//		The driver is passed because the Actions class needs to know which browser session it should 
//		perform the mouse or keyboard actions on.
		a.contextClick(target).perform();
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		//a.click(edit).perform();
		edit.click();
		Alert a1=driver.switchTo().alert();
		a.accept();
		
		System.out.println(a1.getText());
		*/
		/*
		WebElement target = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		copy.click();
		
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		*/
		
		WebElement target = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
		
		WebElement paste = driver.findElement(By.xpath("//span[text()='Paste']"));
		paste.click();
		System.out.println("Alert pop is displayed");
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.quit();
		
		
	}

}
