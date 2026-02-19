package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		//driver.findElement(By.id("apple-signin-button")).click();
		
		String parentwid = driver.getWindowHandle();
		//System.out.println(driver.getTitle());
		Set<String> allwid = driver.getWindowHandles();
		//System.out.println(driver.getTitle());
		
		for(String wid:allwid) {
			driver.switchTo().window(wid);
			Thread.sleep(2000);
			driver.close();
			
		}
	}
}		
		
		
	


