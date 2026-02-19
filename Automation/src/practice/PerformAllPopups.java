package practice;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PerformAllPopups {
	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("---disable notifications");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("alertBtn")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = a.getText();
		System.out.println(text);
		a.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmBtn")).click();
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		String text1 = a1.getText();
		System.out.println(text1);
		a1.dismiss();
		
		driver.findElement(By.id("promptBtn")).click();
		Thread.sleep(2000);
		Alert a2=driver.switchTo().alert();
		String text2 = a1.getText();
		System.out.println(text2);
		a2.sendKeys("Selenium");
		a2.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\Nithya G\\Downloads\\Nithya_G_Resume.pdf");
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
	
	}
}
/*
 * Can Selenium handle notification popups?
No, Selenium cannot handle notification popups directly. We handle 
them using browser configurations like ChromeOptions.
 */


