package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.landrecords.karnataka.gov.in/service2/RTC.aspx");

       WebElement district = driver.findElement(By.className("form-control"));
       district.click();
       Thread.sleep(2000);
       
       Select s = new Select(district);
       //s.selectByIndex(2);
       //s.selectByValue("23");
       s.selectByVisibleText("HASSAN");
       Thread.sleep(2000);
       
      WebElement taluk = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
      taluk.click();
      Select s1 = new Select(taluk);
      //s1.selectByIndex(3);
      s1.selectByValue("8");
      //s1.selectByVisibleText("HASSAN");
      Thread.sleep(2000);

        driver.quit();
	}

}
