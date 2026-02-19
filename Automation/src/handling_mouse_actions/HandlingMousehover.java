package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMousehover {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		WebElement company = driver.findElement(By.id("companyDropdown"));
		Actions a = new Actions(driver);
		a.moveToElement(company).perform();
		WebElement contact = driver.findElement(By.linkText("Contact Us"));
		contact.click();

		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'+91 9243602352')]/.."));
		System.out.println(text.getText());
		driver.quit();
		
		
	}

}
