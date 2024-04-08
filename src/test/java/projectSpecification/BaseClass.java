package projectSpecification;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseClass extends AbstractTestNGCucumberTests{
	
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void preConditions() {

		// Removing notification from the browser
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifiactions");

		// Initialize the Browser
		driver = new ChromeDriver(options);

		// Open the Url link
		driver.get("https://www.saucedemo.com/");

		// maximize the window
		driver.manage().window().maximize();

		// Initalize the Implicityly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		// Initialize the WebDriver wait
//		wait = (WebDriver) new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	@AfterSuite
	public void postConditions()
	{
		driver.close();
	}
	
	

}
