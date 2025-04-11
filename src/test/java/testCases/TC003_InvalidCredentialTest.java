package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC003_InvalidCredentialTest extends BaseClass {

	@Test
	void invalid_login() {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(p.getProperty("invalidusr"));
		lp.setPassword(p.getProperty("invalidpass"));
		lp.clickLogin();
		Assert.assertEquals(lp.verify_msg(), true,"invalid credential displaying Failed");
	}
}
