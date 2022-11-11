package pages;

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
@FindBy(xpath = "//img[@class='logo']")
WebElement logo;

@FindBy(xpath = "//a[@class='banner__link banner__link--login js-login theme--button-dark-blue']")
WebElement logIn;

@FindBy(xpath = "//input[@id='eliloUserID']")
WebElement userId;

@FindBy(id = "loginSubmit")
WebElement logInButton;

public boolean logoDisplayed() {
boolean img	= logo.isDisplayed();
	System.out.println("Is the logo displayed? " + img);
	return img;
}
public void clicklogIn() {
	logIn.click();
	
}
public void clickuserIdField() {
	userId.click();
}
public void logInButtonclicked() {
	logInButton.click();
}




}
