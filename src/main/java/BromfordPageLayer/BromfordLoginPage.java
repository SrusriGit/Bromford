package BromfordPageLayer;

import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BormfordBasePage.BasePage;
import BromfordTestUtil.Testutil;

public class BromfordLoginPage extends BasePage{
	
	
	
	
	@FindBy(xpath="//input[@type='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement nextBtn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement signIn;
	
    @FindBy(xpath="//input[@type='submit']")
	WebElement  clickyes;
	
	
	//Initializing the Page Objects:
	public  BromfordLoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
 // actions:-
	
	public  void validatingQALoginPage(String user,String pwd) throws InterruptedException {
		
	
		bromfordUrlLaunch(prop.getProperty("qaurl"));
	    username.sendKeys(user);
		nextBtn.click();
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		
		password.sendKeys(pwd);
        signIn.click();
		clickyes.click();
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		
		//return new  ITSMProblemPage();
		
		
	}

	public  void validatingPortalLoginPage(String user,String pwd) throws InterruptedException {
		
		bromfordUrlLaunch(prop.getProperty("portalurl"));
	    username.sendKeys(user);
		nextBtn.click();
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		password.sendKeys(pwd);
		signIn.click();
        clickyes.click();
		Thread.sleep(4000);
		
		
		
		
		
	}


	

}
