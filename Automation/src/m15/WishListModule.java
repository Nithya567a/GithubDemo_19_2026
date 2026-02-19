package m15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class WishListModule {
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
		
		driver.findElement(By.linkText("shoes")).click();
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@name,'product_attribute')]"));
		Select s = new Select(dropdown);
		s.selectByValue("28");
		
		driver.findElement(By.xpath("(//span[contains(@style,'background-color')])[3]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'add-to-wishlist-button')]")).click();
		
		String wishlistmsg = driver.findElement(By.xpath("//p[contains(text(),'The product')]")).getText();
		System.out.println(wishlistmsg);
		
		driver.findElement(By.xpath("(//span[@class='cart-label'])[2]")).click();
		
		
		List<WebElement> removeCheckBox = driver.findElements(By.name("removefromcart"));

		for (WebElement ele : removeCheckBox) {
		    ele.click();
		}
		driver.findElement(By.xpath("//input[contains(@class,'update-wishlist-button')]")).click();
		
		String removemsg = driver.findElement(By.className("wishlist-content")).getText();
		System.out.println(removemsg);
		
		driver.findElement(By.className("ico-logout")).click();
		driver.quit();
	}

}
