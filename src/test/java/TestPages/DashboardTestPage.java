package TestPages;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pageclass.DashboardPage;
import Pageclass.Loginpage;
import base.BaseClass;

public class DashboardTestPage extends BaseClass {
	
	@Test
	public void verifyProductLink() {
		Loginpage lp=new Loginpage(driver);
		lp.perfomLogin();
		DashboardPage dp=new DashboardPage(driver);
		dp.checkProductLinkFunction();
		String Expected="Products / nopCommerce administration";
		String Actual=driver.getTitle();
		Assert.assertEquals(Actual,Expected);
	}

}
