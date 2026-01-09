package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//Drop down-Multiple times

public class PageUtility {
	private WebDriver driver;

	public void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}

	public void selectByIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);

	}

	public void dropDownSelectByValue(WebElement element, String selectbyvalue) {
		Select select = new Select(element);
		select.selectByValue(selectbyvalue);
	}

	public void dragAndDrop(WebElement element1, WebElement element2) {

		Actions actions = new Actions(driver);
		actions.dragAndDrop(element1, element2).perform();
	}

	public void rightClick(WebElement element) {

		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}

	public void mouseHover(WebElement element) {

		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void clickact(WebElement element) {

		Actions clickaction = new Actions(driver);
		clickaction.click(element).perform();
	}
}
