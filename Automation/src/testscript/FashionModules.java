package testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;

public class FashionModules extends BaseClass {
	@Test(groups="SmokeTesting")
	public void shoes() {
		Reporter.log("shoes",true);
		
	}
	//@Test((groups="RegressionTesting"))
	@Test(groups="RegressionTesting")
	public void jeans() {
		Reporter.log("jeans",true);
		
	}
	@Test(groups="RegressionTesting")
	public void kurtha() {
		Reporter.log("kurtha",true);
		
	}

}
