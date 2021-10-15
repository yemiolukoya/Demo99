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
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.AddCustomerPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.DataReader;

public class LoginStep {

	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	AddCustomerPage acp;

	Logger logger; // for logging

	public List<HashMap<String, String>> datamap; // for reading data from excel

	ResourceBundle rb; // for reading properties file
	String br;

	@Before
	public void setup() {
		logger = LogManager.getLogger(this.getClass()); // for logging

		rb = ResourceBundle.getBundle("config");
		br = rb.getString("browser");
	}

	@Given("user opens a browser")
	public void user_opens_a_browser() {

		// WebDriverManager.chromedriver().setup();
		// logger.info("open chrome browser");
	}

	@Given("user navigates to {string}")
	public void user_navigates_to(String url) throws InterruptedException {
		// driver = new ChromeDriver();
		// driver.get(url);
		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);

		} else if (br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);

		} else if (br.equals("edged")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.info("open demo site");

			driver.get(url);
			driver.manage().window().maximize();

		}

	}

	@Given("user enters a valid {string} and {string}")
	public void user_enters_a_valid_and(String string1, String string2) {
		hp = new HomePage(driver);
		hp.enterUserId("mngr358907");
		logger.info("set userID");

		hp.enterPassword("pYsurad");
		logger.info("set Password");

	}

	@When("user clicked login")
	public void user_clicked_login() {
		hp.clickLoginBtn();
		logger.info("click login");

	}

	@Then("welcome to manager's page is displayed with a Manger id: mngr344271")
	public void welcome_to_manager_s_page_is_displayed_with_a_manger_id_mngr344271() 
	

	
	
	{
		
		
//		lp = new LoginPage(driver);
//		lp.isManagerIdExist();
//
//		if (lp.isManagerIdExist()) {
//			Assert.assertTrue(true);
//			logger.info("login messgae is displayed");
//
//		} else {
//			Assert.assertTrue(false);
//			logger.info("login messgae is not displayed");
//
//		}
		
	}
	
	

}
