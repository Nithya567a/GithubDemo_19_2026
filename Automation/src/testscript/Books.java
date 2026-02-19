package testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;

public class Books extends BaseClass {
	@Test(groups="SmokeTesting")
	public void ramayana() {
		//Assert.fail();
		Reporter.log("Ramayana",true);
		}
	@Test(groups="RegressionTesting")
	public void mahabharatha() {
		Reporter.log("mahabharatha",true);
		}
	@Test(groups="RegressionTesting")
	public void bhagavadgita () {
		Reporter.log("bhagavadgita",true);
		}
	

}
