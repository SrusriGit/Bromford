package BromfordTestLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BormfordBasePage.BasePage;

import BromfordPageLayer.ITSMChangeRequestPage;
import BromfordTestUtil.Testutil;

public class ITSMChangeRequestPageTest extends  BasePage {
	
	Testutil testUtil;
	ITSMChangeRequestPage itsmChangeRequest;
	
	String sheetName = "Change_Request";
	
	public ITSMChangeRequestPageTest(){
		super();
	}
	
  @BeforeMethod
  public void setup() throws InterruptedException {
	  initialization();
	  itsmChangeRequest = new ITSMChangeRequestPage();
	  testUtil = new Testutil();
	 
  }
  /*@Test(priority=1)
  public void LoginAndLogout() throws InterruptedException {
	  itsmChangeRequest.LoginITSMSD(prop.getProperty("username7"),prop.getProperty("password2"));
	  itsmChangeRequest.clickOnNew();
	  itsmChangeRequest.LoginITSMTM(prop.getProperty("username9"),prop.getProperty("password2"));
  }*/
  
 /* @Test(priority=2)
  public void CreatingManulaChangeRequest() throws InterruptedException {
	  itsmChangeRequest.CreatingManualChangeReqyest(prop.getProperty("username7"),prop.getProperty("password2"));
	  testUtil.switchToFrame();
	  itsmChangeRequest.ClickOnAPP();
	  
	  itsmChangeRequest.creatingNewRequest();
	  
	 // itsmChangeRequest.BusinessFlow();
  }*/
  @Test(priority=3) 
  public void UserAttachDocument() throws InterruptedException {
	  itsmChangeRequest.CreatingManualChangeReqyest(prop.getProperty("username7"),prop.getProperty("password2"));
	  testUtil.switchToFrame();
	  itsmChangeRequest.ClickOnAPP();
	  itsmChangeRequest.AttachingTheDocument();
  }
  
}
