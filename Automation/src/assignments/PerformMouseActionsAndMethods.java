package assignments;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseActionsAndMethods {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(men).perform();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sneakers']")).click();
		Thread.sleep(2000);

		List<WebElement> checkboxes = driver.findElements(By.xpath("//span[text()='Brand']/..//input[@type='checkbox']"));

		System.out.println(checkboxes.size());
		Thread.sleep(2000);

		for(WebElement ele:checkboxes) {
			a.click(ele).perform();
			Thread.sleep(500);
		}

		WebElement roottail = driver.findElement(By.id("rootRailThumbRight"));
		a.dragAndDropBy(roottail,-30,0).perform();
		Thread.sleep(2000);

		WebElement page = driver.findElement(By.xpath("//ul[@class='pagination-container']"));
		a.scrollToElement(page).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[last()]")).click();
		Thread.sleep(2000);

		String parentwid = driver.getWindowHandle();
		Set<String> allwid = driver.getWindowHandles();
		for(String wid:allwid) {
			if(!wid.equals(parentwid)) {
				driver.switchTo().window(wid);
				break;
			}
		}
		boolean addtobag = driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).isEnabled();
		if(addtobag==true) {
			System.out.println("ADD TO BAG button is Enabled");
		}else {
			System.out.println("ADD TO BAG button is disabled");
		}
		driver.quit();
	}

}


