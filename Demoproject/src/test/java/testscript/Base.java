package testscript;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant1.Constant;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import utilities.WaitUtility;

public class Base {
	public WebDriver driver;
FileInputStream fileinputstream;
Properties properties;
	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void initializebrowser(String browser) throws Exception {
		try
		{
			properties=new Properties();
			fileinputstream =new FileInputStream(Constant.FILEINPUTSTREAM);
			properties.load(fileinputstream);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Not Connected");
		}
			
		//driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
		driver.manage().window().maximize();
	}

	// @AfterMethod(alwaysRun=true)
	public void closebrowser() {
		// driver.close();
		driver.quit();
	}

}
