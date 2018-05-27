package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OpentapsCRMPage extends ProjectMethods {
	
	public OpentapsCRMPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "updateLeadForm_companyName")
	WebElement eleCompanyName;
	@FindBy(how=How.ID, using="updateLeadForm_lastName")
	WebElement eleLastName;
	@FindBy(how= How.NAME, using="submitButton")
	WebElement eleUpdateButton;
	
	
	public OpentapsCRMPage typeCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	public OpentapsCRMPage typeLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	public ViewLeadPage clickUpdateButton() {
		click(eleUpdateButton);
		return new ViewLeadPage();
	}
	
	
	

}