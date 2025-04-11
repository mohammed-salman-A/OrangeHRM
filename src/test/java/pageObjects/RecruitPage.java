package pageObjects;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruitPage extends BasePage{

	public RecruitPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']") WebElement addBtn;
	@FindBy(xpath="//input[@name='firstName']") WebElement fname;
	@FindBy(xpath="//input[@name='middleName']") WebElement mname;
	@FindBy(xpath="//input[@name='lastName']") WebElement lname;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']") WebElement vacencyopt;
	@FindBy(xpath="//div[text()='Senior QA Lead']") WebElement selectVacancy;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error']") WebElement email;
	@FindBy(xpath="//input[@name='firstName']") WebElement contact;

	
	@FindBy(xpath="//div[@class='oxd-file-div oxd-file-div--active']") WebElement resume;
	@FindBy(xpath="//input[@placeholder='Enter comma seperated words...']") WebElement keyword;
	@FindBy(xpath="//input[@placeholder='yyyy-dd-mm']") WebElement date;
	@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']") WebElement despt;
	@FindBy(xpath="//span[@class='oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input']") WebElement keepData;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']") WebElement saveBtn;
	
	
	public void clickAddBtn() {
		addBtn.click();
	}
	public void setfname(String fName) {
		fname.sendKeys(fName);
	}
	public void setmname(String mName) {
		mname.sendKeys(mName);
	}
	public void setlname(String lName) {
		lname.sendKeys(lName);
	}
	public void setVacency() {
		vacencyopt.click();
		selectVacancy.click();
		
	}
	public void setEmail(String Email) {
		email.sendKeys(Email);
	}
	
	public void setContact(String number) {
		contact.sendKeys(number);
	}
	
	public void addResume(String file) {
		
		resume.sendKeys(file);
	}
	
	public void setKeyword(String key) {
		keyword.sendKeys(key);
	}
	public void clickKeepData() {
		keepData.click();
	}
	public void clickSave() {
		saveBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
