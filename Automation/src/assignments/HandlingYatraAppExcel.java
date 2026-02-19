package assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingYatraAppExcel {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		FileInputStream f = new FileInputStream("./testdata/commondata.properties");
		Properties p = new Properties();
		p.load(f);
		String url2= p.getProperty("url2");

		driver.get(url2);

		driver.findElement(By.xpath("(//img[@alt='cross'])[1]")).click();

		driver.findElement(By.xpath("//p[text()='Departure From']")).click();
		driver.findElement(By.id("input-with-icon-adornment")).sendKeys("Banglore");
		driver.findElement(By.xpath("//span[text()='BLR']")).click();
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//p[text()='Going To']")).click();
		driver.findElement(By.id("input-with-icon-adornment")).sendKeys("Dubai");
		driver.findElement(By.xpath("//span[text()='Dubai']")).click();
		//Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='css-13lub7m']")).click();
		//driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='26'])[2]")).click();

		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30)); 
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='js-flightitem")));

		List<WebElement> flightname = driver.findElements(By.xpath("//div[@class='js-flightItem']//span[@class='text i-b']"));

		int size = flightname.size();
		List<WebElement> flightprice = driver.findElements(By.xpath("//div[@class='js-flightItem']//p[@class='i-b']"));

		System.out.println("Total flights:"+flightprice.size());

		FileInputStream fis = new FileInputStream("./testdata/test.script.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		for (int i = 0; i < size; i++) {
			WebElement name = flightname.get(i);
			WebElement price = flightprice.get(i);
			String names = name.getText();
			String pricee = price.getText();

			System.out.println(names+" "+ pricee);
			wb.getSheet("yatraflightdetails").createRow(i).createCell(0).setCellValue(names);
			wb.getSheet("yatraflightdetails").getRow(i).createCell(1).setCellValue(pricee);

		}
		FileOutputStream fo = new FileOutputStream("./testdata/testscript.xlsx");
		wb.write(fo);
}


}
