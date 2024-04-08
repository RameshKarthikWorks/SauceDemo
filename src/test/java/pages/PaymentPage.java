package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import projectSpecification.BaseClass;

public class PaymentPage extends BaseClass{
	
	@Then("Verify the purchase ID and Click Finish")
	public void verify_the_purchase_id_and_click_finish() {

		String purchaseNumber = driver.findElement(By.xpath("//div[@class='summary_info']/child::div[2]")).getText();
		
		String[] split = purchaseNumber.split("#");
		
	
		System.out.println("The Order number is"+" "+ split[1]);
		

		driver.findElement(By.xpath("//button[@id='finish']")).click();

	}

}
