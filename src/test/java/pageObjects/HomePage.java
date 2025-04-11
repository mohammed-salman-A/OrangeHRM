package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//button[@class='oxd-icon-button orangehrm-quick-launch-icon']") WebElement leaves;
	@FindBy(xpath="//div[@class='card-center']//div[@class='card-item card-body-slot']") List<WebElement> leavelist;
	
	@FindBy(xpath="//span[text()='Recruitment']") WebElement recruitbtn;
	@FindBy(xpath="//span[text()='PIM']") WebElement pim;

	public void clickLeaveList() {
		leaves.click();
		
	}
	public void DispLeaveList() {
		if(!leavelist.isEmpty()) {
			for(WebElement leave:leavelist) {
				System.out.println(leave.getText());
			}
		}
	}
	public void clickRecruitment() {
		recruitbtn.click();
	}
	public void clickPIM() {
		pim.click();
		
	}
}
