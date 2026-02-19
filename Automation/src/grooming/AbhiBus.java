package grooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//div[text()='Leaving From']")).click();
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
	}

}
