package learn_testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Instagram {
	@Test(priority = 3)
	public void login() {
		//Assert.fail();
		Reporter.log("user has logged in", true);
		}
	
	@Test(priority=1, invocationCount = 3,dependsOnMethods="login")
	public void createPost() {
		Reporter.log("user has create a post", true);
	}
	@Test(dependsOnMethods= {"login","createPost"})
	public void deletePost() {
		Reporter.log("user has delete a post", true);
		
	}

}
