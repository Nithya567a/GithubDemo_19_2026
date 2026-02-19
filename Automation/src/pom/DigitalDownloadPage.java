package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DigitalDownloadPage {
	@FindBy(id="products-orderby")
	private WebElement positionbyDropdown;
	
	@FindBy(id="products-pagesize")
	private WebElement displaydropdown;
	
	@FindBy(id="products-viewmode")
	private WebElement viewmodedropdown;
	
//	@FindBy(className = "product-item")
//	private WebElement pictureimg;
	
	 public DigitalDownloadPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
		
		public void selectPositions(int index) {
			Select s = new Select(positionbyDropdown);
			//s.selectByVisibleText("Price: Low to High");
			s.selectByIndex(index);
			}
		
		public void displayZize(int index) {
			Select s = new Select(displaydropdown);
			//s.selectByVisibleText("Price: Low to High");
			s.selectByIndex(index);
			}
		
		public void ViewMode(int index) {
			Select s = new Select(viewmodedropdown);
			s.selectByIndex(index);
		}
//		public void pictureClick() {
//			pictureimg.click();
//		}

}
