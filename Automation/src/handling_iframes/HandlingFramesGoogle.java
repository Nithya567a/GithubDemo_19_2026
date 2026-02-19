package handling_iframes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFramesGoogle {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame("app");
		WebElement music = driver.findElement(By.xpath("//span[text()='YouTube Music']"));
		Actions a = new Actions(driver);
		a.scrollToElement(music).perform();
		a.contextClick(music).perform();
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_T);

		//Strig parentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		Thread.sleep(2000);

		for(String allwids:allwindows) {
			driver.switchTo().window(allwids);
			if(driver.getTitle().contains("Music")) {

				break;

			}	
		}
		driver.findElement(By.xpath("//input[@placeholder='Search songs, albums, artists, podcasts']")).sendKeys("Kannada Songs",Keys.ENTER);




	}

}
