package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class StepDefinition extends AbstractTestNGCucumberTests {

	public static WebDriver driver;

	public static WebDriver wait;

	@Given("Open the browser")
	public void open_the_browser() {

		// Removing notification from the browser
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifiactions");

		// Initialize the Browser
		driver = new ChromeDriver(options);
	}

	@When("Nagivating to the SauceDemo website")
	public void nagivating_to_the_sauce_demo_website() {

		// Open the Url link
		driver.get("https://www.saucedemo.com/");

		// maximize the window
		driver.manage().window().maximize();

		// Initalize the Implicityly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//		// Initialize the WebDriver wait
//		wait = (WebDriver) new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	@When("User login with creditionals")
	public void user_login_with_creditionals() {

		// entering the username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// entering the password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Click loginButton
		driver.findElement(By.id("login-button")).click();
	}

	@When("Click the Sauce labs onesie product")
	public void click_the_sauce_labs_onesie_product() {

		// Click Add to cart on product Sauceonesie
		driver.findElement(By.xpath("//a/div[text()='Sauce Labs Onesie']/following::div[2]/button")).click();

	}

	@When("Click Add to Cart")
	public void click_add_to_cart() {

		// Click Add to Cart Icon on above
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

	}

	@When("Click CheckOut button")
	public void click_check_out_button() {

		// Click CheckOutButton

		driver.findElement(By.id("checkout")).click();

	}

	@When("Enter the firstname {string}")
	public void enter_the_firstname(String firstname) {

		driver.findElement(By.id("first-name")).sendKeys(firstname);

	}

	@When("Enter the lastname {string}")
	public void enter_the_lastname(String lastname) {

		driver.findElement(By.id("last-name")).sendKeys(lastname);

	}

	@When("Enter the postal code {string}")
	public void enter_the_postal_code(String postalCode) {

		driver.findElement(By.id("postal-code")).sendKeys(postalCode);

	}

	@When("Click Continue")
	public void click_continue() {

		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	@Then("Verify the purchase ID and Click Finish")
	public void verify_the_purchase_id_and_click_finish() {

		String purchaseNumber = driver.findElement(By.xpath("//div[@class='summary_info']/child::div[2]")).getText();

		System.out.println(purchaseNumber);

		driver.findElement(By.xpath("//button[@id='finish']")).click();

	}

	@And("Go back to Homepage")
	public void go_to_backPage() {
		driver.findElement(By.id("back-to-products")).click();
	}

}
