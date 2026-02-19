package seleniumscripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Nithya%20G/Documents/Course.html");
		
		WebElement ele = driver.findElement(By.id("ide"));
		Select s = new Select(ele);
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("ij");
		Thread.sleep(1000);
		s.selectByVisibleText("Visual Studio");
		Thread.sleep(1000);
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println("Total options: " + allOptions.size());

		for (WebElement opt : allOptions) {
		    System.out.println(opt.getText());
		}

		List<WebElement> selected = s.getAllSelectedOptions();

		System.out.println("Selected options are:");
		for (WebElement opt : selected) {
		    System.out.println(opt.getText());
		}

		WebElement first = s.getFirstSelectedOption();
		System.out.println("First selected: " + first.getText());

		s.deselectByValue("ij");   // removes IntelliJ
		Thread.sleep(1000);

		s.deselectAll();
		
		
		driver.quit();
	}

}
