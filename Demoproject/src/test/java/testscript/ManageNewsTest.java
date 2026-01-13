package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base
{
    @Test
	public void AlertPresent() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "Loginpage");
		String password = ExcelUtility.getStringData(1, 1, "Loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassWord(password);
		loginpage.buttonClick();
		
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.moreInfo();
		managenewspage.newButtonClick();
		managenewspage.enterTheNews("job fair");
		managenewspage.clickSaveButton();
		Boolean bool = managenewspage.checkAlert();
		Assert.assertTrue(bool,"by giving news ,alert not present");
		
	}
}
