package TestPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageclass.Loginpage;
import base.BaseClass;

public class LoginTestPage  extends BaseClass{
	
	
	@Test
	public void verifyLoginfunction() {
		Loginpage lp=new Loginpage(driver);
		lp.perfomLogin();
		String actualValue=driver.getTitle();
		String Expectedvalue="Dashboard / nopCommerce administration";
		Assert.assertEquals(actualValue, Expectedvalue);
	}

}
