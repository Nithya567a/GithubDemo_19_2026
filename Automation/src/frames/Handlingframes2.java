package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		driver.switchTo().frame(2);
		String email = driver.findElement(By.xpath("//p[contains(text(),'Admin@gmail.com')]")).getText();
		String pwd   = driver.findElement(By.xpath("//p[contains(text(),'Admin@1234')]")).getText();

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("confirm-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

	}

}
