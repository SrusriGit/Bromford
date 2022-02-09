package BromfordTestLayer;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BormfordBasePage.BasePage;
import BromfordPageLayer.BromfordLoginPage;
import BromfordPageLayer.ITSMProblemPage;

import BromfordTestUtil.Testutil;

public class ITSMProblemTest extends BasePage {
	
	BromfordLoginPage bfLoginPage;
	Testutil testUtil;
	ITSMProblemPage itsmProblem;
	
	
	String sheetName = "Problems";
	
	public ITSMProblemTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		testUtil = new Testutil();
		itsmProblem = new ITSMProblemPage() ;	
		testUtil = new Testutil();
		bfLoginPage = new BromfordLoginPage();
		//itsmProblem =  bfLoginPage.validatingQALoginPage(prop.getProperty("username1"),prop.getProperty("password1")); 
		
	}
	
	
	@Test(priority=1)
	public void ITSMProblems() throws InterruptedException{
		//itsmProblem.CheckTheCNiconAndSingOut();
		//itsmProblem.ClickOnNewAccount();
		itsmProblem.ValidateNewUserId(prop.getProperty("username7"),prop.getProperty("password2"));
		testUtil.switchToFrame();
		itsmProblem.ClickOnAPP();
		itsmProblem.clickProbIcon();
		
		}
	
	/*@Test(priority=2)
	 public void ITSMProblems_87728Page() throws InterruptedException {
		itsmProblem.ValidateNewUserId(prop.getProperty("username7"),prop.getProperty("password2"));
		testUtil.switchToFrame();
		itsmProblem.ClickOnAPP();}
		*/
	
		
	
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}

}
