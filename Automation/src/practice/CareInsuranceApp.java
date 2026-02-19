package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranceApp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.name("dob")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s1 = new Select(month);
		s1.selectByIndex(6);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1983");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='7']")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("alternative_number")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
		Thread.sleep(2000);

		boolean res = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(res==true) {
			System.out.println("Error Message displayed");
		}else {
			System.out.println("Error Message not displayed");
		}
		driver.quit();
	}

}
