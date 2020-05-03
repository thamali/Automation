/*package test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.Test;

import pages.AddNewCustomerPage;
import pages.HomePage;
import pages.LoginPage;
import pages.CustomerRegisterPage;
import pages.DeleteCustomerPage;

import utility.JSONReader;


   
	public class customerTest {

	   public static WebDriver driver;

	    LoginPage objLogin;

	    HomePage objHomePage;
	    
	    AddNewCustomerPage objAddNewCus;
	    
	    CustomerRegisterPage objCusRegis;
        
	    DeleteCustomerPage objDelCus;
	  

	    *//**

	     * This test case will login in http://demo.guru99.com/V4/

	     * Verify login page title as guru99 bank

	     * Login to application

	     * Verify the home page using Dashboard message
	     * @throws ParseException 
	     * @throws IOException 
	     * @throws FileNotFoundException 

	     *//*

	    @Test(priority=0)

	    public void test_Home_Page_Appear_Correct() throws FileNotFoundException, IOException, ParseException{
	    	
	    	
	   System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\AutTraining\\chromedriver.exe");
		   		
	   WebDriver driver = new ChromeDriver();
	    driver.get(JSONReader.ReadJSONFile("URL", "./Data/data.json"));
	    objLogin = new LoginPage(driver);
	    
	    WebDriverWait wait = new WebDriverWait(driver,20);

	    //Verify login page title
	    
	    

	    String loginPageTitle = objLogin.getLoginTitle();

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

	    //login to application
	    
	    objLogin.loginToGuru99(JSONReader.ReadJSONFile("User_Name", "./Data/data.json"),JSONReader.ReadJSONFile("Password", "./Data/data.json"));

	

	    // go the next page

	    objHomePage = new HomePage(driver);

	    //Verify home page
	   Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr257300"));
	   
	    //goto the add new customer page
	    objHomePage.navigateToNewCustomerlnk();
	    //Verify Add New CustomerPage
	   
	    objAddNewCus=new AddNewCustomerPage(driver);
	    Assert.assertTrue(objAddNewCus.getNewCustomerFormTitle().contains("Add New Customer"));
	    
	    //add customer details
	    objAddNewCus.AddNewCustomerDetails(JSONReader.ReadJSONFile("CustomerName", "./Data/data.json"),
	    		JSONReader.ReadJSONFile("Gender", "./Data/data.json"),JSONReader.ReadJSONFile("DateOfBirth", "./Data/data.json"),
	    		JSONReader.ReadJSONFile("Address","./Data/data.json"),JSONReader.ReadJSONFile("State","./Data/data.json"),JSONReader.ReadJSONFile("City","./Data/data.json"),
	    		JSONReader.ReadJSONFile("PIN","./Data/data.json"),JSONReader.ReadJSONFile("MobileNumber","./Data/data.json"),JSONReader.ReadJSONFile("Email","./Data/data.json"),JSONReader.ReadJSONFile("CustPassword","./Data/data.json"));
	    
	   
	    
	    //Verify New Cusomer
	    
	    
	    objCusRegis= new CustomerRegisterPage(driver);
	    Assert.assertTrue(objAddNewCus.getNewCustomerFormTitle().contains("Customer Registered Successfully!!!"));
	    String cusId=objCusRegis.getCustomerId();
	    
	    //Go to DeleteCustomerPage
	    objCusRegis.navigateDeleteCustomerPage();
	    
	    objDelCus=new DeleteCustomerPage(driver);
	   // Verify Delete Customer Page
	    Assert.assertTrue(objDelCus.getDeleteCustomerTitle().contains("Delete Customer Form"));
	    
	    //Delete CustomerId
	    objDelCus.DeleteCustomer(cusId);
	    
	    
        driver.close();
        driver.quit();
	    }
	
	}*/