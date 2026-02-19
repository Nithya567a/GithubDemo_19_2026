package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class HandleScrollBar {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("India",Keys.ENTER);
		WebElement government = driver.findElement(By.id("Government"));
		Actions a = new Actions(driver);Thread.sleep(2000);
		a.scrollByAmount(0, 5000).perform();
		Thread.sleep(2000);
		a.scrollToElement(government).perform();
		Thread.sleep(2000);
		a.scrollByAmount(0, -5000).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
