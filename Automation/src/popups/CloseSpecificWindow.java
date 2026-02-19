package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		//driver.findElement(By.id("apple-signin-button")).click();
		
		String parentwind = driver.getWindowHandle();
		Set<String> allwid = driver.getWindowHandles();
		
		for(String window:allwid) {
			driver.switchTo().window(window);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Google")) {
				driver.close(); //it is used to close specific window
				//break;//it is used to transfer the control to the specific window
			}
		}
	}

}
