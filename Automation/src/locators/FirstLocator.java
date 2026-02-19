package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nithya%20G/Desktop/Demo.html");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.tagName("a"));
		element.click();//fb using tagname
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.id("link2"));
		element1.click();//insta using id
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.name("facebook"));
		element2.click();//fb using name
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.className("Instagram_link"));
		element3.click();//insta using classname
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.linkText("Facebook"));
		element4.click(); //fb using linkText
		driver.navigate().back();
		WebElement element5 = driver.findElement(By.partialLinkText("Insta"));
		element5.click();//insta using partial linkText
		
		driver.quit();



	}

}
