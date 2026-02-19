package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClickk {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement target = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
		WebElement quit = driver.findElement(By.xpath("//span[text()='Quit']"));
		a.click(quit).perform();
		driver.switchTo().alert().accept();
		driver.quit();
		
		
	}

}
