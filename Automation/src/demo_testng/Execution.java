package demo_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Execution {
	@Test
	public void tc_01() {
		WebDriver driver = new  ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		LoginPage l = new LoginPage(driver);
		l.setLogin("admin123@email.com", "12345678");
		
		
	}

}
