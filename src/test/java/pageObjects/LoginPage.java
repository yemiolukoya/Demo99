package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//td[text()='Manger Id : mngr344271']")
	WebElement managerID;

	public boolean isManagerIdExist()

	{
		try

		{
			return (managerID.isDisplayed());
		} catch (Exception e) {

		}
		return (false);
	}

}
