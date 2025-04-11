package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;


public class TC001_LoginTest extends BaseClass{
	@Test
	void verifyLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(p.getProperty("username"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		Assert.assertEquals(lp.verifyDashBoard(), true);
	}
}
