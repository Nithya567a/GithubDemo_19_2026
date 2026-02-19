package popups;

import java.time.Duration;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllPopups {
	public static void main(String[] args) throws InterruptedException {		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pib.gov.in/indexd.aspx?reg=3&lang=1");
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Ministry of Defence']")).click();
		a.accept();

		String parent = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();

		for(String wid:allwindows) {
			driver.switchTo().window(wid);

			if(!parent.equals(wid)) {

				String title = driver.getTitle();
				System.out.println(title);
			}
		}
		driver.quit();
	}

}
