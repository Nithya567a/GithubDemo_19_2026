package learn_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {//Test Class
	
		@Test()
		public void demoA() {//Test Methods
		Reporter.log("helloworld",true);//it will print on both console and report 
	}
		@Test()
			public void demoB() {
				Reporter.log("hi world");//it will print only to report
				//Reporter.log("hi world",false);
			}
		@Test()
		public void demoC() {
			System.out.println("bye world");//it will print only in the c  onsole
		}
			
		}


