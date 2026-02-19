package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.linkText("Drag Position")).click();
		WebElement mobilecharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobilecover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement mobileaccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(mobilecharger, mobileaccessories).perform();
		Thread.sleep(2000);
		a.dragAndDrop(mobilecover, mobileaccessories).perform();
		
		//a.clickAndHold(mobilecharger).moveToElement(mobile).release().perform();
		//Thread.sleep(2000);
		//a.clickAndHold(mobilecover).moveToElement(mobile).release().perform();
		
		List<WebElement> accessories = driver.findElements(By.xpath("//div[text()='Laptop Charger' or text()='Laptop Cover']"));
		WebElement laptopaccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));

		for(WebElement laptop:accessories) {
			a.clickAndHold(laptop).moveToElement(laptopaccessories).release().perform();
		}
		
		
		
//		WebElement laptopcharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
//		WebElement laptopcover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
//		WebElement laptop = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
//		a.clickAndHold(laptopcharger).moveToElement(laptop).release().build().perform();
//		Thread.sleep(2000);
//		a.clickAndHold(laptopcover).moveToElement(laptop).release().build().perform();
//        Thread.sleep(2000);
        
		driver.quit();


	}
}
