package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC002_Dashboard  extends BaseClass{

	
	@Test
	void display_leaveList() {
	
		LoginPage lp = new LoginPage(driver);
		 lp.setUserName("Admin");
		 lp.setPassword("admin123");
		 lp.clickLogin();
		 
		 HomePage hp = new HomePage(driver);
		 hp.clickLeaveList();
		 hp.DispLeaveList();
	}
	
}
