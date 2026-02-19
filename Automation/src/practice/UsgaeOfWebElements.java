package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsgaeOfWebElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("nithya@123",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		password.clear();
		Thread.sleep(2000);
		WebElement createaccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createaccount.click();
		WebElement signup = driver.findElement(By.name("websubmit"));
		boolean res = signup.isEnabled();
		if(res==true) {
			System.out.println("enabled");
		}else {
			System.out.println("Disabled");
		}
		boolean res1 = signup.isDisplayed();
		if(res1==true) {
			System.out.println("Displayed");
		}else {
			System.out.println("not displayed");
		}
		String tagname = signup.getTagName();
		System.out.println(tagname);

		String text = signup.getText();
		System.out.println(text);

		String color = signup.getCssValue("color");
		System.out.println(color);

		WebElement radiobtn = driver.findElement(By.xpath("//label[text()='Female']"));
		Thread.sleep(2000);
		radiobtn.click();
		Thread.sleep(2000);
		boolean btn = radiobtn.isSelected();
		if(!btn) {
			System.out.println("selected");
		}else {
			System.out.println("not selected");
		}
		WebElement maleradiobtn = driver.findElement(By.xpath("(//input[@type='radio']/../../label)[1]"));
		Point p1 = maleradiobtn.getLocation(); int xAxis1=p1.getX(); int yAxis1=p1.getY();

		WebElement femaleradiobtn = driver.findElement(By.xpath("(//input[@type='radio']/../../label)[2]"));
		Point p2 = femaleradiobtn.getLocation(); int xAxis2=p2.getX(); int yAxis2=p2.getY();

		WebElement otherradiobtn = driver.findElement(By.xpath("(//input[@type='radio']/../../label)[3]"));
		Point p3 = otherradiobtn.getLocation(); int xAxis3=p3.getX(); int yAxis3=p3.getY();

		System.out.println("Y axis of ele:"+yAxis1);
		System.out.println("Y axis of ele:"+yAxis2);
		System.out.println("Y axis of ele:"+yAxis3);

		if(yAxis1==yAxis2 && yAxis1==yAxis3) {
			System.out.println("Alignement same");
		}else {
			System.out.println("Alignement not same");
		}
		WebElement firstname = driver.findElement(By.name("firstname"));
		Dimension d1 = firstname.getSize(); int h1=d1.getHeight(); int w1=d1.getWidth();

		WebElement surename = driver.findElement(By.name("lastname"));
		Dimension d2 = surename.getSize(); int h2=d2.getHeight(); int w2=d2.getWidth();

		System.out.println("Height of ele:"+h1+"pixels");
		System.out.println("Width of ele:"+w1+"pixels");
		System.out.println("Height of ele:"+h2+"pixels");
		System.out.println("Width of ele:"+w2+"pixels");


		if(d1==d2 && w1==w2 ) {
			System.out.println("same size");
		}else {
			System.out.println("not same size");
		}

		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[1]\")"));
		submit.submit();
		
		driver.quit();
	}
}
