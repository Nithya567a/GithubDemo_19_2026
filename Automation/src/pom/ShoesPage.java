package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ShoesPage {
	@FindBy(id="products-orderby")
	private WebElement positiondropdown;
	
	@FindBy(id="products-pagesize")
	private WebElement displayset;
	
	@FindBy(id="products-viewmode")
	private WebElement viewsset;
	
	public ShoesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
	
	public void selectsPosition() {
		Select s = new Select(positiondropdown);
		s.selectByIndex(4);
	}
	public void displayPageZize(int index) {
		Select s = new Select(displayset);
		s.selectByIndex(2);
		}
	
	public void selectView(String views) {
		Select s = new Select(viewsset);
		s.selectByContainsVisibleText(views);
	}

}
