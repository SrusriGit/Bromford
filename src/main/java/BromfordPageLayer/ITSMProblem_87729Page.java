package BromfordPageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BormfordBasePage.BasePage;
import BromfordTestUtil.Testutil;

public class ITSMProblem_87729Page extends BasePage{
	
	// this test written/ checked after 1 hr of the problem get closed;
	
	
	
	@FindBy(xpath="//button[@id='areaSwitcherId']")
   	WebElement     AreaSearch;
    
    @FindBy(xpath="//*[text()='Status Center']")
   	WebElement     ClickOnSC;
     
   /* @FindBy(xpath="//*[@id='confirmButton']")
   	WebElement     ClickCancel;*/
    
    @FindBy(xpath="//span[text()='Problems']")
   	WebElement     ClickOnProblem;
	
	@FindBy(xpath="//span[text()='Problems']")
	WebElement     ClickOnProCreate;
	
	@FindBy(xpath="//*[text()='']")
	WebElement     LocatingPro;
	
	public  ITSMProblem_87729Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ITSMProblem_87729Page UserVerifyProblem() throws InterruptedException {
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
		 WebElement clickOnProblem = driver.findElement(By.xpath("//span[text()='Problems']"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click()", clickOnProblem);
		 
	 
	 
	  WebElement searchBox = driver.findElement(By.xpath("//*[@aria-label='Quick find']"));
     searchBox.click();
	// Thread.sleep(Testutil.EXPLICIT_WAIT);
	 searchBox.sendKeys("PR-10483-2021",Keys.ENTER);
		
	 //Thread.sleep(Testutil.EXPLICIT_WAIT);
	 WebElement ProblemLoc = driver.findElement(By.xpath("//*[text()='PR-10483-2021 - Problems For D365 is Done']"));
	 JavascriptExecutor js2 = (JavascriptExecutor)driver;
	 js2.executeScript("arguments[0].click()", ProblemLoc);
	 //ClickOnSandC.click();
	// driver.findElement(By.xpath("//*[@aria-label='OK']")).click();
	 //Thread.sleep(Testutil.EXPLICIT_WAIT);
	return null;
	}
}
