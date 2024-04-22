package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase {
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "first-name")
	WebElement firstNameTxt;

	@FindBy(id = "last-name")
	WebElement lastNameTxt;

	@FindBy(id = "postal-code")
	WebElement postalCodenum;

	@FindBy(id = "continue")
	WebElement continuebut;

	@FindBy(id = "item_0_title_link")
	WebElement assProduct;

	@FindBy(id = "finish")
	WebElement finishBut;

	@FindBy(tagName = "span")
	WebElement finishMessage;

	@FindBy(id = "back-to-products")
	WebElement backBut;

	public void UserCheckoutProduct(String firstName, String lastName, String postalCode) throws InterruptedException {

		setTextElementText(firstNameTxt, firstName);
		setTextElementText(lastNameTxt, lastName);
		setTextElementText(postalCodenum, postalCode);
		Thread.sleep(1000);
		clickButton(continuebut);
		Thread.sleep(1000);

	}

	public void confirmOrder() throws InterruptedException {
		clickButton(finishBut);
		Thread.sleep(2000);
	}

	public void backHome() throws InterruptedException {
		clickButton(backBut);
		Thread.sleep(2000);
	}

}
