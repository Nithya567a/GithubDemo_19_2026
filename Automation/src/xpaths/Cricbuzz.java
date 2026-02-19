package xpaths;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz {
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://www.cricbuzz.com/");
//		
//		driver.findElement(By.xpath("//a[text()='MATCHES']/following-sibling::div/a[5]")).click();
//		driver.findElement(By.xpath("//a[text()='Scorecard']")).click()

		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/116441/rsa-vs-wi-1st-t20i-west-indies-tour-of-south-africa-2026");
		
List<WebElement> playername = driver.findElements(By.xpath("(//div[text()='Batter'])[3]/../../../div[contains(@class,'grid')]/div/a"));
List<WebElement> runs = driver.findElements(By.xpath("(//div[text()='Batter'])[3]/../../../div[contains(@class,'grid ')]/div[contains(@class,'text-sm')]"));
		
       for(int i=0; i<playername.size();i++) {
    	  String names = playername.get(i).getText();
    	  String run = runs.get(i).getText();
    	 
    	 System.out.println(names+"-------"+run);
       }
		driver.quit();
	}

}

