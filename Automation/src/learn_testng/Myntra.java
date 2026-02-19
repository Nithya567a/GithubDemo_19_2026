package learn_testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
	@Test(priority=0)
	public void login() {
		//Assert.fail();
		Reporter.log("user logged in sucessfully",true);
		
	}
	@Test(priority=1, invocationCount = 2, dependsOnMethods = "login")
	public void searchProduct() {
		//Assert.fail();
		Reporter.log("user search a product",true);
		
	}
	@Test(dependsOnMethods ="searchProduct")
	public void logout() {
		Reporter.log("user logged out sucessfully",true);
		
	}
	

}
