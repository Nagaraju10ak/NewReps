package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.PayPalLoginPage;
import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class TC001_SignUp_PayPal extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName="TC001_SignUp";
		testDescription="Pay Pal Sign UP";
		testNodes="Leads";
		category="Sanity";
		authors="rishabh";
		browserName="chrome";
		dataSheetName="TC005";
	}
	@Test(dataProvider="fetchData")
	public void payPalSignUp(String country,String email, String pass, String confrmPass) {
		
		new PayPalLoginPage()
		.clickSignUp()
		.selectRadioButton()
		.clickNextButton()
		.selectCountry(country)
		.enterEmail(email)
		.enterPass(pass)
		.enterConfirmPass(confrmPass)
		.clickContinueButton()
		.verifyPayPAlSuccess();
		
		
		/*.verifyLoggedName(vName)
		.clickLogOut();	*/		
	}
	

}
