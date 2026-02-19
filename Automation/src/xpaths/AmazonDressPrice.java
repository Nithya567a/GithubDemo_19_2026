package xpaths;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDressPrice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kurta sets for woman"+Keys.ENTER);
		
//		List<WebElement> dressName = driver.findElements(By.xpath("//span[contains(text(),'Amazon Brand')]"));
//		List<WebElement> dressprice = driver.findElements(By.xpath("//span[contains(text(),'Amazon Brand ')]/../../../../div[4]"));
		
		List<WebElement> dressname = driver.findElements(By.xpath("//span[text()='KLOSIA']"));
		List<WebElement> dressprice = driver.findElements(By.xpath("//span[text()='KLOSIA']/../../../../div[4]"));
		
		for(int i=0; i<dressname.size(); i++) {
			
			String name = dressname.get(i).getText();
			String price = dressprice.get(i).getText();
		
			System.out.println(name+"======="+price);
		}
		driver.quit();
	}

}
