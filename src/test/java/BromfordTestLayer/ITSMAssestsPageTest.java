package BromfordTestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BormfordBasePage.BasePage;
import BromfordPageLayer.ITSMAssestsPage;
import BromfordPageLayer.ITSMProblemPage;
import BromfordTestUtil.Testutil;

public class ITSMAssestsPageTest extends BasePage {
	
	Testutil testUtil;
	ITSMAssestsPage itsmAssests;
	
	public ITSMAssestsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		Testutil testUtil;
		itsmAssests = new ITSMAssestsPage();
		
	}
	@Test
	public void LoginAsTestAnalyst() throws InterruptedException {
		itsmAssests.LoginwithCredentails(prop.getProperty("username8"),prop.getProperty("password1"));
		
		
	}
	
	@AfterMethod
	public void tearDown(){ 
		//driver.quit();
	}

}
