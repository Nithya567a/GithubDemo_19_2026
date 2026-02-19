package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handletab {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+Keys.ENTER);
		driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();

		String parentwind = driver.getWindowHandle();
		Set<String> allwind = driver.getWindowHandles();

		for(String window:allwind) {
			if(!window.equals(parentwind)) {
				driver.switchTo().window(window);

			}
		}
		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String text = price.getText();
		System.out.println(text);

		driver.quit();

	}

}

/*
 *   // ================= WINDOW CLOSE OPTIONS =================

        // OPTION 1: close ONLY child window
        // driver.close();
        // driver.switchTo().window(parentwind);

        // OPTION 2: close ONLY parent window
        // driver.switchTo().window(parentwind);
        // driver.close();

        // OPTION 3: close BOTH parent + child windows
        driver.quit();
*/