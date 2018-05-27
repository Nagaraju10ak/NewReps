package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;
import wdMethods.SeMethods;

public class PayPalAccountPage extends SeMethods {

	public PayPalAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="country")
	WebElement eleCountryName;
	@FindBy(how=How.ID, using="email")
	WebElement eleEmail;
	@FindBy(how=How.ID, using="password")
	WebElement elePassword;
	@FindBy(how=How.ID, using="confirmPassword")
	WebElement eleConfirmPass;
	@FindBy(how=How.ID, using="_eventId_personal")
	WebElement eleContinueButton;
	
	
	public PayPalAccountPage selectCountry(String data) {
		selectDropDownUsingText(eleCountryName, data);
		return this;
	}
	
	public PayPalAccountPage enterEmail(String data) {
		type(eleEmail, data);
		return this;
	}
	public PayPalAccountPage enterPass(String data) {
		type(elePassword, data);
		return this;
	}
	public PayPalAccountPage enterConfirmPass(String data) {
		type(eleConfirmPass, data);
		return this;
	}
	public PayPalSignUpSucPage clickContinueButton() {
		click(eleContinueButton);
		return new PayPalSignUpSucPage();
	}
}
