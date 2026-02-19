package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Nithya%20G/Documents/Course.html");
		WebElement course = driver.findElement(By.id("course"));
		Select s = new Select(course);
		//single select
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("net");
		Thread.sleep(2000);
		s.selectByVisibleText("Python");
		Thread.sleep(2000);
		
//		List<WebElement> courses = s.getOptions();
//		System.out.println("Courses Avaliable:");
//		for(WebElement webelement:courses) {
//			System.out.println(webelement.getText());
//		}
		driver.quit();
	}

}
