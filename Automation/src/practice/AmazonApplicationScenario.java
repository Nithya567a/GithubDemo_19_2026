package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonApplicationScenario {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
       //driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
		 WebElement all = driver.findElement(By.id("nav-hamburger-menu"));
        Actions a = new Actions(driver);
        a.moveToElement(all).click().perform();

    
        driver.findElement(By.xpath("(//a[text()='Bestsellers'])[2]")).click();
        driver.findElement(By.xpath("//a[text()='Electronics']")).click();
        driver.findElement(By.id("gridItemRoot")).click();
        Thread.sleep(2000);
        a.scrollByAmount(0, 5000).perform();
        WebElement offer= driver.findElement(By.xpath("//h5[text()='Offers']"));
        a.scrollToElement(offer).perform();
        boolean res = driver.findElement(By.id("add-to-cart-button")).isDisplayed();
        if(res==true) {
        	System.out.println("Add to cart button is displayed");
        }else {
        	System.out.println("Add to cart button is not displayed");
        }
        driver.quit();
        

}
}
