package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import projectSpecification.BaseClass;

public class ProductPage extends BaseClass{
	
	@When("Click the Sauce labs onesie product")
	public void click_the_sauce_labs_onesie_product() {

		// Click Add to cart on product Sauceonesie
		driver.findElement(By.xpath("//a/div[text()='Sauce Labs Onesie']/following::div[2]/button")).click();

	}

}
