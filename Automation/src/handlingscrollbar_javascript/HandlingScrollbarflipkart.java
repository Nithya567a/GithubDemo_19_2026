package handlingscrollbar_javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollbarflipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone')])[5]"));
		Point p = ele.getLocation(); int XAxis=p.getX(); int YAxis=p.getY();
		System.out.println(XAxis);
		System.out.println(YAxis);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo"+p);
		//js.executeScript("window.scrollBy(0,1365)");
		driver.quit();
	}

}
