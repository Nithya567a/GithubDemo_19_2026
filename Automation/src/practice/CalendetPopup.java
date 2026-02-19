package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendetPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Nithya");
		driver.findElement(By.id("email")).sendKeys("nithya@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		driver.findElement(By.id("textarea")).sendKeys("Bengaluru,karnataka");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("sunday")).click();
		driver.findElement(By.id("monday")).click();
		WebElement country = driver.findElement(By.id("country"));
		Select s = new Select(country);
		s.selectByValue("india");
		WebElement colors = driver.findElement(By.id("colors"));
		Select s1 = new Select(colors);
		s1.selectByValue("green");
		s1.selectByIndex(0);
		s1.selectByVisibleText("Blue");
		WebElement animals = driver.findElement(By.id("animals"));
		Select s2 = new Select(animals);
		s2.selectByValue("cheetah");
		s2.selectByIndex(0);
		s2.selectByVisibleText("Dog");
		//driver.findElement(By.id("datepicker")).sendKeys("20/12/2025");//(//a[@aria-current='false'])[17]
		
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//a[text()='18']")).click();
		driver.findElement(By.xpath("//span[text()='December']")).click();
		driver.findElement(By.xpath("//span[text()='2025']")).click();
		
		
		driver.findElement(By.id("txtDate")).sendKeys("17/01/2025");
				
		
		
	}

}
