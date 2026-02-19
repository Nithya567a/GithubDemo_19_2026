package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeranIsSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		WebElement checkbox = driver.findElement(By.id("Domain_a"));
		Thread.sleep(2000);
		checkbox.click();
		boolean res = checkbox.isSelected();
		if(res==true) {
			System.out.println("selected");
		}else{
			System.out.println("not selected");
		}
		driver.quit();
	}

}
