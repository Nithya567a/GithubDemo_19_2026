package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://demoapps.qspiders.com/");
//		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
//		driver.findElement(By.xpath("//section[text()='Frames']")).click();
//		driver.findElement(By.xpath("//section[text()='iframes']")).click();
//		driver.findElement(By.xpath("//a[text()='Nested iframe']")).click();
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		WebElement ele = driver.findElement(By.xpath("//iframe[1]"));
		driver.switchTo().frame(ele);
		String email = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		String pwd = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]")).getText();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys(pwd);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	
		
		
		
	}

}
