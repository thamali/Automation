package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerRegisterPage {
	 WebDriver driver;
	
	By lblCusRegiTitle = By.xpath("//p[contains(text(),'Customer Registered Successfully!!!')]");
	By lblCusId = By.xpath("//tr[4]//td[2]");
	By lnkdeleteCustomer = By.xpath("//ul[@class='menusubnav']//a[contains(text(),'Delete Customer')]");
  
	
	public CustomerRegisterPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	public String getCusRegistrationPage(){
		
		return driver.findElement(lblCusRegiTitle).getText();
		  
	}
	
     public String getCustomerId(){
		
		return driver.findElement(lblCusId).getText();
		  
	}
     
     public void navigateDeleteCustomerPage(){
 		
 		driver.findElement(lnkdeleteCustomer).click();
 		  
 	} 
	

}
