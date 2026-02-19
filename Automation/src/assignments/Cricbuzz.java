package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Cricbuzz {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://www.cricbuzz.com/live-cricket-scorecard/121406/ind-vs-nz-3rd-t20i-new-zealand-tour-of-india-2026");

		 driver.get("https://www.cricbuzz.com/");

	        // Click MATCHES
	        driver.findElement(By.xpath("//a[text()='MATCHES']/following-sibling::div/a[3]")).click();

	        // Click Scorecard
	        driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		 List<WebElement> playerNames = driver.findElements(
		            By.xpath("//div[text()='West Indies']/../following-sibling::div//a[contains(@title,'View Profile')]")
		        );

		        //  Independent XPath – Runs
		        List<WebElement> runs = driver.findElements(
		            By.xpath("//div[text()='West Indies']/../following-sibling::div//div[@class='cb-col cb-col-8 text-right']")
		        );

		        int length = Math.min(playerNames.size(), runs.size());

		        for (int i = 0; i < length; i++) {
		            System.out.println(playerNames.get(i).getText() + " : " + runs.get(i).getText());
		        }

		        driver.quit();
	}

}
