/*package test;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

import org.testng.annotations.Test;



import pages.HomePage;
import pages.LoginPage;
import utility.JSONReader;


	public class pageobjectTest {

	   public static WebDriver driver;

	    LoginPage objLogin;

	    HomePage objHomePage;

	  

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

	    //Verify login page title

	    String loginPageTitle = objLogin.getLoginTitle();

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

	    //login to application
	    
	    objLogin.loginToGuru99(JSONReader.ReadJSONFile("User_Name", "./Data/data.json"),JSONReader.ReadJSONFile("Password", "./Data/data.json"));

	

	    // go the next page

	    objHomePage = new HomePage(driver);

	    //Verify home page
	//    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr257300"));
        driver.close();
        driver.quit();
	    }
	
	}*/