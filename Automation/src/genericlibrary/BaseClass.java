package genericlibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	@BeforeClass(groups= {"SmokeTesting","RegressionTesting"})
	//@BeforeClass
	public void openBrowser() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("openBrowser",true);
	}
		@BeforeMethod(groups= {"SmokeTesting","RegressionTesting"})
		public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("admin123@email.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Reporter.log("login",true);
			
		}
		@AfterMethod(groups= {"SmokeTesting","RegressionTesting"})
		public void logout() {
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("logout",true);
		}
		@AfterClass(groups= {"SmokeTesting","RegressionTesting"})
		public void closeBroweser() {
			driver.quit();
			Reporter.log("closeBrowser",true);
		}
		
		
	}

