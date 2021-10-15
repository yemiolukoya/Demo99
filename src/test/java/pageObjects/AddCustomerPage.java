package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href=\"addcustomerpage.php\"]")
	WebElement newCustomerLink;

	@FindBy(xpath = "//input[@name=\"name\"]")
	WebElement name;

	@FindBy(xpath = "//input[@value=\"m\"]")
	WebElement male;

	@FindBy(xpath = "//input[@name=\"dob\"]")
	WebElement dob;

	@FindBy(xpath = "//textarea[@name=\"addr\"]")
	WebElement address;

	@FindBy(xpath = "//input[@name=\"city\"]")
	WebElement city;

	@FindBy(xpath = "//input[@name=\"state\"]")
	WebElement state;

	@FindBy(xpath = "//input[@name=\"pinno\"]")
	WebElement pin;

	@FindBy(xpath = "//input[@name=\"telephoneno\"]")
	WebElement phoneNumber;

	@FindBy(xpath = "//input[@name=\"emailid\"]")
	WebElement emailid;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//input[@value=\"Submit\"]")
	WebElement submitBtn;

	public void clickNewCustomerLink() {
		newCustomerLink.click();
	}

	public void enterName(String names) {
		name.sendKeys(names);
	}

	public void clickGender() {
		male.click();
	}

	public void enterDOB(String dobs) {
		dob.sendKeys(dobs);
	}

	public void enterAddress(String addres) {
		address.sendKeys(addres);
	}

	public void enterCity(String cities) {
		city.sendKeys(cities);
	}

	public void enterState(String states) {
		state.sendKeys(states);
	}

	public void enterPin(String pinNo) {
		pin.sendKeys(pinNo);
	}

	public void enterPhoneNumber(String phoneNo) {
		phoneNumber.sendKeys(phoneNo);
	}

	public void enterEmailid(String emailID) {
		emailid.sendKeys(emailID);
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickSubmitBtn() {
		submitBtn.click();
	}
}
