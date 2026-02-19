package seleniumscripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class LearnWebElementScreenshot {
	@Test
	public void ScreenaShot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		
		WebElement amazon = driver.findElement(By.id("nav-logo-sprites"));
		
		File temp = amazon.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/img.png");
	    FileHandler.copy(temp, dest);
	    driver.quit();
	  
		
		
	
		
	}

}
