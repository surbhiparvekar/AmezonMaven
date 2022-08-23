package AmezonTestCases;

import org.testng.annotations.Test;

public class AmezonLoginTest extends AmezonBaseTest {

	@Test(priority = 1)
	public void validateloginpage() 
	{
		
		lpa.allwindow();
	
	    lpa.loginpage();
	}
}
