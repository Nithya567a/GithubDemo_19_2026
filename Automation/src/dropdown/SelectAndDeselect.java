package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Nithya%20G/Documents/Dropdown.html");
		WebElement all = driver.findElement(By.id("players"));
		Select s = new Select(all);
		List<WebElement> alloptions = s.getOptions();
		Thread.sleep(2000);
		int count=alloptions.size();
		
		//select all elements in ascending order
		for(int i=0; i<count; i++) {
			s.selectByIndex(i);
		}
		
		//deselect all elements in ascending order
		for(int i=count-1; i>=0; i--) {
			s.deselectByIndex(i);
		}
		driver.quit();
		
	}

}
