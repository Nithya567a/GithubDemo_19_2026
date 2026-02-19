package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {
	@FindBy(partialLinkText = "Desktops")
	private WebElement desktops;
	private WebDriver driver;

   public ComputersPage(WebDriver driver) {
	   this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void moveToDesktop() {
	
		Actions a = new Actions(driver);
		a.moveToElement(desktops).perform();
		desktops.click();
	}

}
