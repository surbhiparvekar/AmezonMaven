package AmezonTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import amezonpages.AmezonLoginpageAdvance;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AmezonBaseTest {

	
	public static WebDriver driver;
	AmezonLoginpageAdvance lpa;
	
	@BeforeSuite
	public void intialazebrowser()
	{
		//System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
	}
	
	@BeforeClass
	
	public void creatobject()
	{
		lpa = new AmezonLoginpageAdvance(driver);
	}
}
