package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BooksPage {
	
	@FindBy(id="small-searchterms")
	private WebElement searchbox;

	@FindBy(id="products-orderby")
	private WebElement orderByDropdown;
	
	@FindBy(id="products-pagesize")
	private WebElement display;
	
	@FindBy(id="products-viewmode")
	private WebElement view;
	
//	@FindBy(className = "buttons")
//	private WebElement btn;
//	
	
	 public BooksPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }
	 
	 public void searchBox(String text) {
		 searchbox.sendKeys(text);
	 }
		
		public void selectPosition(int index) {
			Select s = new Select(orderByDropdown);
			//s.selectByVisibleText("Price: Low to High");
			s.selectByIndex(index);
			}
		
		public void displayPageZize(int index) {
			Select s = new Select(display);
			//s.selectByVisibleText("Price: Low to High");
			s.selectByIndex(1);
			}
		
		public void selectView(String views) {
			Select s = new Select(view);
			s.selectByVisibleText(views);;
		}
//		  public void addtoCart() {
//		  btn.click();	
//			
//		}
}
	


