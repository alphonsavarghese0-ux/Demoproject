package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageNewsPage  {
	@FindBy(xpath="//a[contains(@href,'list-news') and contains(text(),'More')]")
	WebElement moreInfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement newclick;
	@FindBy(xpath="//textarea[@id='news']")
	WebElement enternews;
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveclick;
	public void moreInfo()
	{
		moreInfo.click();
	}
	public void newButtonClick()
	{
		newclick.click();
	}
	
	public void enterTheNews(String news)
	{
		enternews.sendKeys(news);
	}
	
	public void clickSaveButton()
	{
		
	}
	
	public boolean isAlertDisplayed()
	{
		return saveclick.isDisplayed();
			
	}

}
