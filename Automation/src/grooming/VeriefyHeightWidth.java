package grooming;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VeriefyHeightWidth {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");

		boolean link = driver.findElement(By.linkText("Register")).isDisplayed();
		if(link==true) {
			System.out.println("Registerlink is displayed");
		}else {
			System.out.println("Registerlink is not displayed");
		}
		
		WebElement subscribebtn = driver.findElement(By.id("newsletter-subscribe-button"));
		Dimension size = subscribebtn.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("Height of subscribe button " +height);
		
		System.out.println("width of subscribe button " +width);
		
		Point location = subscribebtn.getLocation();
		int xaxis = location.getX();
		
		Point locationn = subscribebtn.getLocation();
		int yaxis = location.getY();
		
		System.out.println("xaxis of Subscribr button " +xaxis);
		
		System.out.println("yaxis of Subscribr button " +yaxis);
		
		driver.quit();
		
		
		
	}
}

