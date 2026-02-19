package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement interaction = driver.findElement(By.linkText("Interactions"));
		Actions a = new Actions(driver);
		a.moveToElement(interaction).perform();
		WebElement draganddrop = driver.findElement(By.linkText("Drag and Drop"));
		a.moveToElement(draganddrop).perform();
		driver.findElement(By.linkText("Static")).click();
		WebElement angular = driver.findElement(By.id("angular"));
		WebElement droparea = driver.findElement(By.id("droparea"));
		a.dragAndDrop(angular,droparea).perform();
		WebElement node = driver.findElement(By.id("node"));
		a.clickAndHold(node).moveToElement(droparea).release().build().perform();
		driver.quit();
		}

}
//ClickAndHold means clicking on a web element and holding the mouse button without releasing it 
//until a specific action is completed.
