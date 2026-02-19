package m15;

import org.openqa.selenium.WebDriver;

public class Demo {
	public void execute(WebDriver driver) {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
