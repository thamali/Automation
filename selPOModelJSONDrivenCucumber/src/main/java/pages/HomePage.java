package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    By homePageUserName = By.xpath("//table//tr[@class='heading3']");
   // WebElement lnkNewCustomer = driver.findElement(By.xpath("//a[contains(text(),'New Customer')]"));
   By lnkNewCustomer = By.xpath("//a[contains(text(),'New Customer')]");
    
    public HomePage(WebDriver driver){

        this.driver = driver;

    }

    //Get the User name from Home Page

        public String getHomePageDashboardUserName(){

         return    driver.findElement(homePageUserName).getText();

        }
        
        public void navigateToNewCustomerlnk(){

        	
        	System.out.println("abc");
        
        	driver.findElement(lnkNewCustomer).click();
             

           }
}