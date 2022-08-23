package amezonpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmezonLoginpageAdvance {

	public static WebDriver driver;
	
	   
	@FindBy(xpath = "//*[@class='hm-icon nav-sprite']")WebElement altwindow;
	
	@FindBy(xpath = "//*[@id='hmenu-customer-profile-right']")WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id='ap_email']")WebElement uname;
	
	@FindBy(xpath = "(//*[@id='continue'])[2]")WebElement continuebutton;
	
	@FindBy(xpath = "//*[@id='ap_password']")WebElement pass;
	
	@FindBy(xpath = "//*[@id='signInSubmit']")WebElement finalsigninbutton;
	
	
	//WebDriver driver;
	
	public AmezonLoginpageAdvance(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void allwindow()
	{
		 altwindow.click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 loginbutton.click();
		 
	}
	
		public void loginpage()
		{
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		uname.sendKeys("surbhiparvekar04@gmail.com");
		continuebutton.click();
		pass.sendKeys("rushi31");
		finalsigninbutton.click();
		
	}
}
