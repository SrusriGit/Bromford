package BromfordPageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BormfordBasePage.BasePage;
import BromfordTestUtil.Testutil;

public class ITSMProblems_87728Page extends BasePage {
	
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
	
	
	@FindBy(xpath="//button[@id='areaSwitcherId']")
   	WebElement     AreaSearch;
    
    @FindBy(xpath="//*[text()='Status Center']")
   	WebElement     ClickOnSC;
     
   /* @FindBy(xpath="//*[@id='confirmButton']")
   	WebElement     ClickCancel;*/
    
    @FindBy(xpath="//span[text()='Problems']")
   	WebElement     ClickOnProblem;
    
   /* @FindBy(xpath="//*[@id='okButton']")
   	WebElement     ClickOnOK;*/
    
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
    
    @FindBy(xpath="//li[@aria-label='Related']")
   	WebElement     ClickOnRelated;
    
    @FindBy(xpath="//*[@aria-label='Incidents']")
   	WebElement     NavToIncidnts;
    
    @FindBy(xpath="//button[@aria-label='New Incident. Add New Incident']")
   	WebElement     ClickINCIDENTS;
       
     @FindBy(xpath="//*[@aria-label='Title']")
   	WebElement     ClickTIL;
       
     @FindBy(xpath="//*[@aria-label='Description']")
      WebElement     ClickDES1;
       
     @FindBy(xpath="//input[@aria-label='Contact, Lookup']")
   	WebElement     ClickonContact;
       
     @FindBy(xpath="//button[@aria-label='Search records for Service, Lookup field']")
   	WebElement     ClickSERVICE;
       
       @FindBy(xpath="//button[@aria-label='Search records for Category Main, Lookup field']")
   	WebElement     ClickCategoryMain;
       

       @FindBy(xpath="//select[@aria-label='Urgency']")
   	WebElement     ClickURGENCY;
       

       @FindBy(xpath="//select[@aria-label='Impact']")
   	WebElement     ClickIMPACT;

       @FindBy(xpath="//select[@aria-label='Affected Users']")
   	WebElement     ClickAFFUSER;

       @FindBy(xpath="//select[@aria-label='Responded To ?']")
   	WebElement     ClickRESTo;
       
     @FindBy(xpath="//*[text()='Save and Close']")
      	WebElement     ClickADD;
     
     @FindBy(xpath="(//div[@title='Logging'])[2]")
 	WebElement    ClickLogOn;
     
     @FindBy(xpath="//*[@aria-label='Next Stage']")
 	 WebElement    ClickNext;
     
     @FindBy(xpath="(//div[@title='RCA'])[2]")
 	 WebElement    ClickRCA;
     
     @FindBy(xpath="//*[text()='Next Stage']")
 	 WebElement    ClickNext2;
     
    /* @FindBy(xpath="(//div[@title='Workaround'])[2]")
 	 WebElement    ClickWA;*/
     
     @FindBy(xpath="//*[text()='Next Stage']")
 	 WebElement    ClickNext3;
     
     @FindBy(xpath="(//div[@title='Resolution'])[2]")
 	 WebElement    ClickRES;
     
     @FindBy(xpath="//select[@aria-label='Resolve Incidents?']")
 	 WebElement    ClickREINC;
     
   /*  @FindBy(xpath="//select[@aria-label='Resolved By ']")
 	 WebElement    ClickREBY;*/
     
     @FindBy(xpath="//button[@aria-label='Search records for Closure Category, Lookup field']")
 	 WebElement    ClickClosure;
     
     @FindBy(xpath="//*[text()='Next Stage']")
 	 WebElement    ClickNext4;
    
  /*  @FindBy(xpath="//li[@title='General']")
 	 WebElement    ClickOnGeneral;
    
    @FindBy(xpath="//textarea[@aria-label='Closure Details']")
	 WebElement    ClickClosureDetails;*/
    
    @FindBy(xpath="//*[text()='Save']")
	 WebElement    ClickOnSave;
    
    @FindBy(xpath="//li[@title='Resolution']")
	 WebElement    ClickResolution; // apply asserts to check whether it is true r not;
    
    @FindBy(xpath="//*[text()='Save']")
	 WebElement    ClickSave1;
    
    @FindBy(xpath="//li[@aria-label='Related']")
	 WebElement    ClickRelated;
    
    @FindBy(xpath="//*[@aria-label='Incidents']")
   	WebElement     NavigateToIncidnts;
    
    @FindBy(xpath="//*[text()='Resolved']")
	 WebElement    CheckStatusRe;
    
    
    @FindBy(xpath="//li[@aria-label='Resolution']")
	 WebElement    ClickResolutiontab;
    
    @FindBy(id="//*[@aria-label='Date of Resolved On']")
	 WebElement    CheckReslovedon;
    
    @FindBy(xpath="//*[@aria-label='Closure Details']")
	 WebElement    CheckClousureDe;
    
    @FindBy(xpath="//div[@title='Resolved in house']")
	 WebElement    CheckREsolvedAt;
    
    @FindBy(xpath="(//div[text()='Test ServiceDesk'])[3]")
	 WebElement    CheckResolevedBy;
    
     @FindBy(xpath="//select[@title='Customer']")
	 WebElement    ClickResolvedFor;
     
    
   /*@FindBy(xpath="//*[title='Close Problem']")
	 WebElement    ClickClose;*/
   
    @FindBy(xpath="//select[@aria-label='Close Incidents?']")
	 WebElement    ClickCloseInc;
    
    @FindBy(xpath="//input[@aria-label='Closure Confirmation, Lookup']")
	 WebElement    ClickCloseConfi;
    
   
 @FindBy(xpath="//*[text()='Finish']")
	 WebElement    ClickFinish;
     
     
     
     
     
  public  ITSMProblems_87728Page() {
		PageFactory.initElements(driver, this);
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
    //ACTIONS:-
   // note:- combine of test cases 887728,29,30
    public ITSMProblem_87729Page UserCreatingProb() throws InterruptedException {
    	bromfordUrlLaunch(prop.getProperty("qaurl"));
		 // AreaSearch.click();
		 WebElement clickAreaSearch = driver.findElement(By.xpath("//button[@id='areaSwitcherId']"));
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("arguments[0].click();",clickAreaSearch);
		 
		 ClickOnSC.click();
		// ClickCancel.click();
		 //Thread.sleep(7000);
		 //WebElement element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Problems']")));
		 //element.click();
		 WebElement ele = driver.findElement(By.xpath("//span[text()='Problems']"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click()", ele);
		 
		 ClickNEW.click();
		 ClickLogging.click();
		 ClickonContact2.click();
	     ClickonContact2.sendKeys(reader.getCellData("Probelms",2,2));
		 driver.findElement(By.xpath("(//*[text()='Test ServiceManager'])[1]")).click();
		 Clicktitle.click();
		 Clicktitle.sendKeys("Problems For D365 is Done");
		 ClickDES.click();
		 ClickDES.sendKeys("Problems for the incidents got cleared");
		 ClickOnSER.click();
		 ClickOnSER.sendKeys("Bromford Direct Access");
		 
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement elem= new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Bromford Direct Access'])[1]")));
		 elem.click();
		
		
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement ele3= new WebDriverWait(driver, 70).until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@aria-label='Urgency'])[2]")));
		 ele3.click();
		 Select s1 = new Select(driver.findElement(By.xpath("(//select[@aria-label='Urgency'])[2]")));
		 s1.selectByVisibleText("3-Medium");
		 
		
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		/* WebElement clickONImpact= new WebDriverWait(driver, 70).until(ExpectedConditions.elementToBeClickable(By.xpath("(//select[@aria-label='Impact'])[2]")));
		 clickONImpact.click();*/
		 WebElement clickONImpact = driver.findElement(By.xpath("(//select[@aria-label='Impact'])[2]"));
		 JavascriptExecutor jse3 = ((JavascriptExecutor)driver);
		 jse3.executeScript("arguments[0].click();",clickONImpact);
		
		 Select s2 = new Select(clickONImpact);
		 s2.selectByVisibleText("3-Moderate");
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		// Clickcheckbox.click();
		 ClickRESTo.click();
		 ClickRESTo.sendKeys("yes",Keys.ENTER);
		 WebElement dropdw = driver.findElement(By.xpath("//select[@aria-label='Affected Users']"));
		 Select se = new Select(dropdw);
		 se.selectByVisibleText(reader.getCellData("Probelms",3,2));
		 ClickSave.click();
	// Creating new incidents:-	 
		 ClickOnRelated.click();
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickOnIncidents = driver.findElement(By.xpath("//*[text()='Incidents']"));
		 JavascriptExecutor js3 = ((JavascriptExecutor)driver);
		 js3.executeScript("arguments[0].click();",clickOnIncidents);
		 ClickINCIDENTS.click();
		 ClickTIL.click();
		 ClickTIL.sendKeys("Accessbilitytesting245",Keys.ENTER);
		 ClickDES1.click();
		 ClickDES1.sendKeys("AUTOMATION for the Bromford housing",Keys.ENTER);
		 
		 ClickonContact.click();
		 ClickonContact.sendKeys(reader.getCellData("Probelms",2,2));
		driver.findElement(By.xpath("(//*[text()='Test ServiceManager'])[1]")).click();
		/* WebElement clickContact= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Test ServiceManager'])[1]")));
		 clickContact.click();*/
		 
		 ClickSERVICE.click();
		 ClickSERVICE.sendKeys("Active Directory");
		 driver.findElement(By.xpath("(//*[text()='Active Directory'])[1]")).click();
		// WebElement clickService= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Active Directory'])[1]")));
		// clickService.click();
		 
		// ClickCategoryMain.click();
		
		// ClickCategoryMain.sendKeys("Bug Fix");
		
		 
		 WebElement clickCategory = driver.findElement(By.xpath("//button[@aria-label='Search records for Category Main, Lookup field']"));
		 JavascriptExecutor jse4 = ((JavascriptExecutor)driver);
		 jse4.executeScript("arguments[0].click();",clickCategory);
		 clickCategory.sendKeys("Bug Fix");
		 WebElement clickCategorymain= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[text()='Bug Fix'])[1]")));
		clickCategorymain.click();
		// ClickURGENCY.click();
		
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickUrgency= new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Urgency']")));
		 clickUrgency.click();
		 Select se1 = new Select(driver.findElement(By.xpath("//select[@aria-label='Urgency']")));
		 se1.selectByVisibleText("4-Low");
		 
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickONImp= new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Impact']")));
		 clickONImp.click();
		 Select s = new Select(driver.findElement(By.xpath("//select[@aria-label='Impact']")));
		 s.selectByVisibleText("3-Moderate");
		 
		 WebElement dropdw1 = driver.findElement(By.xpath("//select[@aria-label='Affected Users']"));
		 Select se2 = new Select(dropdw1);
		 se2.selectByVisibleText(reader.getCellData("Probelms",3,2));
		 ClickRESTo.click();
		 ClickRESTo.sendKeys("yes",Keys.ENTER);
	     ClickADD.click();
		
		 //ClickLogOn.click();
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clicklog = driver.findElement(By.xpath("(//div[@title='Logging'])[2]"));
		 JavascriptExecutor js4 = ((JavascriptExecutor)driver);
		 js4.executeScript("arguments[0].click();",clicklog);
		 ClickNext.click();
		// ClickRCA.click();
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickRCA = driver.findElement(By.xpath("(//div[@title='RCA'])[2]"));
		 JavascriptExecutor js5 = ((JavascriptExecutor)driver);
		 js5.executeScript("arguments[0].click();",clickRCA);
		 ClickNext2.click();
		// ClickWA.click();
		 /*WebElement clickWA = new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@title='Workaround'])[2]")));
		 clickWA.click();*/
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickWA = driver.findElement(By.xpath("(//div[@title='Workaround'])[2]"));
		 JavascriptExecutor js6 = ((JavascriptExecutor)driver);
		 js6.executeScript("arguments[0].click();",clickWA);
		 ClickNext3.click();
		//ClickRES.click();
		 WebElement clickRES = driver.findElement(By.xpath("(//div[@title='Resolution'])[2]"));
		 JavascriptExecutor js7 = ((JavascriptExecutor)driver);
		 js7.executeScript("arguments[0].click();",clickRES);
		// ClickREINC.click();
		 WebElement resINC= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Resolve Incidents?']")));
		 resINC.click();
		 Select sel3 = new Select(resINC);
	      sel3.selectByVisibleText("Yes");
		 
		 WebElement resBy= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Resolved By ']")));
		 resBy.click();
		 Select se3 = new Select(driver.findElement(By.xpath("//select[@aria-label='Resolved By ']")));
	      se3.selectByVisibleText("Customer");
		 
		 //ClickClosure.click();
		/* Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement  clickClosure= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Search records for Closure Category, Lookup field']")));
		 clickClosure.click();*/
		 WebElement clickClosure = driver.findElement(By.xpath("//button[@aria-label='Search records for Closure Category, Lookup field']"));
		 JavascriptExecutor js8 = ((JavascriptExecutor)driver);
		 js8.executeScript("arguments[0].click();",clickClosure);
		 clickClosure.sendKeys("Resolved in house");
		 driver.findElement(By.xpath("//*[text()='Resolved in house']")).click();
		 ClickNext4.click();
		 driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		 
		// ClickOnGeneral.click();
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 WebElement clickGeneral = driver.findElement(By.xpath("//*[text()='General']"));
		 JavascriptExecutor js9 = ((JavascriptExecutor)driver);
		 js9.executeScript("arguments[0].click();",clickGeneral);
		
		// ClickClosureDetails.click();
		 
		 Thread.sleep(4000);
		 //driver.findElement(By.xpath("//textarea[@aria-label='Closure Details']")).sendKeys("problem is closed");
		// WebElement clickClousure = driver.findElement(By.xpath("//textarea[@aria-label='Closure Details']"));
		/* JavascriptExecutor js10 = ((JavascriptExecutor)driver);
		 WebElement clickClousure = driver.findElement(By.xpath("//textarea[@aria-label='Closure Details']"));
		// js10.executeScript("arguments[0].scrollIntoView(true);",clickClousure);
		 //js10.executeScript("windows.scrollBy(0,1000)");
		 //js.executeScript("window.scrollBy(0,1000)");
		// js10.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// js10.executeScript("documents.querySelector('.Closure Details').scrollTop=5000");*/
		 
		
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		//WebElement clickClousure = new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//textarea[@aria-label='Closure Details'])[1]")));
		
		//WebElement clickClousure = driver.findElement(By.xpath("(//textarea[@aria-label='Closure Details'])[1]"));
		JavascriptExecutor js10 = ((JavascriptExecutor)driver);
		js10.executeScript("document.querySelector('#tab-section3').scrollTop=1000;");
		WebElement clickClousure = driver.findElement(By.xpath("(//textarea[@aria-label='Closure Details'])[1]"));
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		clickClousure.sendKeys("closed",Keys.ENTER);
		Thread.sleep(Testutil.EXPLICIT_WAIT);
		// ClickOnSave.click();
		// ClickResolution.click();
		 WebElement clickResolution = driver.findElement(By.xpath("//li[@title='Resolution']"));
		 JavascriptExecutor js11 = ((JavascriptExecutor)driver);
		 js11.executeScript("arguments[0].click();",clickResolution);
		 ClickOnSave.click();
		 
		 ClickRelated.click();
		 NavigateToIncidnts.click();
		 CheckStatusRe.click();
		 Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Resolved']")).getText(), "Resolved");
		 
		 ClickResolutiontab.click();
		 
		 String verifyDate = driver.findElement(By.xpath("//input[@aria-label='Date of Resolved On']")).getText();
		 System.out.println(verifyDate);
		 Assert.assertEquals(driver.findElement(By.xpath("//input[@aria-label='Date of Resolved On']")).getText(),verifyDate);
		// CheckClousureDe.click();
		 Thread.sleep(Testutil.EXPLICIT_WAIT);
		 String verifyCD = driver.findElement(By.xpath("//*[text()='closed']/..")).getText();
		 System.out.println(verifyCD);
		 Assert.assertEquals(driver.findElement(By.xpath("//*[text()='closed']/..")).getText(), verifyCD);
		 
		// CheckREsolvedAt.click();
		 String resolvedIn = driver.findElement(By.xpath("//div[@aria-label='Resolved in house']/..")).getText();
		  System.out.println(resolvedIn);
		 Assert.assertEquals(driver.findElement(By.xpath("//div[@aria-label='Resolved in house']/..")).getText(),resolvedIn);
		 
		 //driver.findElement(By.xpath("//button[@title='Go back']")).click();;
		 //CheckResolevedBy.click();
		 String resolvedBY = driver.findElement(By.xpath("(//div[text()='Test ServiceDesk']/..)[2]")).getText();
		 System.out.println(resolvedBY);
		 Assert.assertEquals(driver.findElement(By.xpath("(//div[text()='Test ServiceDesk']/..)[2]")).getText(),resolvedBY);
		 
		// ClickResolvedFor.click();
		 String resolvedFor = driver.findElement(By.xpath("//div[@aria-label='Locked Resolved By']/parent::div/parent::div")).getText();
		 System.out.println(resolvedFor);
		 Assert.assertEquals(driver.findElement(By.xpath("//div[@aria-label='Locked Resolved By']/parent::div/parent::div")).getText(),"Customer");
		 
		// ClickClose.click();
		 WebElement clickClose = driver.findElement(By.xpath("//*[title='Close Problem'] "));
		 JavascriptExecutor jscr = ((JavascriptExecutor)driver);
		 jscr.executeScript("arguments[0].click();",clickClose);
	
		// ClickCloseInc.click();
		 WebElement closeInc= new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Close Incidents?']")));
		 closeInc.click();
		 Select se4 = new Select(driver.findElement(By.xpath("//select[@aria-label='Close Incidents?']")));
	      se4.selectByVisibleText("Yes");
	      ClickCloseInc.click();
	      ClickCloseConfi.click();
	      ClickFinish.click();
		 return new  ITSMProblem_87729Page();
		 
    }

}
