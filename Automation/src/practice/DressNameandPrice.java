package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DressNameandPrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Kurti for women"+Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> dressname = driver.findElements(By.xpath("//a[contains(text(),' Kurta')]"));
		List<WebElement> dressprice = driver.findElements(By.xpath("((//a[contains(text(),' Kurta')])/../div[1])"));
		
		System.out.println(dressname.size());
		System.out.println(dressprice.size());
		
		for(int i=0; i<dressname.size() && i<dressprice.size(); i++) {;
		WebElement names = dressname.get(i);
		String dressName = names.getText();
		
		WebElement price = dressprice.get(i);
		String dressPrice = price.getText();
		
		System.out.println(dressName+ " "+dressPrice);
		}
		driver.quit();
		
		
	}

}
