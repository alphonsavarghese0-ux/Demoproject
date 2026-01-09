package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	
//implicit wait : use only 1 time in frame work .Given Inside base class after loading URL.Applicable for all elements//Dynamic or intelligent wait
//Explicit wait : Worked Based on condition base. Not applicable for all elements.All known as global Or static wait	
//Fluent wait : Can set interval/Can customizes polling//Worked based on condition base//Can ignore exception//Advanced version of explicit wait
	public static final int IMPLICITWAIT=5;
	public static final int FLUENTWAIT=20;
	public static final int POLLWAIT=5;
	public static final int EXPLICITWAIT=3;
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICITWAIT));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	    
	}
	
public void WaitForElement(WebDriver driver, WebElement target) {
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(FLUENTWAIT))
		        .pollingEvery(Duration.ofSeconds(POLLWAIT))
		        .ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.elementToBeClickable(target));
	}
	
}
