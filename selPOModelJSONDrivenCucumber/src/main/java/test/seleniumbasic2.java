/*package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumbasic2 {
	
	@Test
	public void test()  
	
	{
		//WebDriverManager using auto download chromedriver
		WebDriverManager.chromedriver().version("80").setup();
		   //  System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\AutTraining\\chromedriver.exe");
				
		     // System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			//WebDriverManager.chromedriver().version("76").setup();
			//Headless 
			//ChromeOptions options = new ChromeOptions(); 
			//options.setHeadless(true);
			//options.addArguments("--headless");
		       WebDriver driver = new ChromeDriver();
		    	
		  
		        driver.get("http://demo.guru99.com/V4/");
	            

		        driver.findElement(By.name("uid")).sendKeys("mngr254945");
		   
		        driver.findElement(By.name("password")).sendKeys("ymytuba");
		   
		        driver.findElement(By.name("btnLogin")).click();
		        
		        
	          //WebDriverWait wait = new WebDriverWait(driver, 20);
		      //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@class='heading3']/td")));
		       //String heading =  driver.findElement(By.xpath("//tr[@class='heading3']/td")).getText();
		        
		        Assert.assertEquals(driver.findElement(By.xpath("//tr[@class='heading3']/td")).getText(), "Manger Id : mngr254945");
		    
		        driver.close();
		        driver.quit();
		       
		    }	

}
*/