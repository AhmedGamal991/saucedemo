package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegiserionPage;

public class UserRegsterationTest extends TestBase {
	HomePage homeObject;
	UserRegiserionPage regsterationObject;
	LoginPage loginObject;

	@Test(priority = 1)
	public void userCanRegisterationSuccssefullay() {
		homeObject = new HomePage(driver);
		regsterationObject = new UserRegiserionPage(driver);
		regsterationObject.userRegistertion("standard_user", "secret_sauce");
		Assert.assertTrue(UserRegiserionPage.ass_message.getText().contains("Products"));

	}

}
