package m15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A {
	public static void main(String[] args) {
		Demo d = new Demo();
		WebDriver driver=new ChromeDriver();
		d.execute(driver);
		WebDriver driver1=new EdgeDriver();
		d.execute(driver1);
		WebDriver driver2=new FirefoxDriver();
		d.execute(driver2);
	}

}
