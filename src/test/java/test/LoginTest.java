package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	
	WebDriver driver;
	

	@Test
	public void ValidUserShouldLogin() {
		driver = BrowserFactory.LaunchBrowser();//Now we establish a relationship between the drivers.
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);//We pushing a driver into
		//the LoginPage.
		login.EnterUserName("demo@techfios.com");
		login.EnterPassword("abc123");
		login.SubmitButton();
		
		
		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.VerifyDashBoardPage();
		
		BrowserFactory.TearDown();
		
		
	
	}

}
