package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLastOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Nithya%20G/Documents/Dropdown.html");
		WebElement players = driver.findElement(By.id("players"));
		Select s = new Select(players);
		Thread.sleep(2000);
		List<WebElement> alloptions = s.getOptions();
		Thread.sleep(2000);
		WebElement lastoption = alloptions.getLast();
		Thread.sleep(2000);
		String text = lastoption.getText();
		Thread.sleep(2000);
		System.out.println(text);
		driver.quit();
	
	}

}
