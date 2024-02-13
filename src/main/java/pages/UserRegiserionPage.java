package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegiserionPage extends PageBase {

	public UserRegiserionPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "user-name")

	WebElement user_name;

	@FindBy(id = "password")

	WebElement passwordEle;

	@FindBy(id = "login-button")

	WebElement login_button;

	public static @FindBy(id = "header_container") WebElement ass_message;

	@FindBy(linkText = "Log out")
	public WebElement logoutLink;

	public void userRegistertion(String email, String password) {
		setTextElementText(user_name, email);
		setTextElementText(passwordEle, password);
		clickButton(login_button);
	}

	public void userLogout() {
		clickButton(logoutLink);
	}

}
