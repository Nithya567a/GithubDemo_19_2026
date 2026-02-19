package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/Nithya%20G/Documents/Dropdown.html");
		WebElement players = driver.findElement(By.id("team"));
		Select s = new Select(players);
		s.selectByIndex(0);
		s.selectByValue("2");
		s.selectByVisibleText("Rahul");
		s.selectByContainsVisibleText("pathn");
	

}
}
