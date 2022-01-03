package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage extends BasePage {
	
	WebDriver driver;
	
	public CustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	WebElement CUSTOMERS_FIELD;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	WebElement ADD_CUSTOMER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement FULL_NAME_FIELD;
	@FindBy(how = How.XPATH, using = "//select[@name='cid']")
	WebElement COMPANY_DROPDWOWN_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement EMAIL_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']")
	WebElement PHONE_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='address']")
	WebElement ADDRESS_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='city']")
	WebElement CITY_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@id='submit']") WebElement ADD_CONTACTS_SAVE_BUTTON;

	public void Customers() {
		CUSTOMERS_FIELD.click();
	}

	public void AddCustomer() {
		BasePage.WaitForElement(driver, 90, By.xpath("//a[contains(text(),'Add Customer')]"));
		ADD_CUSTOMER_FIELD.click();
	}

	public void EnterFullName(String name) {
		FULL_NAME_FIELD.sendKeys(name);
	}

	public void Company() {
		Select sel = new Select(COMPANY_DROPDWOWN_FIELD);
		sel.selectByVisibleText("SpiderMan LTD");
	}

	public void EnterEmail(String Email) {
		EMAIL_FIELD.sendKeys(Email);
	}

	
	public void EnterAddress(String address) {
		ADDRESS_FIELD.sendKeys(address);
	}

	public void EnterCity(String city) {
		CITY_FIELD.sendKeys(city);
	}

	public void EnterPhoneNumber(String phone) {
		PHONE_NUMBER_FIELD.sendKeys(phone);
	}
	
	public void SaveButton() {
		ADD_CONTACTS_SAVE_BUTTON.click();
	}

	
}