package pageObjects;
import org.openqa.selenium.support.How;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
public class googlePage {
	 
		@FindBy(how = How.NAME, using = "q") 
		 private WebElement searchTxt;
		
		@FindBy(how = How.XPATH, using = "//*[contains(text(),'SecurePay Online Payments')]") 
		 private WebElement searchresultTxt;
		
	public googlePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	
	 public void clickOn_Search(){
		 searchTxt.sendKeys("Securepay");
		 searchTxt.sendKeys(Keys.RETURN);
		 try 
		 { Thread.sleep(5000);}
		 catch (InterruptedException e) {}
		 }
	 public void clickOn_SearchResult(){
		 try
		 { Thread.sleep(500);}
		 catch (InterruptedException e) {}
		 searchresultTxt.click();
		
		 
		 }
}
