package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PimPage;

public class TC004_AddNewEmployeeTest extends BaseClass {
	@Test
	void Login() {
			LoginPage lp = new LoginPage(driver);
			lp.setUserName(p.getProperty("username"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			Assert.assertEquals(lp.verifyDashBoard(), true);
			
	}
	@Test
	void addNewEmp() {
		HomePage hp = new HomePage(driver);
		hp.clickPIM();
		
		PimPage pp = new PimPage(driver);
		pp.clickAddbtn();
		pp.setFname("mr");
		pp.setMname("random");
		pp.setLname("man");
		pp.clickSave();
		
	}
	
}
