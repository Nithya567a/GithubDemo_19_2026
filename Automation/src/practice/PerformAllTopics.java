package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//WebDriver + WebElement + Dropdowns + Alerts + Windows

public class PerformAllTopics {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement firstname= driver.findElement(By.id("firstName"));
		firstname.sendKeys("Nithya");
		if(firstname.isDisplayed()) {
			System.out.println("First name text field is displayed");
		}else {
			System.out.println("First name text field is not displayed");
		}

		if(firstname.isEnabled()) {
			System.out.println("First name text field is Enabled");
		}else {
			System.out.println("First name text field is Disabled");
		}

		 WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.clear();
		lastname.sendKeys("G");
		driver.findElement(By.xpath("//label[text()='Female']")).click();

		boolean res = driver.findElement(By.id("userNumber")).isEnabled();
		if(res==true) {
			System.out.println("Mobile number text field is Enabled");
		}else {
			System.out.println("Mobile number text field is Disabled");
		}
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s=new Select(month);
		s.selectByVisibleText("October");
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s1=new Select(year);
		s1.selectByVisibleText("2002");
		driver.findElement(By.xpath("//div[text()='17']")).click();

		driver.navigate().to("https://demoqa.com/alerts");

		driver.findElement(By.id("alertButton")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

		driver.findElement(By.id("confirmButton")).click();
		Alert a1=driver.switchTo().alert();
		a1.dismiss();

		driver.findElement(By.id("promtButton")).click();
		Alert a2=driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.sendKeys("selenium");
		a2.accept();

		driver.navigate().to("https://demoqa.com/browser-windows");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.id("tabButton")).click();
		Set<String> allwindows = driver.getWindowHandles();

		for(String wind:allwindows) {
			if(!wind.equals(parentWindow)) {
				driver.switchTo().window(wind);
				System.out.println(driver.getTitle());
				driver.close();
				break;
			}
		}

		driver.switchTo().window(parentWindow);

		driver.quit();
	}
}














