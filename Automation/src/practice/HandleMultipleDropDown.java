package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultipleDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Nithya%20G/Documents/Course.html");
		WebElement idenameElement = driver.findElement(By.id("ide"));
		Select s = new Select(idenameElement);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("ij");
		Thread.sleep(2000);
		s.selectByVisibleText("Visual Studio");
		Thread.sleep(2000);
		
//		s.deselectByIndex(0);
//		Thread.sleep(2000);
//		s.deselectByValue("ij");
//		Thread.sleep(2000);
//		s.deselectByVisibleText("Visual Studio");
//		Thread.sleep(2000);
		
		
//		List<WebElement> idesSelected = s.getAllSelectedOptions();
//		System.out.println("idesSelected:");
//		for(WebElement webelement :  idesSelected) {
//			System.out.println(webelement.getText());
//			
//		}
//		System.out.println(" ");
//		System.out.println("SelectedOptions:");
//		System.out.println(s.getFirstSelectedOption().getText());
		driver.quit();
		
	}

}
