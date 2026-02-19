package grooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureErrormsg {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.vtiger.com/crm-demo/");

		driver.findElement(By.xpath("//span[@class='custom-login']")).click();
		driver.findElement(By.name("username")).sendKeys("tester123@email.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement errormsg = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));

		if(errormsg.isDisplayed()) {
			System.out.println("Error msg is dispalyed");
		}else {
			System.out.println("Error msg is not dispalyed");
		}
		System.out.println(errormsg.getText());
        System.out.println(errormsg.getCssValue("color"));
		driver.quit();
		}

}
