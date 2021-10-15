package stepDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AddCustomerPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class AddCustomerStep {

	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	AddCustomerPage acp;
	JavascriptExecutor Executor;

	Logger logger; // for logging

	@Then("user click on new customer link")
	public void user_click_on_new_customer_link() throws InterruptedException {
		acp = new AddCustomerPage(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@href=\"addcustomerpage.php\"]")));

		Thread.sleep(500);

	}

	@Then("fillin all the add customer page")
	public void fillin_all_the_add_customer_page() {
		acp.enterName("yemimonew");
		acp.clickGender();
		acp.enterDOB("10/10/2020");
		acp.enterAddress("17 rainham close");
		acp.enterCity("Lagos");
		acp.enterState("Lagos state");
		acp.enterPin("123456");
		acp.enterPhoneNumber("07947278906");
		acp.enterEmailid("yemirf@gmail.com");
		acp.enterPassword("qwertyuiop");
		acp.clickSubmitBtn();

	}

	@Then("Customer Registered Successfully!!! message is displayed")
	public void customer_registered_successfully_message_is_displayed() {

	}

}
