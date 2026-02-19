package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WAP to print all the data from the table
//3.https://demoapps.qspiders.com/ click on UI Testing Concepts and click on web table and print all the cell data.

public class PrintAllData {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(2000);
		List<WebElement> tabledata = driver.findElements(By.tagName("tr"));
		System.out.println(tabledata.size());
		for(int i=0; i<tabledata.size(); i++) {
			WebElement ele = tabledata.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		driver.quit();
	}

}
