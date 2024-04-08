Feature: Validating the Saucedemo purchase functionality 

Scenario Outline:
When User login with creditionals 
And Click the Sauce labs onesie product 
And Click Add to Cart 
And Click CheckOut button
And Enter the firstname '<fistname>'
And Enter the lastname '<lastname>'
And Enter the postal code '<postalcode>'
And Click Continue 
Then Verify the purchase ID and Click Finish
And Go back to Homepage


Examples:
|fistname|lastname|postalcode|
|Ramesh|Aravindh|641305|


