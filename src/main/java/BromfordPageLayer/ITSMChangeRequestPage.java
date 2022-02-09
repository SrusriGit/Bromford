package BromfordPageLayer;

import org.openqa.selenium.By;
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

public class ITSMChangeRequestPage extends  BasePage {
	
	@FindBy(xpath="//input[@type='email']")
	WebElement   username;
	
    @FindBy(xpath="//input[@type='submit']")
	WebElement  Submit;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement   Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement   SignIn;
	
	@FindBy(xpath="//button[@id='mectrl_main_trigger' and @type='button']")
	WebElement clickOnTS;
	
	@FindBy(xpath="//button[contains(text(),'Sign out')]")
	WebElement  Logout;
	
	@FindBy(xpath="//*[@aria-labelledby='otherTileText']")
	WebElement   NewUser;

	@FindBy(xpath="//input[@type='email']")
	WebElement   username1;
	
    @FindBy(xpath="//input[@type='submit']")
	WebElement  Login;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement   Password2;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement   Signup;
	
	 @FindBy(xpath="//input[@type='submit']")
	WebElement  clickyes;
	 
	 @FindBy(xpath="//button[@id='mectrl_main_trigger' and @type='button']")
	 WebElement clickOnTM;
		
     @FindBy(xpath="//button[@id='mectrl_body_signOut']")
	WebElement  Logout1;
     
     @FindBy(xpath="//input[@type='email']")
 	WebElement   username2;
 	
     @FindBy(xpath="//input[@type='submit']")
 	WebElement  Submit2;
 	
 	@FindBy(xpath="//input[@type='password']")
 	WebElement   Pass;
 	
 	@FindBy(xpath="//input[@type='submit']")
 	WebElement   SignIn2;
 	
 	@FindBy(xpath="//input[@type='submit']")
	WebElement  clickyes1;
 	
 	@FindBy(xpath="//*[text()='ITSM Service Desk']")
	WebElement   ITSMapp;
 	
 	@FindBy(xpath="//button[@id='areaSwitcherId']")
   	WebElement     AreaSearch;
    
    @FindBy(xpath="//*[text()='Status Center']")
   	WebElement     ClickOnSC;
    
    @FindBy(xpath="//*[text()='Change Requests']")
   	WebElement     ClickOnCHRe;
    
    @FindBy(xpath="//button[@aria-label='New']")
   	WebElement     ClickNEW;
    
    @FindBy(xpath="//div[@title='Logging']")
   	WebElement    ClickLogging;
     
    @FindBy(xpath="(//button[@aria-label='Search records for Contact, Lookup field']/preceding-sibling::input)[2]")
   	WebElement   ClickonContact;
    
    @FindBy(xpath="(//input[@aria-label='Title'])[2]")
   	WebElement    Clicktitle;
    
    @FindBy(xpath="(//textarea[@aria-label='Description'])[2]")
   	WebElement    ClickDES;
    
    @FindBy(xpath="(//input[@aria-label='Service, Lookup'])[2]")
   	WebElement    ClickOnSER;
    
    @FindBy(xpath="(//select[@aria-label='Urgency'])[2]")
   	WebElement    ClickUrgency;
    
    @FindBy(xpath="(//select[@aria-label='Impact'])[2]")
   	WebElement    ClickImpact;
    
    @FindBy(xpath="//select[@aria-label='Responded To ?']")
   	WebElement    Clickcheckbox;
    
    @FindBy(xpath=" //img[@title='Save']/..")
   	WebElement    ClickSave;
    
    @FindBy(xpath="//div[@title='Logging']")
   	WebElement    ClickLogging1;
    
    @FindBy(xpath="//*[text()='Next Stage']")
   	WebElement    ClickNEXT;
    
    @FindBy(xpath="(//*[@title='Assess And Evaluate'])[2]")
   	WebElement    ClickOnAandE;
    
    @FindBy(xpath="(//select[@aria-label='Request Type'])[2]")
   	WebElement    ClickOnREYtype;
   
    @FindBy(xpath="(//select[@aria-label='Service Reduction'])[2]")
   	WebElement    ClickSERVICE;
    
    @FindBy(xpath="(//select[@aria-label='Implementation Risk'])[2]")
   	WebElement    ClickIMPLEMENTATION;
    
    @FindBy(xpath="(//input[@aria-label='Change Owner, Lookup'])[2]")
   	WebElement    ClickChangeOwner; 
   
    
    @FindBy(xpath="//button[@aria-label='Next Stage']")
   	WebElement    ClickNEXT1;
    
    /*@FindBy(xpath="(//div[@title='Approval And Coordinate'])[1]")
   	WebElement    ClickOnAppandCOO;*/
    
    @FindBy(xpath="//input[@aria-label='Date of Outage Start']")
   	WebElement    ClickOnOutage;
    
    
    @FindBy(xpath="[@aria-label='Date of Outage End']")
   	WebElement    ClickOnEnd;
    
    @FindBy(xpath="//select[@aria-label='Identified Approvers']")
   	WebElement     IdentifyApprovals;
    
    @FindBy(xpath="//button[@title='Next Stage']")
   	WebElement     next;
  
    @FindBy(xpath="//span[text()='CHR-12297-2021 - Problems For D365 is Done']")
   	WebElement     ClickCHR;
    
    @FindBy(xpath="//li[@aria-label='Related']")
	 WebElement    ClickRelated;
   
   @FindBy(xpath="//button[@aria-label='Upload']")
  	WebElement     upload;
    
 
	 public  ITSMChangeRequestPage() {
			PageFactory.initElements(driver, this);
		}
	 
	 public void LoginITSMSD(String user ,String pwd) throws InterruptedException {
		 bromfordUrlLaunch(prop.getProperty("qaurl"));
		 username.sendKeys(user);
		 Submit.click();
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 Password.sendKeys(pwd);
		 SignIn.click();
		 clickyes.click();
		 clickOnTS.click();
		 Logout.click();
		}
	 public void clickOnNew() {
		 NewUser.click();
	 }
	 public void LoginITSMTM(String usr ,String Pwd) throws InterruptedException
	  {	  
		 NewUser.click();
		 username1.sendKeys(usr);
		 Login.click();
		// Thread.sleep(Testutil.EXPLICIT_WAIT);
		 Password2.sendKeys(Pwd);
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 Signup.click();
		// clickyes.click();
		 clickOnTM.click();
		 Logout1.click();
		
		 
	 }
	 
	 public void CreatingManualChangeReqyest(String us, String pd) throws InterruptedException {
		 bromfordUrlLaunch(prop.getProperty("qaurl"));
		 username2.sendKeys(us);
		 Submit2.click();
		 //Thread.sleep(Testutil.EXPLICIT_WAIT);
		 Pass.sendKeys(pd);
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		 SignIn2.click();
		 clickyes1.click();
	 }
	 public void ClickOnAPP()	{
		   ITSMapp.click();
	 }
	 public void creatingNewRequest() throws InterruptedException {
		 
		// AreaSearch.click();
	     WebElement ClickAreaSearch = driver.findElement(By.xpath("//button[@id='areaSwitcherId']"));
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
	    js.executeScript("arguments[0].click();",ClickAreaSearch);
	    ClickOnSC.click();
	    ClickOnCHRe.click();
	    ClickNEW.click();
	    ClickLogging.click();
	    ClickonContact.click();
	    ClickonContact.sendKeys(reader.getCellData("Change_Request",2,2));
	  
		//driver.findElement(By.xpath("(//*[text()='Test ServiceDesk'])[2]")).click();
	    /*WebElement clickContact= new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Test ServiceDesk'])[1]")));
		 clickContact.click();*/
	    WebElement clickContact = driver.findElement(By.xpath("(//*[text()='Test ServiceDesk'])[4]"));
	    JavascriptExecutor js1 = ((JavascriptExecutor)driver);
	    js1.executeScript("arguments[0].click();",clickContact);
		Clicktitle.click();
		Clicktitle.sendKeys("Problems For D365 is Done");
		ClickDES.click();
		 ClickDES.sendKeys("Problems for the incidents got cleared");
		 ClickOnSER.click();
		 ClickOnSER.sendKeys("Bromford Direct Access");
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement elem= new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Bromford Direct Access'])[1]")));
		 elem.click();
		 
		 
		 /*ClickOnCatDetailed.click();
		 ClickOnCatDetailed.sendKeys("Coronavirus");
		 /*Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement ele2= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Coronavirus'])[1]")));
		 ele2.click();
		 
		 WebElement ClickOnCovid = driver.findElement(By.xpath("(//*[text()='Upgrade'])[1]"));
		 JavascriptExecutor js2 = (JavascriptExecutor)driver;
		 js2.executeScript("arguments[0].click()", ClickOnCovid);*/
		 
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement ele3= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@aria-label='Urgency'])[2]")));
		 ele3.click();
		 Select s1 = new Select(driver.findElement(By.xpath("(//select[@aria-label='Urgency'])[2]")));
		 s1.selectByVisibleText("3-Medium");
		 
		
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement ClickONImpact= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@aria-label='Impact'])[2]")));
		 ClickONImpact.click();
		 Select s2 = new Select(ClickONImpact);
		 s2.selectByVisibleText("3-Moderate");
		 
		
		 Select s3 = new Select(Clickcheckbox);
		 s3.selectByVisibleText("Yes");
		 ClickSave.click();
		 
	
		 //ClickLogging1.click();
		 WebElement ClickOnLogging = driver.findElement(By.xpath("//div[@title='Logging']"));
		 JavascriptExecutor js2 = (JavascriptExecutor)driver;
		 js2.executeScript("arguments[0].click()", ClickOnLogging);
		 
		 ClickNEXT.click();
		// ClickOnAandE.click();
		// driver.switchTo().frame("//iframe[@id='powerAppsAuthFlowFrame']");
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		// driver.switchTo().frame("//iframe[@id='powerAppsAuthFlowFrame']");
		 WebElement clickONRE= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@aria-label='Request Type'])[2]")));
		clickONRE.click();
		 Select s = new Select(clickONRE);
		 s.selectByVisibleText("Normal");
		 
		 WebElement clickONSR= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@aria-label='Service Reduction'])[2]")));
		 clickONSR.click();
		 Select se1 = new Select(clickONSR);
		 se1.selectByVisibleText("Low");
		 
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickONIR= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@aria-label='Implementation Risk'])[2]")));
		 clickONIR.click();
		/* WebElement ClickONIR = driver.findElement(By.xpath("(//select[@aria-label='Implementation Risk'])[2]"));
		 JavascriptExecutor js3 = (JavascriptExecutor)driver;
		 js3.executeScript("arguments[0].click()",ClickONIR);*/
		 Select se2 = new Select(clickONIR);
		 se2.selectByVisibleText("Medium");
		 
	    ClickChangeOwner.click();
	    ClickChangeOwner.sendKeys(reader.getCellData("Change_Request",3,3));
		//driver.findElement(By.xpath("(//*[text()='Test ServiceManager'])[1]")).click();
		
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickOwner= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Test ServiceManager'])[1]")));
		 clickOwner.click();
		 ClickNEXT1.click();
		// ClickOnAppandCOO.click();
		/* WebElement clickAPPandCO	= driver.findElement(By.xpath("//input[@aria-controls='DatePicker-Callout1']"));
		 JavascriptExecutor js3 = (JavascriptExecutor)driver;
		 js3.executeScript("arguments[0].click()",clickAPPandCO);
		 
		 WebElement date = driver.findElement(By.xpath("//div[@aria-label='Calendar']");
		 // WebElement date = driver.findElement(By.id("DatePicker0-label"));
		 String dateValue = "30/11/2021";
		 JavascriptExecutor js4 = (JavascriptExecutor)driver;
		 js4.executeScript("arguments[0].setAttribute('value','"+dateValue +"');",date);*/
		 
		WebElement calender = driver.findElement(By.xpath("//input[@aria-label='Date of Outage Start']"));
		calender.sendKeys(reader.getCellData("Change_Request", 4, 2));
		calender.click();
		
		WebElement calender1 = driver.findElement(By.xpath("//input[@aria-label='Date of Outage End']"));
		calender1.sendKeys(reader.getCellData("Change_Request", 4, 2));
		calender1.click();
		
		IdentifyApprovals.click();
		Select se3 = new Select(IdentifyApprovals);
		se3.selectByVisibleText("Yes");
		next.click();
	 }
		 
	public void AttachingTheDocument() throws InterruptedException {
		 WebElement ClickAreaSearch = driver.findElement(By.xpath("//button[@id='areaSwitcherId']"));
		    JavascriptExecutor js = ((JavascriptExecutor)driver);
		    js.executeScript("arguments[0].click();",ClickAreaSearch);
		    ClickOnSC.click();
		    ClickOnCHRe.click();
		    
		/*WebElement searchBox = driver.findElement(By.xpath("//*[@aria-label='Quick find']"));
        searchBox.click();*/
		    WebElement searchBox = driver.findElement(By.xpath("//button[@aria-label='Start search']"));
		    JavascriptExecutor js5 = ((JavascriptExecutor)driver);
		    js5.executeScript("arguments[0].click();",searchBox);
	       // Thread.sleep(Testutil.EXPLICIT_WAIT);
	        searchBox.sendKeys("CHR-12297-2021",Keys.ENTER);
	       searchBox.click();
	       ClickCHR.click();
	        ClickRelated.click();
			 Thread.sleep(Testutil.EXPLICIT_WAIT);
			 WebElement clickOnIncidents = driver.findElement(By.xpath("//*[@aria-label='Documents']"));
			 JavascriptExecutor js3 = ((JavascriptExecutor)driver);
			 js3.executeScript("arguments[0].click();",clickOnIncidents);
			 upload.click();
			 WebElement chooseFile = driver.findElement(By.xpath(" //input[@aria-label='File Upload']"));
			 chooseFile.sendKeys("C:\\Users\\changalasetty.supri\\Downloads\\incidents document.docx");
		WebElement ok =	 driver.findElement(By.xpath(" //button[@aria-label='OK']"));
		ok.click();
	}
	 
	 
}
