package handlingscrollbar_javascript;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cricbuzz.com/");

		WebElement ele = driver.findElement(By.xpath("//div[text()='FOLLOW US ON']"));
		Point p = ele.getLocation(); int xAxis=p.getX(); int yAxis=p.getY();
		System.out.println(xAxis);
		System.out.println(yAxis);
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo"+p);
		//js.executeScript("window.scrollTo(0,8139)");
		Thread.sleep(2000);
		driver.quit();

	}

}
