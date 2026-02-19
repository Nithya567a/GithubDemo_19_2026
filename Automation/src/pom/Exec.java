package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exec {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/login");
		LoginPage1 l=new LoginPage1(driver);
		l.enterEmail("admin123@email.com");
		l.enterPassword("12345678");
		l.setLogin();

		HomePage h = new HomePage(driver);
		h.booksSection();
		//h.searchBox("laptops");

		BooksPage b = new BooksPage(driver);
		b.searchBox("laptops");
		b.selectPosition(0);
		b.displayPageZize(1);
		b.selectView("List");
		//  b.addtoCart();

		//h.computersSection();
		//	    
		//ComputersPage c = new ComputersPage(driver);
		//c.moveToDesktop();

		h.shoesSection();

		ShoesPage s = new ShoesPage(driver);
		s.selectsPosition();
		s.displayPageZize(2);
		s.selectView("List");

		h.digitalDownloadSection();

//		DigitalDownloadPage d = new DigitalDownloadPage(driver);
//		d.selectPositions();
//		d.displayZize();
//		d.ViewMode();
		//d.pictureClick();
	}
}
