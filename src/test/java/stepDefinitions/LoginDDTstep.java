package stepDefinitions;

import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.DataReader;

public class LoginDDTstep {
	
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	Logger logger; // for logging

	public List<HashMap<String, String>> datamap; // for reading data from excel

	
	@Given("check user navigates to MyAccount page by passing email and password with excel row {string}")
	public void check_user_navigates_to_my_account_page_by_passing_email_and_password_with_excel_row(String rows) throws InterruptedException {
		Thread.sleep(5000);

		datamap = DataReader.data(
				System.getProperty("user.dir")
						+ "/testData/Opencart_LoginDataCucumber.xlsx",
				"Sheet1");

		int index = Integer.parseInt(rows) - 1;
		String userId = datamap.get(index).get("userID");
		String password = datamap.get(index).get("password");
		String exp_res = datamap.get(index).get("res");
		
		hp=new HomePage(driver);
		
		hp.enterUserId(userId);
		hp.enterPassword(password);
		hp.clickLoginBtn();
		
		
		
	}

}
