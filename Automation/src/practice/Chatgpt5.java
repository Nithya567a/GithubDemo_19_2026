package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Open Google.com, type “Selenium WebDriver”, clear the text, re-enter “Java tutorial”, and 
//check whether the Google Search button is enabled and print the result.

public class Chatgpt5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		Thread.sleep(2000);
		ele.sendKeys("Selenium WebDriver");
		Thread.sleep(2000);
		ele.clear();
		Thread.sleep(2000);
		ele.sendKeys("Java tutorial");
		Thread.sleep(2000);
		
		//boolean res=ele.isEnabled();
		boolean res = driver.findElement(By.xpath("//textarea[@title='Search']")).isEnabled();
	    if(res==true) {
			System.out.println("Enabled");
		}else {
			System.out.println("Disabled");
		}
		driver.quit();
		
		
	}

}
