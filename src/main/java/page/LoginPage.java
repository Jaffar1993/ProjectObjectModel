package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	WebDriver driver;

	// Now we establish a relationship between the drivers from LoginTest to
	// LoginPage. The driver coming
	// from the LoginTest. If we transfer a driver from a BrowserFactory it will a
	// two
	// different browsers.
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN_BUTTON;

	public void EnterUserName(String username) {
		USERNAME_FIELD.sendKeys(username);
	}

	public void EnterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}

	public void SubmitButton() {
		SIGNIN_BUTTON.click();
	}

}
