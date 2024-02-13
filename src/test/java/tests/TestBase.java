package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utlitis.Helper;

public class TestBase extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	@BeforeSuite
	public static void startWebBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@AfterSuite
	public void stopBrowser() {
		driver.quit();
	}

	@AfterMethod
	public void screenShotWhenTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("The Test Is Failed! " + " Taking Screenshot..");
			Helper.captureScreenShot(driver, result.getName());
		}
	}
}
