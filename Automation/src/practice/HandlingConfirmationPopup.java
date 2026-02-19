package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmButton")).click();
	
		Alert a = driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		//a.accept();
		a.dismiss();
		*/
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		//a.accept();
		a.dismiss();
		
		//driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		//driver.get("https://testautomationpractice.blogspot.com/");
		
		
		driver.quit();
		
	}

}
