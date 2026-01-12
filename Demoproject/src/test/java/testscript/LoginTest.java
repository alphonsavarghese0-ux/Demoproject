package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	@Test(description = "user is able to login with valid credential")
	public void verifyTheUserIsAbleTologinUsingValidCredentials() throws IOException {
		// String username="admin";
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "Loginpage");
		String password = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassWord(password);
		loginpage.buttonClick();
		boolean homepage = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(homepage, "while giving valid credential home page is not loading ");

	}

	@Test(description = "To check UserIsAbleToLoginUsingInvalidUserName ")
	public void verifyTheUserIsAbleToLoginUsingInvalidUserName() throws IOException {
		String username="Hello";
		 String password="admin";
		//String username = ExcelUtility.getStringData(2, 0, "Loginpage");
		//String password = ExcelUtility.getStringData(2, 1, "Loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassWord(password);
		loginpage.buttonClick();
		//boolean alertmessage = loginpage.isDashBoardDisplayed();
		//Assert.assertTrue(alertmessage, "while giving invalid username home page is not loading ");
	}

	@Test(description = "To check UserIsAbleToLoginWithInvalidPassword ")
	public void verifyTheUserIsAbleToLoginWithInvalidPassword() {
		String username = "admin";
		String password = "hello";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassWord(password);
		loginpage.buttonClick();
	}

	@Test(description = "To check UserIsAbleToLoginWithInvalidCredential")
	public void verifyTheUserIsAbleToLoginWithInvalidCredential() {
		String username = "hai";
		String password = "hai";
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassWord(password);
		loginpage.buttonClick();
	}

}
