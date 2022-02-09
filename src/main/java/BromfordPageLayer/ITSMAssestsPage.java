package BromfordPageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BormfordBasePage.BasePage;
import BromfordTestUtil.Testutil;

public class ITSMAssestsPage extends BasePage {
	

	 @FindBy(xpath="//input[@type='email']")
	 WebElement   username;
		
	 @FindBy(xpath="//input[@type='submit']")
	 WebElement  Submit;
		
	 @FindBy(xpath="//input[@name='passwd']")
	 WebElement   Password;
		
	 @FindBy(xpath="//input[@type='submit']")
	 WebElement   SignIn;
	
     @FindBy(xpath="//input[@type='submit']")
	 WebElement  clickyes;
     
     @FindBy(xpath="//div[@title='ITSM Service Desk']")
 	 WebElement   ITSMapp;
     
     
     public  ITSMAssestsPage() {
 		PageFactory.initElements(driver, this);
 	}

     public void LoginwithCredentails(String user, String PWD) throws InterruptedException {
    	 
    	 bromfordUrlLaunch(prop.getProperty("qaurl"));
    	 username.sendKeys(user);
    	 Submit.click();
    	 Thread.sleep(Testutil.EXPLICIT_WAIT);
    	 Password.sendKeys(PWD);
    	 Thread.sleep(Testutil.EXPLICIT_WAIT);
    	 SignIn.click();
    	 clickyes.click();
    	 ITSMapp.click();
     }
     
}
