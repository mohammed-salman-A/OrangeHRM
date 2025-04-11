package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PimPage extends BasePage {

	public PimPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addbtn;
	@FindBy(xpath="//input[@name='firstName']") WebElement fname;
	@FindBy(xpath="//input[@name='middleName']") WebElement mname;
	@FindBy(xpath="//input[@name='lastName']") WebElement lname;
	@FindBy(xpath="//button[text()=' Save ']") WebElement save;
	
	public void clickAddbtn() {
		addbtn.click();
	}
	
	public void setFname(String fName) {
		fname.sendKeys(fName);
	}
	public void setMname(String mName) {
		mname.sendKeys(mName);
	}
	public void setLname(String lName) {
		lname.sendKeys(lName);
	}
	public void clickSave() {
		save.click();
	}

}
