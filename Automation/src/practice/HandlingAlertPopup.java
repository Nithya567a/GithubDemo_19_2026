package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		*/
		
		/*
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		a.accept();
		*/
		/*
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		Thread.sleep(2000);
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		a.accept();
		*/
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("alertBtn")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		a.accept();
		driver.quit();
	}

}
