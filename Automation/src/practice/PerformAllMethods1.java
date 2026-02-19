package practice;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PerformAllMethods1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(" https://demoqa.com/automation-practice-form");

		String title = driver.getTitle();
		System.out.println(title);
		@Nullable
		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.findElement(By.id("firstName")).sendKeys("Nithya");
		driver.findElement(By.id("lastName")).sendKeys("G");
		driver.findElement(By.id("userEmail")).sendKeys("nithya17@gmail.com");
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9876543210");
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s=new Select(month);
		s.selectByIndex(9);
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select s1=new Select(year);
		s1.selectByVisibleText("2002");
		driver.findElement(By.xpath("//div[text()='17']")).click();

		driver.findElement(By.id("subjectsContainer")).sendKeys("Manual Testing");
		driver.findElement(By.id("subjectsContainer")).sendKeys("\n");
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Nithya G\\Downloads\\Nithya_G_Resume.pdf");
		driver.findElement(By.id("currentAddress")).sendKeys("Bengaluru,karnatka");
		driver.findElement(By.xpath("//div[text()='Select State']")).click();
		driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
		driver.findElement(By.xpath("//div[text()='Select City']")).click();
		driver.findElement(By.xpath("//div[text()='Jaipur']")).click();

		driver.quit();

	}

}
/*
 * Why didn’t you use Select for State and City?
A (Perfect):

Because State and City are div-based dropdowns, not <select> tags.
Select class works only with <select> elements, so I used click actions.
*/

/*
 * Why didn’t you use Select for State and City?
A (Perfect):

Because State and City are div-based dropdowns, not <select> tags.
Select class works only with <select> elements, so I used click actions.
*/
/*
 * package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerformAllMethods1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoqa.com/automation-practice-form");

		// Title & URL
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// Basic details
		driver.findElement(By.id("firstName")).sendKeys("Nithya");
		driver.findElement(By.id("lastName")).sendKeys("G");
		driver.findElement(By.id("userEmail")).sendKeys("nithya17@gmail.com");

		// Gender
		driver.findElement(By.xpath("//label[text()='Female']")).click();

		// Mobile
		driver.findElement(By.id("userNumber")).sendKeys("9876543210");

		// Date of Birth
		driver.findElement(By.id("dateOfBirthInput")).click();

		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		new Select(month).selectByVisibleText("October");

		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		new Select(year).selectByVisibleText("2002");

		driver.findElement(
			By.xpath("//div[contains(@class,'react-datepicker__day') and text()='17' and not(contains(@class,'outside-month'))]")
		).click();

		// SUBJECTS (IMPORTANT FIX)
		driver.findElement(By.id("subjectsContainer")).click(); // give focus
		driver.findElement(By.id("subjectsInput")).sendKeys("Manual Testing");
		driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);

		// Hobbies
		driver.findElement(By.xpath("//label[text()='Reading']")).click();

		// Upload file
		driver.findElement(By.id("uploadPicture"))
				.sendKeys("C:\\Users\\Nithya G\\Downloads\\Nithya_G_Resume.pdf");

		// Address
		driver.findElement(By.id("currentAddress"))
				.sendKeys("Bengaluru, Karnataka");

		// Explicit wait for State & City
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(By.id("state"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Rajasthan']"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("city"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Jaipur']"))).click();

		driver.quit();
	}
}
*/
