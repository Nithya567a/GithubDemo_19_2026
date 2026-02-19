package m15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookModule {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("admin123@email.com");
		driver.findElement(By.id("Password")).sendKeys("12345678");
		driver.findElement(By.className("login-button")).click();
		
		driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.linkText("Health Book")).click();
		String shortdesc = driver.findElement(By.xpath("//div[@class=\"short-description\"]")).getText();
		System.out.println(shortdesc);
		String oldprice = driver.findElement(By.xpath("//div[@class='old-product-price']")).getText();
		System.out.println(oldprice);
		String price = driver.findElement(By.xpath("//div[@class='product-price']")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart')]")).click();
		String cartmsg = driver.findElement(By.xpath("//p[contains(text(),'The product has')]")).getText();
		System.out.println(cartmsg);
		driver.findElement(By.className("ico-logout")).click();
		driver.quit();
	}

}
