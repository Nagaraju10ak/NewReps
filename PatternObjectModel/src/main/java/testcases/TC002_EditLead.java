package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_EditLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC002_Create_Lead";
		testDescription="Editing a lead";
		testNodes="Leads";
		category="Sanity";
		authors="rishabh";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
public void EditLead(String uName,String pwd,String fName, String cName, String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.typeFirstName(fName)
		.clickFindLeadButton()
		.clickLeadId()
		.clickEditButon()
		.typeCompanyName(cName)
		.typeLastName(lName)
		.clickUpdateButton()
		.verifyUpdatedLastName(lName);


}
}
