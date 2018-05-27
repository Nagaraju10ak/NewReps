package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {
	
	public ViewLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "viewLead_firstName_sp")
	WebElement eleViewFirstName;
	@FindBy(how = How.XPATH, using = "(//a[@class = 'subMenuButton'])[3]")
	WebElement eleEditButton;
	@FindBy(how = How.ID, using = "viewLead_lastName_sp")
	WebElement eleUpdatedLName;
	@FindBy(how = How.XPATH, using = "//a[@class='subMenuButtonDangerous']")
	WebElement eleDeleteButton;
	
	@Then("verify first name as (.*)")
	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(eleViewFirstName, data);
		
		return this;
	}
	
	public OpentapsCRMPage clickEditButon() {
			click(eleEditButton);
			return new OpentapsCRMPage();
	}
	
	public ViewLeadPage verifyUpdatedLastName(String data) {
		verifyExactText(eleUpdatedLName, data);
		
		return this;
	}
	
public MyLeadPage clickDeleteButton() {
	click(eleDeleteButton);
	return new MyLeadPage();
}
	
	
	

}
