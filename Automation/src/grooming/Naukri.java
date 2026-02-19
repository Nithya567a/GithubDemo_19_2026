package grooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukri {
	public static void main(String[] args) {
        
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("register_Layer")).click();
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='chk-label']"));
		Actions a = new Actions(driver);
		a.scrollToElement(ele).perform();
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).sendKeys("C:\\Users\\Nithya G\\Downloads\\Automation _resume (1).pdf");


	}

}
