package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;

public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']")
public static WebElement logo;

@FindBy(xpath = "//input[@id='cms-login-userId']")
 public  WebElement userid;

public void clickUserField() {
	userid.click();
}

//public boolean verifylogo() {
	//logo.isDisplayed();
 //return false;
}





