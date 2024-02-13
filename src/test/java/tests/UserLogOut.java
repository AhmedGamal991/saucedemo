package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegiserionPage;

public class UserLogOut extends TestBase {
	HomePage homepage;
	UserRegiserionPage user_loing;

	@Test(priority = 1)
	public void userlogout() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.LogOut();
		Assert.assertTrue(HomePage.AssLogOut.getText().contains("standard_user"));
	}
}
