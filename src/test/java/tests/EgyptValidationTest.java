package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegiserionPage;

public class AddProductToShoppingCartTest extends TestBase {
	HomePage homepage;
	UserRegiserionPage user_loing;

	@Test(priority = 1)
	public void addItemToCart() throws InterruptedException {
		user_loing = new UserRegiserionPage(driver);
		user_loing.userRegistertion("standard_user", "secret_sauce");
		homepage = new HomePage(driver);
		homepage.addToCart();
		Assert.assertTrue(HomePage.remove_sauce_labs.getText().contains("Remove"));
	}
}
