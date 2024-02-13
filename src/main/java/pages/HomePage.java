package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;

	}

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement labs_bike_light;

	public static @FindBy(id = "remove-sauce-labs-bike-light") WebElement remove_sauce_labs;

	@FindBy(id = "shopping_cart_container")
	WebElement cart_container;

	@FindBy(id = "react-burger-menu-btn")
	WebElement menuBut;

	@FindBy(id = "logout_sidebar_link")
	WebElement LogoutBut;

	public static @FindBy(id = "login_credentials") WebElement AssLogOut;

	public void addToCart() throws InterruptedException {
		clickButton(labs_bike_light);
		Thread.sleep(2000);
	}

	public void goToCart() throws InterruptedException {
		clickButton(cart_container);
		Thread.sleep(2000);
	}

	public void LogOut() throws InterruptedException {
		clickButton(menuBut);
		Thread.sleep(2000);
		clickButton(LogoutBut);
		Thread.sleep(2000);
	}
}
