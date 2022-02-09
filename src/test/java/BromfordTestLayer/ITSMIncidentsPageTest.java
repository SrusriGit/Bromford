  package BromfordTestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BormfordBasePage.BasePage;
import BromfordPageLayer.ITSMIncidentsPage;
import BromfordTestUtil.Testutil;

public class ITSMIncidentsPageTest extends  BasePage {
 
	
	Testutil testutil;
	ITSMIncidentsPage itsmincidents_87668Page;
	
	public ITSMIncidentsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
			
		testutil = new Testutil();
		itsmincidents_87668Page =new ITSMIncidentsPage();
	}
	
  /*   @Test
	public void Incidentscreation() throws InterruptedException {
		itsmincidents_87668Page.LogingToHub(prop.getProperty("username9"),prop.getProperty("password2"));
		itsmincidents_87668Page.CreatingIncidents();
		
	}
	
	 @Test(priority=2)
	  public void NavigateTOticketCreated() throws InterruptedException {
		 itsmincidents_87668Page.LogingToITSM(prop.getProperty("username7"), prop.getProperty("password2"));
		  testutil.switchToFrame();
		  itsmincidents_87668Page.ClickOnAPP();
		  itsmincidents_87668Page.navigatingToTickets();
	  }
	 
	 @Test(priority=3)
	  public void NavigateToCommnet() throws InterruptedException {
		 itsmincidents_87668Page.LogingToITSM(prop.getProperty("username7"), prop.getProperty("password2"));
		  testutil.switchToFrame();
		  itsmincidents_87668Page.ClickOnAPP();
		  itsmincidents_87668Page.LocatingComment();
	  }
	 
	  
	 
	 @Test(priority=4)
	  public void MoveToHubToCheckTicketNo() throws InterruptedException {
		 itsmincidents_87668Page.LogingToHub(prop.getProperty("username9"), prop.getProperty("password2"));
		 itsmincidents_87668Page.ValidateTicketNumber();
		  
	  }*/
	 @Test(priority=5)
	  public void NavigateToCommnet() throws InterruptedException {
		 itsmincidents_87668Page.LogingToITSM(prop.getProperty("username7"), prop.getProperty("password2"));
		  testutil.switchToFrame();
		  itsmincidents_87668Page.ClickOnAPP();
		  itsmincidents_87668Page.AssignIncidents();
	  }
	
	 @AfterMethod
		public void tearDown(){
			//driver.quit();
		}
}
