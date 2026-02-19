package xpaths;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIndepedentDepdentXpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		List<WebElement> ele = driver.findElements(By.xpath("(//div[@class='a-cardui-header'])[6]/..//span[contains(@class,'a-size-small')]"));
		
		for(int i=0; i<ele.size(); i++) {
			String text = ele.get(i).getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
