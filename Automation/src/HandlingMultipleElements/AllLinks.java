package HandlingMultipleElements;

//write a script to print all the links in a web page

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=allLinks.size();
		System.out.println(count);
		//for(int i=count-1;i>=0;i--) {
		for(int i=0; i<count; i++) {
	//we need to access one element from the list using get(int i)/foreach
		WebElement ele = allLinks.get(i);
	//in order to print the text we should use getText() else it will print address
		String text = ele.getText();	
		System.out.println(text);
		}
		driver.quit();
	}
}



