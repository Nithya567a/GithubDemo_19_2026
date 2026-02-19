package assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/Nithya%20G/Documents/Dropdown.html");
		
		WebElement city = driver.findElement(By.id("city"));
	    Thread.sleep(2000);
	    Select s = new Select(city);
		List<WebElement> options = s.getOptions();
		Thread.sleep(2000);
		
		//asce order select
		for(int i=0; i<options.size();i++) {
			s.selectByIndex(i);
			Thread.sleep(500);
		}
		Thread.sleep(2000);
		
		//desc order deselect
		int sz=options.size()-1; 
		Thread.sleep(2000);
		for(int i=sz; i>=0; i--){
			s.deselectByIndex(i);
			Thread.sleep(500);
		}
		Thread.sleep(2000);
		
		//int last=options.size()-1
		s.selectByIndex(options.size()-1);
		Thread.sleep(2000);
		//alphabetic order
	 List<String> cityname = new ArrayList<>();
	 for(WebElement opt:options) {
		 cityname.add(opt.getText());
	 }
	 Collections.sort(cityname);
	 for(String s1:cityname) {
		 System.out.println(s1);
	 }
	 //without duplicate
	 Set<String> uniquecity = new TreeSet<>();
	 for(String a:cityname) {
		 uniquecity.add(a);
	 }
	 for(String s1:uniquecity) {
		 System.out.println(s1);
	 }
	 driver.quit();
		
		
		
	}

}
