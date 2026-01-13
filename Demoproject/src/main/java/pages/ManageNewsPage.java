package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsPage  {
	@FindBy(xpath="//a[contains(@href,'list-news') and contains(text(),'More')]")
	WebElement moreInfo;
	@FindBy(xpath="//a[@onclick='click_button(1)']")
	WebElement newclick;
	@FindBy(xpath="//textarea[@id='news']")
	WebElement enternews;
	@FindBy(xpath="//button[@type='submit']")
	WebElement saveclick;
	@FindBy(xpath="//h5[text()=' Alert!']")
	WebElement alertMessage;
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
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
		saveclick.click();
	}
	
	public boolean checkAlert()
	{
		String alert = alertMessage.getText();
		System.out.println(alert);
		return alert.contains("Alert");
			
	}

}
