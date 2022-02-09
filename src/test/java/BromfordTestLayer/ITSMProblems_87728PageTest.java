package BromfordTestLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BormfordBasePage.BasePage;
import BromfordPageLayer.BromfordLoginPage;
import BromfordPageLayer.ITSMProblemPage;
import BromfordPageLayer.ITSMProblems_87728Page;
import BromfordTestUtil.Testutil;

public class ITSMProblems_87728PageTest extends BasePage {
	
	ITSMProblems_87728Page itsmProblem_87728page;
	Testutil testutil;
	
	public ITSMProblems_87728PageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		testutil = new Testutil();
		itsmProblem_87728page =new ITSMProblems_87728Page();
	}
	
	@Test(priority=1)
	 public void ITSMProblems_87728Page() throws InterruptedException {
		itsmProblem_87728page.ValidateNewUserId(prop.getProperty("username7"),prop.getProperty("password2"));
		testutil.switchToFrame();
		itsmProblem_87728page.ClickOnAPP();
		itsmProblem_87728page.UserCreatingProb();
		}
	

}
