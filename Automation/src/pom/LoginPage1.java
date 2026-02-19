package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	@FindBy(id="Email")
	private WebElement emailTbx;
	@FindBy(id="Password")
	private WebElement pwdTbx; 
	@FindBy(className="login-button")
	private WebElement loginBtn;
	
	public LoginPage1(WebDriver driver) {	
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String email) {
		emailTbx.sendKeys(email);
		}
	public void enterPassword(String password) {
		pwdTbx.sendKeys(password);
	}
	public void setLogin() {
		loginBtn.click();
	}

}
