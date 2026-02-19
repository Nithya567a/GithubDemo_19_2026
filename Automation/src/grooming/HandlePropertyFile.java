package grooming;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlePropertyFile {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		FileInputStream f = new FileInputStream("./testdata/commondataa.properties");
		Properties p = new Properties();
		p.load(f);
		
		 driver.findElement(By.id("FirstName")).sendKeys(p.getProperty("fn"));
		 driver.findElement(By.id("LastName")).sendKeys(p.getProperty("ln"));
		 driver.findElement(By.id("Email")).sendKeys(p.getProperty("Email"));
		 driver.findElement(By.id("Password")).sendKeys(p.getProperty("pwd"));
		 driver.findElement(By.id("ConfirmPassword")).sendKeys(p.getProperty("Confirmpwd"));
		 driver.findElement(By.id("register-button")).click();
		 
		WebElement sucessmsg = driver.findElement(By.xpath("//div[@class='result']"));
		String text = sucessmsg.getText();
		System.out.println(text);
		driver.quit();
}
	
}
