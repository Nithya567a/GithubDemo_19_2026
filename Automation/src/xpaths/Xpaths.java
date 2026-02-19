package xpaths;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("");
		
		List<WebElement> batsman = driver.findElements(By.xpath("(//div[text()='Batter'])[2]/../../..//a[contains(@title,'View Profile')]"));
		List<WebElement> bowler = driver.findElements(By.xpath("(//div[text()='Batter'])[2]/../../..//div[contains(@class,'text-cbTxtSec')]"));
		
		for(int i=0; i<batsman.size();i++) {
	    	  String names = batsman.get(i).getText();
	    	  String wicket = bowler.get(i).getText();
	    	 
	    	 System.out.println(names+"-------"+wicket);
	       }
			driver.quit();
	}

}
