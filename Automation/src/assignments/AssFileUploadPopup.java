package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssFileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fullName")).sendKeys("Nithya");
		driver.findElement(By.id("emailId")).sendKeys("nithyagdevang@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Nithya@123");
		driver.findElement(By.id("mobile")).sendKeys("6363825479");
		driver.findElement(By.id("city")).sendKeys("Bengaluru");
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\Nithya G\\Downloads\\Nithya_G_Resume.pdf");
		//driver.findElement(By.xpath("//label[text()='Enter your skills']")).click();
		//driver.findElement(By.xpath("//option[text()='HTML']")).click();
		WebElement skill = driver.findElement(By.xpath("//select[@aria-invalid='false']"));
		Select s= new Select(skill);
		s.selectByIndex(0);
		Thread.sleep(2000);
		driver.quit();


	}

}
