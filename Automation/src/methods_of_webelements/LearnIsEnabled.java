package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		boolean res = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		if(res==true) {
			System.out.println("login button is enabled in facebook");
		}else{
			System.out.println("login button is not enabled in facebook");
		}
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		boolean res1 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		if(res1==true) {
			System.out.println("login button is enabled in instagram");
		}else{
			System.out.println("login button is not enabled in instagram");
		}
		driver.quit();
	}
}
