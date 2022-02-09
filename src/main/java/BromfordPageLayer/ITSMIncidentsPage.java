package BromfordPageLayer;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BormfordBasePage.BasePage;
import BromfordTestUtil.Testutil;

public class ITSMIncidentsPage extends  BasePage {
	
	@FindBy(xpath="//input[@type='email']")
	WebElement   username;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement    ClickNext;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement   Password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement   Login;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement   ClickYes;
	
	@FindBy(xpath="//*[@title='Help & advice']")
	WebElement   ClickHelp;
	
	/*@FindBy(xpath="//*[text()='CREATE IT TICKET ']")
	WebElement   CreateTicket;*/
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement   ClickonText;
	
	@FindBy(xpath="//select[@id='apitil_service']")
	WebElement   ClickOnSerTab;
	
	@FindBy(xpath="//textarea[@id='description']")
	WebElement   ClinkonTextArea;
	
	@FindBy(xpath="//select[@title='Please select an item in this list']")
	WebElement   SelectTit; //Single user
	
	@FindBy(xpath="//input[@type='file']")
	WebElement   ChooseFile;
	
	@FindBy(xpath="//input[@id='InsertButton']")
	WebElement   ClickOnSubmit;
	
	@FindBy(xpath="//a[@href='#MyITRequest']")
	WebElement   ClickOnMyICT;
	
	@FindBy(xpath="//tr[@data-entity='incident']")
	WebElement   CheckTicket;
	
	@FindBy(xpath="//div[@id='otherTile']")
	WebElement   NewUser;
	
    @FindBy(xpath="//input[@type='email']")
	WebElement   username1;
	
    @FindBy(xpath="//input[@type='submit']")
	WebElement  Submit;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement   Password1;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement   SignIn;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement   ClickYes1;
	
	@FindBy(xpath="//div[@title='ITSM Service Desk']")
	WebElement   ITSMapp;
	
	@FindBy(xpath="//button[@id='areaSwitcherId']")
   	WebElement     AreaSearch;
    
    @FindBy(xpath="//*[text()='Service Center']")
   	WebElement     ClickOnSRC;
    
    @FindBy(xpath="//*[text()='Tickets']")
   	WebElement     ClickOnTickets;
    
    @FindBy(xpath="//h1[@title='My Active Tickets']/button")
   	WebElement     ClickOnDropDown;
    
     @FindBy(xpath="(//div[@role='gridcell'])[1]")
   	WebElement     DoubleClickCasetit;
     
     @FindBy(xpath="//li[@aria-label='Summary']")
    	WebElement     ClickSummaryTab;
     
     @FindBy(xpath="(//div[@title='Logging'])[1]")
     WebElement     ClickLogging;
     
     @FindBy(xpath="(//select[@aria-label='Urgency'])[2]")
     WebElement     ClickUrgency;
     
     @FindBy(xpath="//select[@aria-label='Impact']")
     WebElement     ClickImpact;
     
     @FindBy(xpath="//select[@aria-label='Ticket Type (ITSM)']")
     WebElement     ClickTicketType;
     
     @FindBy(xpath="//button[@title='Next Stage']")
     WebElement     ClickNext1;
     
     @FindBy(xpath="//*[text()='Create']")
     WebElement     ClickCreate;
     
     @FindBy(xpath="//button[@aria-label='Search records for Category Detailed, Lookup field']")
     WebElement     ClickCategeroyMin;
  
     @FindBy(xpath="//*[text()='Save and Close']")
     WebElement     ClickSaveAndClose;
     
    
     @FindBy(xpath="//button[@aria-label='More commands']")
     WebElement     ClickOnCommands;
     
     @FindBy(xpath="//*[text()='Refresh timeline']")
     WebElement     ClickRefresh;
     
	  @FindBy(xpath="//div[text()='CN']")
	   WebElement     ClickCN;
     
     
     @FindBy(xpath="(//td[@data-attribute='apitil_uniqueid'])[1]")
     WebElement    checkTicketNo; 
     
     //testcase:-5
     @FindBy(xpath="//button[@aria-label='Assign']")
     WebElement    ClickAssign;
     
     @FindBy(xpath="//select[@aria-label='Assign To']")
     WebElement     AssignTo;
     
    /* @FindBy(xpath="//input[@aria-label='User or team, Lookup']")
     WebElement     UserorTEAM;*/
     
     @FindBy(xpath="(//button[@aria-label='Assign'])[2]")
     WebElement     Assign1;
     
   
	public  ITSMIncidentsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LogingToHub(String user, String PWD) throws InterruptedException {
		
		bromfordUrlLaunch(prop.getProperty("portalurl"));
		username.sendKeys(user);
		ClickNext.click();
		Password.sendKeys(PWD);
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		Login.click();
		ClickYes.click();
		}
		public void CreatingIncidents() throws InterruptedException {
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		ClickHelp.click();
		//CreateTicket.click();
		 WebElement ClickOnTicket = driver.findElement(By.xpath("//*[text()='CREATE IT TICKET ']"));
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();",ClickOnTicket);
		 
		 Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		ClickonText.click();
		ClickonText.sendKeys("regarding the Bromford",Keys.ENTER);
		
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		Select s1 = new Select(ClickOnSerTab);
		s1.selectByVisibleText("Bromford Rewards");
		
		ClinkonTextArea.click();
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		ClinkonTextArea.sendKeys("I connected to the network by usig neccessary credentails that i recevied;by using those network credentials i can't able to open evn the necessary website uesd to work",Keys.ENTER);
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		Select s2 = new Select(SelectTit);
		s2.selectByVisibleText("Single user");
		
		WebElement upload_file = driver.findElement(By.xpath("//input[@type='file']"));
		 /*JavascriptExecutor js1 = (JavascriptExecutor)driver;
		 js1.executeScript("window.scrollBy(0,1000)",upload_file);*/
        upload_file.sendKeys("C:\\Users\\changalasetty.supri\\Downloads\\incidents document.docx");
        ClickOnSubmit.click();
        ClickOnMyICT.click();
        CheckTicket.click();
       Assert.assertEquals(driver.findElement(By.xpath("//*[text()='regarding the Bromford']")).getText(),"regarding the Bromford");

 
		}
		
	public void LogingToITSM(String user, String PWD) throws InterruptedException {
		  bromfordUrlLaunch(prop.getProperty("qaurl"));
		  Thread.sleep(Testutil.EXPLICIT_WAIT);
		        username1.sendKeys(user);
				Submit.click();
				Password1.sendKeys(PWD);
				Thread.sleep(Testutil.EXPLICIT_WAIT);
				SignIn.click();
				ClickYes1.click();
				
	}
				
				public void ClickOnAPP() throws InterruptedException	
				{ 
					
				    ITSMapp.click();
					}
		
  public void navigatingToTickets() throws InterruptedException {
		 // AreaSearch.click();
		 WebElement clickAreaSearch = driver.findElement(By.xpath("//button[@id='areaSwitcherId']"));
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();",clickAreaSearch);
		 
		 ClickOnSRC.click();
		// ClickOnTickets.click();
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement tickets = driver.findElement(By.xpath("//li[@aria-label='Tickets']"));
		 JavascriptExecutor js1 = (JavascriptExecutor)driver;
		 js1.executeScript("arguments[0].click()", tickets);
		 ClickOnDropDown.click();
		 //driver.switchTo().frame("//iframe[@id='ClientApiFrame_id-1745']");
		 driver.findElement(By.xpath("//span[text()='Tickets Need Evaluation']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//a[@title='regarding the Bromford']//parent::div//parent::div//parent::div//parent::div//parent::div/parent::div)[1]")).getText(),"regarding the Bromford");
		//DoubleClickCasetit.click();
		
		//driver.findElement(By.xpath("(//span[text()='regarding the Bromford'])[1]")).click();
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement incident= new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title='regarding the Bromford'])[1]")));
		 incident.click();
		ClickSummaryTab.click();
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		//JavascriptExecutor js2 = ((JavascriptExecutor)driver);
		//js2.executeScript("document.querySelector('#tab-section0').scrollTop=500;");

		WebElement ticketOrigin=driver.findElement(By.xpath("//select[@aria-label='Ticket Origin']"));
		JavascriptExecutor js2 = ((JavascriptExecutor)driver);
		//js2.executeScript("windows.scrollBy(0,500), ");
		js2.executeScript("arguments[0].scrollIntoView(true)", ticketOrigin);
		Select s = new Select(ticketOrigin);
		s.selectByVisibleText("Web");
		//ClickLogging.click();
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		WebElement clickLogging = driver.findElement(By.xpath("//div[@title='Logging']"));
		 JavascriptExecutor js3 = ((JavascriptExecutor)driver);
		 js3.executeScript("arguments[0].click();",clickLogging);
		//ClickUrgency.click();
		WebElement clickUrgency= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@aria-label='Urgency'])[2]")));
		clickUrgency.click();
		 Select s1 = new Select(clickUrgency);
		 s1.selectByVisibleText("3-Medium");
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickONImpact= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@aria-label='Impact'])[2]")));
		 clickONImpact.click();
		 Select s2 = new Select(clickONImpact);
		 s2.selectByVisibleText("3-Moderate");
		//ClickImpact.click();
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 ClickTicketType.click();
		 Select s3 = new Select(ClickTicketType);
		 s3.selectByVisibleText("Incident");
		 ClickNext1.click();
		 ClickCreate.click();
		// ClickCategeroyMin.click();
		// ClickCategeroyMin.sendKeys("Permissions/Access",Keys.ENTER);
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickCategory = driver.findElement(By.xpath("//button[@aria-label='Search records for Category Main, Lookup field']"));
		 JavascriptExecutor jse4 = ((JavascriptExecutor)driver);
		 jse4.executeScript("arguments[0].click();",clickCategory);
		 clickCategory.sendKeys("Bug Fix");
		 WebElement clickCategorymain= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Bug Fix'])[1]")));
		clickCategorymain.click();
		 ClickSaveAndClose.click();
	}
		
  
  public void LocatingComment() {
	  ClickCN.click();
	  ClickOnCommands.click();
	  ClickRefresh.click();
	  
  }
  
  public void ValidateTicketNumber() {
	  ClickOnMyICT.click();
	  checkTicketNo.click();
  
	  String value = driver.findElement(By.xpath(" (//td[@data-attribute='apitil_uniqueid'])[1]")).getText();
	  System.out.println(value);
	  Assert.assertEquals(driver.findElement(By.xpath(" (//td[@data-attribute='apitil_uniqueid'])[1]")).getText(),value);
  }

  public void AssignIncidents() throws InterruptedException {
	  ClickAssign.click();
	 // AssignTo.click();
	  //WebElement clickAssign= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Assign to']")));
	 // clickAssign.click();
	    Thread.sleep(Testutil.EXPLICIT_WAIT);
		WebElement clickAssign = driver.findElement(By.xpath("//select[@aria-label='Assign to']"));
		 JavascriptExecutor js3 = ((JavascriptExecutor)driver);
		 js3.executeScript("arguments[0].click();",clickAssign);
	     Select s = new Select(clickAssign);
	     s.selectByVisibleText("User or team");
	  
	     WebElement clickUserorTeam = driver.findElement(By.xpath("//input[@aria-label='User or team, Lookup']"));
		 JavascriptExecutor jse4 = ((JavascriptExecutor)driver);
		 jse4.executeScript("arguments[0].click();",clickUserorTeam);
		 clickUserorTeam.sendKeys("Business Support",Keys.ENTER);
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickUSERrTEAM= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Business Support'])[1]")));
		 clickUSERrTEAM.click();
		 
		// Assign1.click();
	     WebElement assign = new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-label='Assign'])[2]")));
		 assign.click();
		 
		 Thread.sleep(7000);
		 ClickAssign.click();
		/* WebElement clickAssign1 = driver.findElement(By.xpath("//button[@aria-label='Assign']"));
		 JavascriptExecutor js4 = ((JavascriptExecutor)driver);
		 js4.executeScript("arguments[0].click();",clickAssign1);*/

		// AssignTo.click();
		 Thread.sleep(7000);
			WebElement clickAssign2 = driver.findElement(By.xpath("//select[@aria-label='Assign to']"));
			 JavascriptExecutor js5 = ((JavascriptExecutor)driver);
			 js5.executeScript("arguments[0].click();",clickAssign2);
		     Select s1 = new Select(clickAssign2);
		    s1.selectByVisibleText("Me");
		    
		  Thread.sleep(7000);
		 // Assign1.click();
		  //WebElement assign1 = new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-label='Assign'])[2]")));
			// assign1.click();
		  WebElement assign1 = driver.findElement(By.xpath("(//button[@aria-label='Assign'])[2]"));
			 JavascriptExecutor js6 = ((JavascriptExecutor)driver);
			 js6.executeScript("arguments[0].click();",assign1);
		  
		  
		  Assert.assertEquals(driver.findElement(By.xpath("//a[text()='Test ServiceDesk']/..")).getText(),"Test ServiceDesk");
		  Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Team']/..")).getText(), "//div[text()='Team']/..");
  }
  
  
}
