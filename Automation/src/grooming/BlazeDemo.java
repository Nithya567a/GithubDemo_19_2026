package grooming;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BlazeDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://blazedemo.com/");
		
		WebElement fromadd = driver.findElement(By.xpath("//select[@name='fromPort']"));
		
		Select s = new Select(fromadd);
		s.selectByValue("Philadelphia");
		
		WebElement toadd = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s1=new Select(toadd);
		s1.selectByValue("London");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		
		
		List<WebElement> prices = driver.findElements(By.xpath("//th[text()='Price']/../../../tbody/tr/td[6]"));
		Double []a=new Double[5];
		for(int i=0;i<prices.size();i++) {
			WebElement ele = prices.get(i);
			String text = ele.getText();
			//System.out.println(text);
			String listtext = text.replace("$", "");
			//System.out.println(listtext);
			double dprice = Double.parseDouble(listtext);
			 a[i]=dprice;
		}
		Arrays.sort(a);
		Double low=a[0];
		String lprice = low.toString();
		//driver.findElement(By.xpath())
		driver.findElement(By.xpath("//td[contains(text(),'"+lprice+"')]/preceding-sibling::td[5]")).click();
		driver.findElement(By.id("inputName")).sendKeys("Nithya");
		driver.findElement(By.id("address")).sendKeys("Hassan");
		driver.findElement(By.id("city")).sendKeys("kolar");
		driver.findElement(By.id("state")).sendKeys("karnataka");
		driver.findElement(By.id("zipCode")).sendKeys("56077");
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		String expectedres = "Thank you for your purchase today!";
		String actualres = driver.findElement(By.xpath("//h1[contains(text(),'Thank you')]")).getText();
		System.out.println(actualres);
		Assert.assertEquals(expectedres, actualres);
		driver.quit();
		
		
	
	}

}
