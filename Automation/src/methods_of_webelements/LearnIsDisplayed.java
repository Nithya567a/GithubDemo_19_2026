package methods_of_webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		boolean res = driver.findElement(By.xpath("//i[@role='img']")).isDisplayed();
		if(res==true) {
			System.out.println("Displayed");
			}else {
				System.out.println("not displayed ");
			}
		driver.quit();
	}

}
