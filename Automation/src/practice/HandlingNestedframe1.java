package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedframe1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.id("Click"));
		button.click();
		String btntext=button.getText();
		System.out.println(btntext);
		
		driver.quit();
	}

}
