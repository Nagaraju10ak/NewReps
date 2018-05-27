package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.SeMethods;

public class PayPalSignUpPage extends SeMethods {
	
	public PayPalSignUpPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how=How.ID, using = "radio-personal")
	WebElement eleRadioBUtton;
	@FindBy(how=How.LINK_TEXT, using="Next")
	WebElement eleNExtButton;


	public PayPalSignUpPage selectRadioButton() {

		boolean selected = verifySelected(eleRadioBUtton);
		if(!selected) {
			click(eleRadioBUtton);
		}
		else
			System.out.println("radio button is selected");
		return this;
	}

	public PayPalAccountPage clickNextButton() {
		click(eleNExtButton);
		return new PayPalAccountPage();
	}
}
