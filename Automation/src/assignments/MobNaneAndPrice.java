package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//open the browser navigate to flipkart application and search for iPhone 14 pro max from result page print all 24 mobile name and price together

public class MobNaneAndPrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
	
		driver.findElement(By.name("q")).sendKeys("iPhone 14 pro max"+Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> mobnames = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
		List<WebElement> mobprice = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/../../div[2]/div[1]"));
		
		System.out.println(mobnames.size());
		System.out.println(mobprice.size());
		
		
		for(int i=0; i<mobnames.size(); i++) {
		WebElement names = mobnames.get(i);
		String MobNames = names.getText();
		
		WebElement price = mobprice.get(i);
		String MobilePrices = price.getText();
		
		System.out.println(MobNames+ " "+MobilePrices);
		}
		driver.quit();
	}

}
