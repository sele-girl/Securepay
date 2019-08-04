package stepdefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.contactUsPage;
import pageObjects.googlePage;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class test_step {
	public static WebDriver driver;
	googlePage google;
	contactUsPage contctpage;
	
	@Given("^user open the browser$")
	
	public void user_open_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ghaisr\\Desktop\\Mohini\\chromenew\\chromedriver.exe");
		driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("https://www.google.com");
	        driver.manage().window().maximize();
	}

	@When("^user searches for SecurePay$")
	public void user_searches_for_on_SecurePay() {
		googlePage google = new googlePage(driver);
		google.clickOn_Search();
		
	}

	@When("^clicks through to the SecurePay website$")
	public void clicks_through_to_the_website() {
		googlePage google = new googlePage(driver);
		google.clickOn_SearchResult();
	}

	@When("^user navigates to the contact us page$")
	public void user_navigates_to_the_contact_us_page() {
		 driver.get("https://www.securepay.com.au/support/contact-us/");
		 driver.manage().window().maximize();
	}

	@When("^user enters contact details$")
	public void user_enters_contact_details() {
	   contactUsPage contctpage= new contactUsPage(driver);
	   contctpage.sumbitrandomdata();
	}

	@Then("^data should be subbmitted successfully$")
	public void data_should_be_subbmitted_successfully() {
	    
	}


}
