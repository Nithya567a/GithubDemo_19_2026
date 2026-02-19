package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindowAddress {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/popup.php\r\n");

		//handle parent window
		String parentwind = driver.getWindowHandle();
		System.out.println(parentwind);
		driver.switchTo().window(parentwind);
		System.out.println("Parent Window Title: " + driver.getTitle());
		
        System.out.println("----------");
        
		// Click link to open child window
		driver.findElement(By.linkText("Click Here")).click();
		Thread.sleep(2000);

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);

		for (String window : allWindows) {
			driver.switchTo().window(window);
			System.out.println("AllWindow Title: " + driver.getTitle());
		}
//		driver.switchTo().window(parentwind);
//		driver.close();

		System.out.println("----------");

		//Print only child window handle and title
		for (String window : allWindows) {
			if (!window.equals(parentwind)) { // Skip parent window
				driver.switchTo().window(window);
				System.out.println("Child Window Handle: " + window);
				System.out.println("Child Window Title: " + driver.getTitle());
				//driver.close();
			}
		}
		
		
		driver.quit();


	}
}












