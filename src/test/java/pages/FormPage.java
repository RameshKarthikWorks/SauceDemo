package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import projectSpecification.BaseClass;

public class FormPage extends BaseClass{
	
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

}
