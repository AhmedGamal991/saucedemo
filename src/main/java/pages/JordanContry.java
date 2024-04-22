package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends PageBase {

	public OrderDetailsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "checkout")
	WebElement checkoutBut;

	@FindBy(id = "continue-shopping")
	WebElement continue_shopping;

	public void PrintOrderDetails() throws InterruptedException {
		clickButton(checkoutBut);
		Thread.sleep(1000);
	}

}
