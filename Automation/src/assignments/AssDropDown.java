package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://landrecords.karnataka.gov.in/service2/RTC.aspx");
//		WebElement ele = driver.findElement(By.xpath("//option[text()='Select District']"));
//		Select s1=new Select(ele);
//		s1.selectByValue("HASSAN");
		driver.findElement(By.xpath("//option[text()='HASSAN']")).click();
		driver.findElement(By.xpath("//option[text()='ARSIKERE']")).click();
		driver.findElement(By.xpath("//option[text()='BANAVARA']")).click();
		driver.findElement(By.xpath("//option[text()='MALLAPURA']")).click();
		driver.findElement(By.xpath("//input[@type='number']"));
		driver.quit();
		
		

	}

}
