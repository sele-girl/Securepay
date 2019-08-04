package pageObjects;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class contactUsPage {
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Contact us ')]") 
	 private WebElement contactLink;
	
	@FindBy(how = How.NAME, using = "first-name") 
	 private WebElement firstNameTextbox;
	
	@FindBy(how = How.NAME, using = "last-name") 
	 private WebElement lastNameTextbox;
	
	@FindBy(how = How.NAME, using = "email-address") 
	 private WebElement emailTextbox;
	
	@FindBy(how = How.NAME, using = "phone-number") 
	 private WebElement phonenumberTextbox;
	
	@FindBy(how = How.NAME, using = "website-url") 
	 private WebElement websiteTextbox;
	
	@FindBy(how = How.NAME, using = "business-name") 
	 private WebElement companyTextbox;
	
	@FindBy(how = How.NAME, using = "reason-for-enquiry") 
	 private WebElement reasonToEnquiredropdown;
	
	public contactUsPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
		
public void sumbitrandomdata()
{
	Random r= new Random();
	
	//Generate Random data using random class
	String firstName="firstName" +r.nextInt();
	String lastName="lastName" +r.nextInt();
	String email="email"+r.nextInt() +"@gmail.com";
	
	long phone =(long)(Math.random() * 100000 + 61033000000L);
	String phoneNumber =Long.toString(phone);
	
	String companyName="companyName" +r.nextInt();
	
	Select reasonToEnquire = new Select(reasonToEnquiredropdown);
	
	//Feeding data to application
	firstNameTextbox.sendKeys(firstName);
	lastNameTextbox.sendKeys(lastName);
	emailTextbox.sendKeys(email);
	phonenumberTextbox.sendKeys(phoneNumber);
	companyTextbox.sendKeys(companyName);
	reasonToEnquire.selectByIndex(2);
	
	try { 
	Thread.sleep(5000);
	}
	 catch (InterruptedException e) {}
}
}

