package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant1.Constant;
import utilities.FileUploadUtility;
import utilities.WaitUtility;

public class LoginPage {
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[contains@class,'alert-dismissible']")
	WebElement alert;

	public WebDriver driver;

	// FileUploadUtility fileupload = new FileUploadUtility();// in case of multiple
	// image upload, declared it as globally//
	WaitUtility waitutility=new WaitUtility();

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterTheUserName(String username2) {
		username.sendKeys(username2);
	}

	public void enterThePassWord(String password2) {
		password.sendKeys(password2);
	}

	public void buttonClick()
	{
		
		waitutility.waitForElementToBeClickable(driver, signin);
		signin.click();
	}

//public void chooseFile()
	{
		FileUploadUtility fileupload = new FileUploadUtility();// no need to call if it is declared as globally
		// fileupload.fileUploadUsingSendKeys(Webelement name, Constant.APPLEIMAGE);
	}

	public boolean isDashBoardDisplayed() {
		return dashboard.isDisplayed();
	}

	public void redAlert() {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}
}
