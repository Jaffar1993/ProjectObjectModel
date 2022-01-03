package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class CustomerPageTest {

	WebDriver driver;
	


	@Test
	public void ValidUserShouldbeAbleToAddCustomers() {
		driver = BrowserFactory.LaunchBrowser();

		// CALLING THE METHODS 
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.EnterUserName("demo@techfios.com");
		login.EnterPassword("abc123");
		login.SubmitButton();

		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.VerifyDashBoardPage();

		CustomerPage customer = PageFactory.initElements(driver, CustomerPage.class);
		customer.Customers();
		customer.AddCustomer();
		customer.EnterFullName("Syed Zain Rizvi");
		customer.Company();
		customer.EnterEmail("zain@yahoo.com");
		customer.EnterPhoneNumber("29192382823");
		customer.EnterAddress("2789 W.Irving Blvd");
		customer.EnterCity("Irving");
		customer.SaveButton();
		BrowserFactory.TearDown();
		
	}

}