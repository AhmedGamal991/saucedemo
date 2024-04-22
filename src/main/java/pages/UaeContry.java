package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "user-name")
	WebElement user_name;

	@FindBy(id = "password")
	WebElement passwordEle;

	@FindBy(id = "login-button")
	WebElement login_button;

	public void userLogin(String email, String password) {
		setTextElementText(user_name, email);
		setTextElementText(passwordEle, password);
		clickButton(login_button);
	}
}
