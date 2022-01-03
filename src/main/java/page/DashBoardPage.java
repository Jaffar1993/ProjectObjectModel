package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage extends BasePage {

	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard ')]")
	WebElement DASHBOARD_ELEMENT_FIELD;
	
	public void VerifyDashBoardPage() {
		Assert.assertEquals(DASHBOARD_ELEMENT_FIELD.getText(),  "Dashboard", "Wrong Page!!!");
		
	}

}
