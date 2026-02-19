package xpaths;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s24 ultra"+Keys.ENTER);
		
	 List<WebElement> mobName = driver.findElements(By.xpath("//span[contains(text(),'Galaxy S24 Ultra')]"));
	 List<WebElement> mobprice = driver.findElements(By.xpath("//span[contains(text(),'Galaxy S24 Ultra')]/../../..//..//span[@class='a-price-whole']"));
	 
	 for(int i=0; i<mobName.size(); i++) {
		 
		String name = mobName.get(i).getText();
		String price = mobprice.get(i).getText();
		
		System.out.println(name+"======="+price);
				}
	 driver.quit();
		
		
	}

}
