package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsEnabled {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement loginbtn = driver.findElement(By.xpath("//span[text()='Login']"));
		loginbtn.click();
		boolean res = driver.findElement(By.xpath("//button[text()='Request OTP']")).isEnabled();
		if(res==true) {
			System.out.println("Enabled");
		}else {
			System.out.println("disabled");
		}
		driver.quit();
		
	}
	
	
	

}
