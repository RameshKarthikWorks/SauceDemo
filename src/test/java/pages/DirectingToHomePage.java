package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import projectSpecification.BaseClass;

public class DirectingToHomePage extends BaseClass{
	
	
	@And("Go back to Homepage")
	public void go_to_backPage() {
		driver.findElement(By.id("back-to-products")).click();
	}

}
