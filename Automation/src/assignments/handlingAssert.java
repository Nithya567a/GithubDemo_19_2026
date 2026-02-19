package assignments;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class handlingAssert {
	@Test
	public void veriefyTitle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/");
		@Nullable
		String actualtitle = driver.getTitle();
		String exceptedtitle = "Instagram";
		Assert.assertEquals(actualtitle, exceptedtitle);
       boolean enabled = driver.findElement(By.xpath("//div[text()='Log in']")).isEnabled();
       SoftAssert s = new SoftAssert();
	   s.assertTrue(enabled);
	   driver.quit();
	   s.assertAll();
		
	}

}
