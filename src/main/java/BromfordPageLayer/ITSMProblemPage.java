package BromfordPageLayer;




import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BormfordBasePage.BasePage;
import BromfordTestUtil.Testutil;

public class ITSMProblemPage  extends BasePage {
	
	@FindBy(xpath="//button[@id='mectrl_main_trigger' and @type='button']")
	WebElement clickOnCN;
	
	@FindBy(xpath="//button[contains(text(),'Sign out')]")
	WebElement  Logout;
	
    @FindBy(xpath="//div[@id='otherTile']")
	WebElement   NewUser;
	
    @FindBy(xpath="//input[@type='email']")
	WebElement   username;
	
    @FindBy(xpath="//input[@type='submit']")
	WebElement  Submit;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement   Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement   SignIn;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement  Clickyes;
	
	@FindBy(xpath="//div[@title='ITSM Service Desk']")
	WebElement   ITSMapp;
	
	@FindBy(xpath="//li[@id='quickCreateLauncher_buttoncrm_header_global']")
	WebElement   ClickNew;
	
	@FindBy(xpath=" //div[@title='Problems']")
	WebElement   ClickProblem;
	
	@FindBy(xpath="//input[@aria-label='Title']")
	WebElement   ClickTitle;

    @FindBy(xpath="//textarea[@aria-label='Problem Description']")
	WebElement   ClickonPD;
    
    @FindBy(xpath="//button[@aria-label='Search records for Contact, Lookup field']/preceding-sibling::input")
   	WebElement   ClickonContact;
    
    @FindBy(xpath="//select[@aria-label='Affected Users']")
   	WebElement    clickonADUsers;
    
    @FindBy(xpath="//span[text()='Save and Close']")
   	WebElement     SaveandClose;
    

    @FindBy(xpath="//button[@id='areaSwitcherId']")
   	WebElement     AreaSearch;
    
    @FindBy(xpath="//*[text()='Status Center']")
   	WebElement     ClickOnSC;
     
    @FindBy(xpath="//button[@id='confirmButton']")
   	WebElement     ClickCancel;
    
    @FindBy(xpath="//span[text()='Problems']")
   	WebElement     ClickOnProblem;
    
    @FindBy(xpath="//*[@id='okButton']")
   	WebElement     ClickOnOK;
    
    @FindBy(xpath="//button[@aria-label='New']")
   	WebElement     ClickNEW;
    
    @FindBy(xpath="//div[@title='Logging']")
   	WebElement    ClickLogging;
    
    @FindBy(xpath="(//button[@aria-label='Search records for Contact, Lookup field']/preceding-sibling::input)[2]")
   	WebElement   ClickonContact2;
    
    @FindBy(xpath="(//input[@aria-label='Title'])[2]")
   	WebElement    Clicktitle;
    
    @FindBy(xpath="(//textarea[@aria-label='Description'])[2]")
   	WebElement    ClickDES;
    
    @FindBy(xpath="(//input[@aria-label='Service, Lookup'])[2]")
   	WebElement    ClickOnSER;
    
   /*@FindBy(xpath="(//input[@aria-label='Category Main, Lookup'])[2]")
   	WebElement    ClickOnCatMai;
    
    @FindBy(xpath="//*[text()='Save and continue']")
   	WebElement    ClickSaveCh;
    
    @FindBy(xpath=" (//input[@aria-label='Category Detailed, Lookup'])[2]")
   	WebElement    ClickOnCatDetailed;
    
    @FindBy(xpath="//*[@id='dialogCloseIconButton']")
   	WebElement    ClickOnX;*/
    
    @FindBy(xpath="(//select[@aria-label='Urgency'])[2]")
   	WebElement    ClickUrgency;
    
    @FindBy(xpath="(//select[@aria-label='Impact'])[2]")
   	WebElement    ClickImpact;
    
    @FindBy(xpath="(//input[@title='No'])[2]")
   	WebElement    Clickcheckbox;
    
    @FindBy(xpath=" //img[@title='Save']/..")
   	WebElement    ClickSave;


     
    
   

     
    
	public  ITSMProblemPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void CheckTheCNiconAndSingOut() throws InterruptedException {
		clickOnCN.click();
		Logout.click();
		Thread.sleep(Testutil.EXPLICIT_WAIT);
        NewUser.click();
	}
	public void ValidateNewUserId(String user,String Pwd ) throws InterruptedException {
		bromfordUrlLaunch(prop.getProperty("qaurl"));
		username.sendKeys(user);
		Submit.click();
		Password.sendKeys(Pwd);
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		SignIn.click();
		//Thread.sleep(Testutil.EXPLICIT_WAIT);}
	    Clickyes.click();
	    }
	
	public void ClickOnAPP()	{
	    ITSMapp.click();
		}
	public ITSMProblems_87728Page clickProbIcon() throws InterruptedException {
		 ClickNew.click();
		 
		 WebElement ClickOnProblem = driver.findElement(By.xpath("//*[text()='Problem']"));
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();",ClickOnProblem);
		 
		 ClickTitle.sendKeys(reader.getCellData("Probelms","Title",2));
		 ClickonPD.sendKeys(reader.getCellData("Probelms",1,2));
		 ClickonContact.click();
		 ClickonContact.sendKeys(reader.getCellData("Probelms",2,2));
		 driver.findElement(By.xpath("(//*[text()='Test ServiceManager'])[1]")).click();
		
		 WebElement dropdw = driver.findElement(By.xpath("//select[@aria-label='Affected Users']"));
		 Select s = new Select(dropdw);
		 s.selectByVisibleText(reader.getCellData("Probelms",3,2));
		 SaveandClose.click();
		// AreaSearch.click();
		/* WebElement ClickAreaSearch = driver.findElement(By.xpath("//button[@id='areaSwitcherId']"));
		JavascriptExecutor elem = ((JavascriptExecutor)driver);
		elem.executeScript("arguments[0].click();",ClickAreaSearch);
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		 ClickOnSC.click();*/
	
	    
	return new ITSMProblems_87728Page();
	}   
	    
	      
}
	


