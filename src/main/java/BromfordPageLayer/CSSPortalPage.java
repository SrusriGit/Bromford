package BromfordPageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BormfordBasePage.BasePage;
import BromfordTestUtil.Testutil;

public class CSSPortalPage extends BasePage {
	
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
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement   Clicksearch;
	
	public  CSSPortalPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void CreatingPortal(String user, String PWD) throws InterruptedException {
		
	bromfordUrlLaunch(prop.getProperty("portalurl"));
	username.sendKeys(user);
	ClickNext.click();
	Password.sendKeys(PWD);
	Thread.sleep(Testutil.EXPLICIT_WAIT);
	Login.click();
	ClickYes.click();
	}
	
	public void createPortalLink() {
		ClickHelp.click();
		Clicksearch.click();
		Clicksearch.sendKeys("testdata");
		//driver.findElement(By.xpath(" //*[@value='testdata']")).click();
		/* WebElement ele = driver.findElement(By.xpath("//*[@value='testdata']"));
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click()", ele);*/
		// ele.sendKeys("Unfortunately, there are no results for 'testdata");
		 
	}
	
}
