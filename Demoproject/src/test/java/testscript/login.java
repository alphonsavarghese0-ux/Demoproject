package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class login extends Base {
	@Test
	public void login() {

		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		String username1 = "admin";
		username.sendKeys(username1);
		// username.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		String password1 = "admin";
		password.sendKeys(password1);
		// password.sendKeys("admin");
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();

	}

	@Test
	public void incorrectUser() {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		String username2 = "Hello";
		// username.sendKeys("Hello");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		String password2 = "admin";
		// password.sendKeys("admin");
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}

	@Test
	public void incorrectPass() {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		String username3 = "admin";
		// username.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		// password.sendKeys("admins");
		String password3 = "admins";
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}

	@Test
	public void incorrectLogin() {
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		// username.sendKeys("Admin");
		String username4 = "Admin";
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		// password.sendKeys("admins");
		String password4 = "admins";
		WebElement signin = driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
	}

}
