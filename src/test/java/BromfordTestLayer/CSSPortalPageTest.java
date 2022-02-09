package BromfordTestLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BormfordBasePage.BasePage;
import BromfordPageLayer.BromfordLoginPage;
import BromfordPageLayer.CSSPortalPage;
import BromfordPageLayer.ITSMProblemPage;
import BromfordTestUtil.Testutil;

public class CSSPortalPageTest extends  BasePage {
	
	Testutil testUtil;
	CSSPortalPage cssportalpage;
	
	
	public CSSPortalPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		
		cssportalpage = new CSSPortalPage ();
		testUtil = new Testutil();
		 
	}
	
	@Test()
	public void cssportalLaunch() throws InterruptedException {
		cssportalpage.CreatingPortal(prop.getProperty("username3"),prop.getProperty("password2"));
		cssportalpage.createPortalLink();
	}
	
}
