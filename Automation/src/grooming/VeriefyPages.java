package grooming;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class VeriefyPages {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");

		//WebElement registerLink = driver.findElement(By.linkText("Register"));


		String actualtitle = driver.getTitle();
		String expectedtitle = "Demo Web Shop";
		Assert.assertEquals(actualtitle, expectedtitle);

		System.out.println("Welcome page is displayed");

		driver.findElement(By.linkText("Facebook")).click();

		String parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();

		for(String wid:allwindows) {
			if(!wid.equals(parentwindow)) {
				driver.switchTo().window(wid);
				Thread.sleep(3000);  
				break;
			}

		}

		String actual = driver.getTitle();
		String expected="NopCommerce | Facebook";

		System.out.println("actual title "+actual);
		System.out.println("expected title "+expected);

		Assert.assertEquals(actual,expected);
		
		System.out.println("Facebook login page is displayed");
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		
		System.out.println("signup is displayed");
		
		driver.findElement(By.name("firstname")).sendKeys("Tester");
		
		
       driver.quit();


	}

}
