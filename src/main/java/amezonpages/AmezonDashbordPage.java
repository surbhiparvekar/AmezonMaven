package amezonpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmezonDashbordPage {

	
	
		@FindBy(xpath = "//*[@data-asin='B08444S68L']//*[@class='a-size-medium a-color-base a-text-normal']")
		WebElement mobilephone;
	
}
