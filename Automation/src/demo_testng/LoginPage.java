package demo_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement emailTbx;
	private WebElement pwdTbx;     //Declaration
	private WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver) {   //initialization
		emailTbx=driver.findElement(By.id("Email"));
		pwdTbx=driver.findElement(By.id("Password"));
		loginBtn=driver.findElement(By.className("login-button"));
	}
	
	public void setLogin(String email,String pwd) {   //utilization
		emailTbx.sendKeys(email);
		pwdTbx.sendKeys(pwd);
		loginBtn.click();
		
	}

	

}
