package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(name="username") WebElement usr_name_txt;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement loginBtn;
	@FindBy(xpath="//h6[text()='Dashboard']") WebElement verifyDash;
	@FindBy(xpath="//p[text()='Invalid credentials']") WebElement invalid_cred;
	
	public void setUserName(String usr_name) {
		usr_name_txt.sendKeys(usr_name);
	}
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickLogin() {
		loginBtn.click();
	}
	
	public boolean verifyDashBoard() {
		if(verifyDash.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean verify_msg() {
		if(invalid_cred.isDisplayed()) {
			return true;
		}
		return false;
	}
	
	
}
