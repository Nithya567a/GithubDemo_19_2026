package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PerformAllMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Nithya");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Shetty");
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
	    s.selectByValue("17");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
	    s1.selectByIndex(9);
		Thread.sleep(1000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
	    s2.selectByVisibleText("2002");
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.name("sex"));
		gender.click();
		Thread.sleep(1000);
		
		 driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Nithya@123");
		Thread.sleep(1000);
		
		boolean res = driver.findElement(By.name("firstname")).isDisplayed();
		if(res==true) {
			System.out.println("firstname text field is displayed");
		}else {
			System.out.println("firstname text field is not displayed");
		}
		
		boolean res1 = driver.findElement(By.xpath("//div[text()='New password']")).isEnabled();
		if(res==true) {
			System.out.println("password text field is enabled");
		}else {
			System.out.println("password text field is disabled");
		}
		
		driver.findElement(By.xpath("(//button[text()='Sign up'])[1]")).click();
		
		driver.quit();
		
		
		
	}

}
