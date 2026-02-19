package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");

		//handle parent handle 
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//button[text()='New Window']")).click();
		//Thread.sleep(2000);

        //handle all windows , parent+child windows
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);

		for(String window:allwindows) {
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			System.out.println(driver.getTitle());
		}

		for(String window:allwindows) {
			if(!window.equals(parentwindow)) {
				driver.switchTo().window(window);
				System.out.println(window);
				System.out.println(driver.getTitle());
			}
		}
		//driver.quit();

	}
}
