package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    WebElement mail = driver.findElement(By.id("email"));
	    Thread.sleep(2000);
	    mail.sendKeys("nithya@gmail.com");
	    Thread.sleep(2000);
	    mail.clear();
	    mail.sendKeys("nithyashetty@gmail.com");
	    Thread.sleep(2000);
	    WebElement pwd = driver.findElement(By.id("pass"));
	    pwd.sendKeys("Nithya@123");
	    Thread.sleep(2000);
	    driver.quit();
	    
	}

}
