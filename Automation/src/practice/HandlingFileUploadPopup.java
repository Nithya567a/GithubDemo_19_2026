package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Nithya%20G/Documents/naukri.html");
		Thread.sleep(2000);
		driver.findElement(By.id("upload_resume")).sendKeys("C:\\Users\\Nithya G\\Downloads\\Nithya_G_Resume (1).pdf");
	
	}

}
