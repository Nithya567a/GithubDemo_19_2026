package practice;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Open Facebook login page, enter username, enter password, clear password, print placeholder 
//attributes of username and password fields, click the login button, and finally print whether 
//the login button is displayed and enabled.

public class Chatgpt4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	    WebElement email = driver.findElement(By.name("email"));
	    email.sendKeys("nithyashetty@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Nithya@123");
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		@Nullable
		String attValue = email.getAttribute("class");
		System.out.println(attValue);
		@Nullable
		String attValue1 = password.getAttribute("class");
		System.out.println(attValue1);
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();
	
		boolean res = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		if(res==true) {
			System.out.println("Displayed");
		}else {
			System.out.println("not displayed");
		}
		
		boolean res1 = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		if(res1==true) {
			System.out.println("Enabled");
		}else {
			System.out.println("disabled");
		}
		driver.quit();
	}

}
