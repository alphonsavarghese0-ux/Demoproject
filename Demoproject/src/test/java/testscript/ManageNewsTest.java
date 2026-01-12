package testscript;

import org.testng.annotations.Test;
import pages.ManageNewsPage;

public class ManageNewsTest extends LoginTest
{
	@Test
	public void verifyUserIsAbletoClickMoreInfo()
	{
	  ManageNewsPage managenewspage=new ManageNewsPage();
	  managenewspage.moreInfo();
			  
	}
	@Test
	public void verifyUserIsAbleToClickNew()
	{
		ManageNewsPage managenewspage=new ManageNewsPage();
		managenewspage.newButtonClick();
	}
	@Test
	public void verifyUserIsAbleToEnterNews() 
	{
		String news="Mega job Fair";
		ManageNewsPage managenewspage=new ManageNewsPage();
		managenewspage.enterTheNews(news);
		
	}
	@Test
	public void verifyUserIsAbleToClickSaveButton()
	{
		ManageNewsPage managenewspage=new ManageNewsPage();
		managenewspage.clickSaveButton();
		
		boolean newspage=managenewspage.isAlertDisplayed(); 	
	}

}
