package xpaths;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricketScoreCard {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/121378/ind-vs-nz-3rd-odi-new-zealand-tour-of-india-2026");

		List<WebElement> playernames = driver.findElements(By.xpath("(//div[text()='Bowler'])[3]/../../..//a[contains(@title,'View Profile')]"));
		List<WebElement> wickets = driver.findElements(By.xpath("(//div[text()='Bowler'])[3]/../../../div/div[4]"));

		for(int i=0; i<playernames.size(); i++) {
			String names = playernames.get(i).getText();
			String wicket = wickets.get(i).getText();

			System.out.println(names+"------"+wicket);
		}
		driver.quit();
	}



}
