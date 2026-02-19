package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledropdown1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement code = driver.findElement(By.id("country_code"));
		Select s = new Select(code);
		s.selectByIndex(0);
		Thread.sleep(1000);
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.id("female")).click();
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.id("select3"));
		Select s1 = new Select(country);
		s1.selectByVisibleText("India");
		Thread.sleep(1000);
		driver.findElement(By.id("select5")).sendKeys("Karanataka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		Thread.sleep(1000);
		WebElement products = driver.findElement(By.id("select-multiple-native"));
		Select s2 = new Select(products);
		s2.selectByVisibleText("Fjallraven - Foldsac...");
		Thread.sleep(1000);
		s2.selectByIndex(1);
		Thread.sleep(1000);
		s2.selectByValue("Mens Casual Slim Fit");
		Thread.sleep(1000);
		
		List<WebElement> productsAvailable = s2.getOptions();
		System.out.println("products Avaliable:");
		for(WebElement webelement:productsAvailable) {
			System.out.println(webelement.getText());
		}
		
		
		System.out.println("------");
		
		
		List<WebElement> productSelected = s2.getAllSelectedOptions();
		System.out.println("Products Selected:");
		for(WebElement webelement : productSelected) {
			System.out.println(webelement.getText());
			
		}
		
		driver.findElement(By.xpath("//a[text()='Search With Select']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("selectPhone")).sendKeys("9876543210");
		Thread.sleep(1000);
		
		WebElement gender = driver.findElement(By.xpath("//div[text()='Select Gender']"));
		gender.click();
		Select s3 = new Select(gender);
		s3.selectByIndex(1);
		Thread.sleep(1000);
		
		driver.quit();
	}
}
		
		
		
		
	


