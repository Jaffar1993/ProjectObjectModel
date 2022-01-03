package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.BasePage;

public class BrowserFactory extends BasePage{
	
	static WebDriver driver;
	public static WebDriver LaunchBrowser() {//This class transfer the WebDriver to LoginTest class.
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://techfios.com/billing/?ng=admin/");
		
		return driver;
	}
	
	public static void TearDown() {
		driver.close();
		driver.quit();
	}

}
