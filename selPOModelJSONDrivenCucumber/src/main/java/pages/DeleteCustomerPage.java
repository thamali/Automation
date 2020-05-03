package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteCustomerPage {
	
	By lnlDelCusTitle= By.xpath("//p[contains(text(),'Delete Customer Form')]");
	By chckboxCusId=By.xpath("//input[@name='cusid']");
	By btnSubmit=By.xpath("//input[@name='AccSubmit']");

WebDriver driver;
	
	public DeleteCustomerPage(WebDriver driver){
		
		this.driver=driver;
	}

     public String getDeleteCustomerTitle(){
		
		
		return driver.findElement(lnlDelCusTitle).getText();
	}
	
     public void setCustomerId(String cusId){
 		
 		
 		driver.findElement(chckboxCusId).sendKeys(cusId);;
 	}
	
    public void ClickSubmit(){
    	
    	driver.findElement(btnSubmit).click();
    	
    }
    
    public void DeleteCustomer(String cusid){
    	
    	this.setCustomerId(cusid);
    	this.ClickSubmit();
    }
}
