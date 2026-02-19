package testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;
@Listeners(genericlibrary.ListnerImplementation.class)
public class ElectronicModules extends BaseClass {
	@Test(groups="SmokeTesting")
	public void camera() {
		Assert.fail();
		Reporter.log("camera",true);
	}
	@Test(groups="RegressionTesting")
	public void smartPhone() {
		Reporter.log("smartPhone",true);
	}
	
	@Test(groups="RegressionTesting")
	public void watch() {
		Assert.fail();
		Reporter.log("watch",true);
	}
	@Test(groups="RegressionTesting",dependsOnMethods = "camera")
	public void pendrive() {
		Reporter.log("pendrive",true);
	}

}
