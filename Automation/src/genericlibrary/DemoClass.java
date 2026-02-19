package genericlibrary;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass {
	public static void main(String[] args) throws IOException {
		FileLib f = new FileLib();
		String url = f.readPropertyData("url");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();;
		String email = f.readPropertyData("email");
		driver.findElement(By.id("Email")).sendKeys(email);
		String pwd = f.readPropertyData("password");
		driver.findElement(By.id("Password")).sendKeys(pwd);
		String data = f.readExcelData("searchproduct", 1, 1);
	}

}
