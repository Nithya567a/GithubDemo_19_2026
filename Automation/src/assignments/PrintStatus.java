package assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintStatus {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		FileInputStream fis1 = new FileInputStream("./testdata/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis1);
		for(int i=1; i<=6; i++) {

			String user = wb.getSheet("unpwd").getRow(i).getCell(0).getStringCellValue();
			String password = wb.getSheet("unpwd").getRow(i).getCell(1).getStringCellValue();

			WebElement un = driver.findElement(By.id("user-name"));
			WebElement pwd = driver.findElement(By.id("password"));
			WebElement login = driver.findElement(By.id("login-button"));
			un.sendKeys(user);
			Thread.sleep(2000);
			pwd.sendKeys(password);
			Thread.sleep(2000);
			login.click();

			if(driver.getCurrentUrl().contains("inventory")) {
				Thread.sleep(2000);
				
				wb.getSheet("unpwd").getRow(i).createCell(2).setCellValue("pass");
				driver.navigate().back();
			}else {

				wb.getSheet("unpwd").getRow(i).createCell(2).setCellValue("fail");
				driver.navigate().refresh();
				Thread.sleep(2000);
			}

		}
		FileOutputStream fos=new FileOutputStream("./testdata/testscript.xlsx");
		wb.write(fos);
		driver.quit();
	}
}








