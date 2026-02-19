package methods_of_webdrivers;

import org.openqa.selenium.edge.EdgeDriver;

public class UsageOfGet {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String expUrl = "https://www.instagram.com/";
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Instagram")&& url.equals("https://www.instagram.com/")) {
			System.out.println("Pass");
		}else {
			System.out.println("fail");
		}
		Thread.sleep(2000);

		driver.close();
	}

}
