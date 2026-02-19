package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(partialLinkText = "Books")
	private WebElement Books;

//  @FindBy(linkText = "Computers")
//	private WebElement Computers;

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement shoes;
	
	@FindBy(partialLinkText = "Digital downloads")
			private WebElement downloads;


	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}

	public void booksSection() {
		Books.click();

	}
//		public void computersSection() {
//			Computers.click();
//	}

	public void shoesSection() {
		shoes.click();
	}
	
	public void digitalDownloadSection() {
		downloads.click();
	}

}
