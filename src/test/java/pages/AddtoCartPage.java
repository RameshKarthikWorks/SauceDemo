package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import projectSpecification.BaseClass;

public class AddtoCartPage extends BaseClass{
	
	
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

}
