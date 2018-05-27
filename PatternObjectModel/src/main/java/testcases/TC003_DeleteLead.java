package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_DeleteLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC003_Delete_Lead";
		testDescription="Deleting a lead";
		testNodes="Leads";
		category="Sanity";
		authors="rishabh";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
public void DeleteLead(String uName,String pwd, String fName ) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.typeFirstName(fName)
		//.clickPhoneTab()
		//.typePhoneNumber(phnNum)
		.clickFindLeadButton()
		.clickLeadId()
		.clickDeleteButton();


}
}
