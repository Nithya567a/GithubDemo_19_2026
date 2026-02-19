package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranSendKeys {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//sendkeys() is used to enter the value in a textbox, we can also use keys class to 
		driver.findElement(By.name("q")).sendKeys("Apple i phone 17 pro max"+Keys.ENTER);
		driver.quit();
	}

}



