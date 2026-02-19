package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.name("policynumber")).sendKeys("123");
		WebElement ele = driver.findElement(By.name("dob"));
		ele.click();
		//driver.findElement(By.xpath("(//label[@for='password'])[1]")).click();
		driver.findElement(By.xpath("//option[text()='Jul']")).click();
		driver.findElement(By.xpath("//option[text()='1983']")).click();
		driver.findElement(By.xpath("//a[text()='7']")).click();
		
		driver.findElement(By.name("alternative_number")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
		Thread.sleep(2000);
		
		boolean res = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(res==true) {
			System.out.println("error msg displayed");
		}else {
			System.out.println("error msg not displayed");
		}
		driver.quit();
	}

}
