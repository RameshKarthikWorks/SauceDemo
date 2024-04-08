package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import projectSpecification.BaseClass;

public class LoginPage extends BaseClass {
	
	
	@When("User login with creditionals")
	public void user_login_with_creditionals() {

		// entering the username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// entering the password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		// Click loginButton
		driver.findElement(By.id("login-button")).click();
	}

}
