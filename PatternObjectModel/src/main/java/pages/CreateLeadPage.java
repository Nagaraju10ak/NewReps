package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	
	public CreateLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	WebElement eleCompanyName;
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	WebElement eleFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	WebElement eleLastName;
	@FindBy(how=How.ID, using= "createLeadForm_primaryPhoneNumber")
	WebElement elephnNumber;
	@FindBy(how= How.NAME, using="submitButton")
	WebElement eleCreateLeadButton;
	
	@And("enter company name as (.*)")
	public CreateLeadPage typeCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@And("enter first name as (.*)")
	public CreateLeadPage typeFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	
	@And("enter last name as (.*)")
	public CreateLeadPage typeLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	@And("enter phone number as (.*)")
	public CreateLeadPage typePhnNumber(String data) {
		type(elephnNumber, data);
		return this;
	}
	
	@When("click create lead button")
	public ViewLeadPage clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLeadPage();
	}
	
	

}
