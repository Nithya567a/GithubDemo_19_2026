package practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformMouseActionsMyntra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(men).perform();
		WebElement shoes = driver.findElement(By.partialLinkText("Sports Shoes"));
		shoes.click();
		@Nullable
		String title = driver.getTitle();
		if(title.equals("Sports Shoes")) {
			System.out.println("Sports Shoes page is displayed");
		}else {
			System.out.println("Sports Shoes page is not displayed");
		}
		List<WebElement> checkbox = driver.findElements(By.xpath("//span[text()='Brand']/..//input[@type='checkbox']"));

		System.out.println(checkbox.size());

		for(WebElement ele:checkbox) {
			a.click(ele).perform();
			Thread.sleep(500);
		}

		driver.findElement(By.xpath("//span[@data-colorhex='black']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-colorhex='white']")).click();
		Thread.sleep(1000);

		WebElement roottail = driver.findElement(By.id("rootRailThumbRight"));
		a.dragAndDropBy(roottail, -80, 0).perform();
		Thread.sleep(2000);

		WebElement range = driver.findElement(By.xpath("//span[text()='Discount Range']"));
		a.scrollToElement(range).perform();
		Thread.sleep(2000);

		WebElement discount = driver.findElement(By.xpath("//label[text()='20% and above']"));
		discount.click();
		Thread.sleep(1000);
		if(discount.isDisplayed()) {
			System.out.println("Discount applied");
		}else {
			System.out.println("Discount not applied");
		}

		//driver.findElement(By.xpath("(//img[@class='img-responsive'])[last()]")).click();
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		Thread.sleep(2000);

		String parentwindow = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();

		for(String window:allwin) {
			if(!window.equals(parentwindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		boolean addtobag = driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).isDisplayed();
		if(addtobag==true) {
			System.out.println("ADD TO BAG button is displayed");
		}else {
			System.out.println("ADD TO BAG button is not displayed");
		}
		driver.findElement(By.xpath("//p[text()='6']")).click();

		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();

		WebElement bag = driver.findElement(By.xpath("//span[text()='GO TO BAG']"));
		a.moveToElement(bag).perform();

		if(bag.isDisplayed()) {
			System.out.println("Product is added to Bag");
		}else {
			System.out.println("Product is not added to Bag");
		}
		driver.quit();
	}

}
