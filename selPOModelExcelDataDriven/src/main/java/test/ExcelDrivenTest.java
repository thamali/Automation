package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;


import Utility.ReadExcel;

import pages.*;


	

	 
	


	public class ExcelDrivenTest {

	    WebDriver driver;

	    LoginPage objLogin;

	    HomePage objHomePage;
	    

	    /*@BeforeTest

	    public void setup() throws FileNotFoundException, IOException {

	    	 System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\AutTraining\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				WebDriverWait wait=new WebDriverWait(driver, 100);
	        driver.get(ReadExcel.readExcel(1,0, ".\\Data\\data.xlsx","Sheet1"));

	    }*/

	    /**

	     * This test case will login in http://demo.guru99.com/V4/

	     * Verify login page title as guru99 bank

	     * Login to application

	     * Verify the home page using Dashboard message
	     * @throws ParseException 
	     * @throws IOException 
	     * @throws FileNotFoundException 

	     */

	    @Test(priority=0)
	    
	    

	    public void test_Home_Page_Appear_Correct() throws FileNotFoundException, IOException{

	    
	    	 System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\AutTraining\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				WebDriverWait wait=new WebDriverWait(driver, 100);
	        driver.get(ReadExcel.readExcel(1,0, ".\\Data\\data.xlsx","Sheet1"));
	    	
	    	
	    	
	    	
	    	//Create Login Page object

	    objLogin = new LoginPage(driver);

	    //Verify login page title
	    
	    

	   String loginPageTitle = objLogin.getLoginTitle();

	    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

	    //login to application

	    objLogin.loginToGuru99(ReadExcel.readExcel(1,1, ".\\Data\\data.xlsx","Sheet1"), ReadExcel.readExcel(1,2, ".\\Data\\data.xlsx","Sheet1"));

	    // go the next page

	    objHomePage = new HomePage(driver);

	    //Verify home page

	    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

	    
	}}
	    