package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {
	
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "(//div[@class='x-form-element']/input)[12]")
	WebElement eleSearchFirstName;
	@FindBy(how= How.XPATH, using="//button[text()='Find Leads']")
	WebElement eleFindLeadButton;
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")
	WebElement eleSelectLeadId;
	@FindBy(how=How.ID, using="//span[@class='x-tab-strip-inner']/span[text()='Phone']")
	WebElement elePhoneTab;
	@FindBy(how=How.NAME, using="//input[@name='phoneNumber']")
	WebElement elePhoneNo;
	
	public FindLeadsPage typeFirstName(String data) {
		type(eleSearchFirstName, data);
		return this;
	}
	
	public FindLeadsPage clickFindLeadButton() {
		click(eleFindLeadButton);
		return this;
	}
	
	public ViewLeadPage clickLeadId() {
		click(eleSelectLeadId);
		return new ViewLeadPage();
	}
	
	public FindLeadsPage clickPhoneTab() {
		click(elePhoneTab);
		return this;
	}
	
	public FindLeadsPage typePhoneNumber(String data) {
		type(elePhoneNo, data);
		return this;
	}

}
