package practice;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearngetMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		String tagname = loginbtn.getTagName();
		System.out.println(tagname);
		String text = loginbtn.getText();
		System.out.println(text);
		@Nullable
		String attvalue = loginbtn.getAttribute("class");
		System.out.println(attvalue);
		String bgcolor = loginbtn.getCssValue("background-color");
		System.out.println(bgcolor);
		driver.quit();
		
	}

}
