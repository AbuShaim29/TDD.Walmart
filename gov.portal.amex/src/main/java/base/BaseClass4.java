package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass4 {
	WebDriver driver;
protected HomePage homePage;
	
	
	@BeforeMethod
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abu shaim\\eclipse-workspace\\com.nike\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://card.americanexpress.com");
	homePage = new HomePage(driver);
	}
@AfterMethod
public void tearup() {
	//driver.quit();
}

}
