package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LoginAndLogout extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_Create_Lead";
		testDescription="Creating a new lead";
		testNodes="Leads";
		category="Sanity";
		authors="rishabh";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd, String cName, String fName, String lName, String phnNumber) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cName)
		.typeFirstName(fName)
		.typeLastName(lName)
		.typePhnNumber(phnNumber)
		.clickCreateLeadButton()
		.verifyFirstName(fName);
		
		/*.verifyLoggedName(vName)
		.clickLogOut();	*/		
	}

}
