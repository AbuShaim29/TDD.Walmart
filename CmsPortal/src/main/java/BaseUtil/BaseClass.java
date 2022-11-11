package BaseUtil;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;


public class BaseClass {
WebDriver driver;
HomePage homePage = new HomePage(driver);

@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abu shaim\\eclipse-workspace\\gov.portal.cms\\driver\\chromedriver.exe");
	 driver = new ChromeDriver(); // This line will instantiate the webdriver and chromedriver will be used
	 driver.get("https://portal.cms.gov/portal");
}

@AfterMethod
public void tearup() {
	driver.quit();
}








}
