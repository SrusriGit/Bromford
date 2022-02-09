package BromfordTestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BormfordBasePage.BasePage;

import BromfordPageLayer.BromfordLoginPage;
import BromfordPageLayer.ITSMProblemPage;

public class BromfordLoginPageTest extends BasePage {
	
	BromfordLoginPage bfLoginPage  ;
	ITSMProblemPage itsmProblem;
	 
	public BromfordLoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		bfLoginPage = new BromfordLoginPage();	
}
	
	@Test(priority=1)
	public void SingInToQATest() throws InterruptedException{
		 bfLoginPage.validatingQALoginPage(prop.getProperty("username1"), prop.getProperty("password1"));
		
	}
	
	
	@Test(priority=2)
	public void SingInToPortalTest() throws InterruptedException{
		 bfLoginPage.validatingPortalLoginPage(prop.getProperty("username9"), prop.getProperty("password2"));
		
	}
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
}
