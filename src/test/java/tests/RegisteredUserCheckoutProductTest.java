package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.OrderDetailsPage;
import pages.UserRegiserionPage;

public class RegisteredUserCheckoutProductTest extends TestBase {
	/*
	 * 1- Register User 2- Add to Cart 3- Checkout 5- Logout
	 */

	HomePage homepage;
	UserRegiserionPage user_loing;
	LoginPage loginObject;
	CheckoutPage checkoutObject;
	OrderDetailsPage orderObject;

	@Test(priority = 1)
	public void LoginAndAddToCart() throws InterruptedException {
		user_loing = new UserRegiserionPage(driver);
		user_loing.userRegistertion("standard_user", "secret_sauce");
		homepage = new HomePage(driver);
		homepage.addToCart();
	}

	@Test(priority = 2)
	public void goToCartTest() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.goToCart();
	}

	@Test(priority = 3)
	public void OrderInDetails() throws InterruptedException {
		orderObject = new OrderDetailsPage(driver);
		orderObject.PrintOrderDetails();
	}

	@Test(priority = 4)
	public void filTheForm() throws InterruptedException {
		checkoutObject = new CheckoutPage(driver);
		checkoutObject.UserCheckoutProduct("Areeb", "Company", "11911");
	}

	@Test(priority = 5)
	public void confirmOrderTest() throws InterruptedException {
		checkoutObject = new CheckoutPage(driver);
		checkoutObject.confirmOrder();
		checkoutObject.backHome();

	}

	@Test(priority = 6)
	public void userlogout() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.LogOut();
		Assert.assertTrue(HomePage.AssLogOut.getText().contains("standard_user"));
	}
}
