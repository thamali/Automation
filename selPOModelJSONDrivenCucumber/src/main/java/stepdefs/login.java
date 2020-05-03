package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import utility.JSONReader;
import pages.HomePage;

public class login {
	  WebDriver driver;

	    LoginPage objLogin;

	    HomePage objHomePage;
	
	   // ExtentReport extRpt = new ExtentReport();
	  //  ExcelRead excel = new ExcelRead();
	    @Given("^I have user name and password$")
	    public void i_have_user_name_and_password() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
	    //	System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\AutTraining\\chromedriver.exe");
			WebDriverManager.chromedriver().version("80").setup();
			   // driver = new ChromeDriver();
			   WebDriver driver = new ChromeDriver();

		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		        driver.get("http://demo.guru99.com/V4/");
		     
		      
	
	}

	@When("^I successfully login$")
	public void i_successfully_login() throws Throwable {
		//   extRpt.startTestCase("User Login");
			
		    objLogin = new LoginPage(driver);

		    //Verify login page title

		   
		    
		    objLogin = new LoginPage(driver);

		    //Verify login page title

		    String loginPageTitle = objLogin.getLoginTitle();

		    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

		    objLogin.loginToGuru99(JSONReader.ReadJSONFile("User_Name", "./Data/data.json"),JSONReader.ReadJSONFile("Password", "./Data/data.json"));

			

		    // go the next page

		  

	}

	  
	   


	@Then("^I should navigate to the home page$")
	public void i_should_navigate_to_the_home_page() throws Throwable {
		 objHomePage = new HomePage(driver);

		    //Verify home page

	
		    //Verify home page

		 Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr257300"));
		    driver.close();
		   
		    
		 
	}


}