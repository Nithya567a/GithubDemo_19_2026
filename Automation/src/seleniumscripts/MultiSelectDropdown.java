package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/select-menu");

        // Locate multi-select dropdown
        WebElement cars = driver.findElement(By.id("cars"));
        Select s = new Select(cars);


        // Select multiple options
        s.selectByIndex(1);
        s.selectByValue("opel");
        s.selectByVisibleText("Audi");

        Thread.sleep(2000);

        // Deselect one option
        s.deselectByVisibleText("Opel");

        // Deselect all
        s.deselectAll();

        driver.quit();
	}

}
