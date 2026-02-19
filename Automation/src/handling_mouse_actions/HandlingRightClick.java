package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		driver.findElement(By.xpath("//button[text()='Right Click']")).click();
		WebElement target = driver.findElement(By.xpath("//button[text()='Right Click']"));
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='No']")).click();
//		WebElement no = driver.findElement(By.xpath("//div[text()='No']"));
//		a.click(no).perform();
		WebElement msg = driver.findElement(By.xpath("//span[text()='You selected \"No\"']"));
		String text = msg.getText();
		System.out.println(text);
		String color = msg.getCssValue("color");
		System.out.println(color);
		driver.quit();
		
		
		
		
	}

}
