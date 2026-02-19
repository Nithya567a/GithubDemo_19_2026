package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranCssLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nithya%20G/Desktop/Demo.html");

		WebElement element = driver.findElement(By.cssSelector("a[id='link1']"));
		element.click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElement(By.cssSelector("a[name='Instagram']")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		driver.findElement(By.cssSelector("a[href='https://www.fb.com']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.quit();
	}

}
