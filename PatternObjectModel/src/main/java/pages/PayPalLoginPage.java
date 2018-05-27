package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class PayPalLoginPage extends SeMethods {
	
	public PayPalLoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how= How.ID, using="signup-button")
	WebElement eleSignUp;
	
	

	public PayPalSignUpPage clickSignUp() {
		click(eleSignUp);
		return new PayPalSignUpPage();
	}
	
	
	
	
}
