package testPages;

import org.testng.annotations.Test;

import base.BaseClass4;


public class HomePageTest extends BaseClass4 {
	@Test
	public void logoTest()  {
		
		homePage.logoDisplayed();
	}
@Test
public void logInTest() {
	homePage.clicklogIn();
}
@Test(enabled = true)
public void userIdTest() throws InterruptedException{
	homePage.clickuserIdField();
}

@Test
public void logInButtonTest() {
	homePage.logInButtonclicked();
}

}
