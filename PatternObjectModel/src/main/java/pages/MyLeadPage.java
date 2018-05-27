package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods {
	
	public MyLeadPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	WebElement eleCreateLead;
	
	@And("click on create lead")
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage();
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	WebElement eleFindLead;
	public FindLeadsPage clickFindLead() {
		click(eleFindLead);
		return new FindLeadsPage();
	}

}
