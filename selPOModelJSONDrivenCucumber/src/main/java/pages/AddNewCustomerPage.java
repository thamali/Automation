package pages;

import static org.testng.Assert.assertEquals;

import java.util.Calendar;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddNewCustomerPage {
	
	WebDriver driver;
	
	public AddNewCustomerPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	By lblAddNewCustomer = By.xpath("//p[contains(text(),'Add New Customer')]");
	By chckboxCustomerName = By.xpath("//input[@name='name']");
	By datePickerDateOfBirth = By.xpath("//input[@id='dob']");
	By radiobtnGenderMale= By.xpath("//input[@value='m']");
	By radiobtnGenderFemale= By.xpath("//input[@value='f']");
	By chckboxAddress =By.xpath("//textarea[@name='addr']");
	By chckboxCity= By.xpath("//input[@name='city']");
	By chckboxState=By.xpath("//input[@name='state']");
	By chckboxPin = By.xpath("//input[@name='pinno']");
	By chckboxTelNum =By.xpath("//input[@name='telephoneno']");
	By chckboxEmailId = By.xpath("//input[@name='emailid']");
	By chckboxPassword = By.xpath("//input[@name='password']");
	By btnSubmit = By.xpath("//input[@name='sub']");
	By btnReset =By.xpath("//input[@name='res']");
	By lnkDeleteCustomer=By.xpath("//ul[@class='menusubnav']//a[contains(text(),'Delete Customer')]");
	private String todayStr;
	
	
	 public String getNewCustomerFormTitle(){

         return   driver.findElement(lblAddNewCustomer).getText() ;

        }
	
	
	public void setCustomerName(String newCustomer){
          
		driver.findElement(chckboxCustomerName).sendKeys(newCustomer);
	 }
	public void setDateOfBirth( String dateOfBirth){
	  
		driver.findElement(datePickerDateOfBirth).sendKeys(dateOfBirth);
		
	 }
	
	public void setGender(String radioBtn){
        
		driver.findElement(radiobtnGenderMale).sendKeys(radioBtn);
		
	 }
	
    public void setAddress(String addr){
        
    	driver.findElement(chckboxAddress).sendKeys(addr);
    	
	 }
	
     public void setState(String state){
        
    	 driver.findElement(chckboxState).sendKeys(state);
    	
	 }

     public void setCity(String city){
         
    	 driver.findElement(chckboxCity).sendKeys(city);
     	
 	 }
     
     public void setPIN(String pin){
         
    	 driver.findElement(chckboxPin).sendKeys(pin);
 		
 	 }
     
     public void setTelNum(String telenum){
         
    	 driver.findElement(chckboxTelNum).sendKeys(telenum);
     	
 	 }
     public void setEmai(String email){
         
    	 driver.findElement(chckboxEmailId).sendKeys(email);
      	
  	 }
     public void setPassword(String pwrd){
         
    	 driver.findElement(chckboxPassword).sendKeys(pwrd);
      	
  	 }
     
     public void Submit(){
         
    	  driver.findElement(btnSubmit).click();
     
   	 }
     
     public void AddNewCustomerDetails(String cusname, String gen ,String dob, String addr, String city ,String state,String pin,String telenum,String email,String pwrd ){
    	 
    	 this.setCustomerName(cusname);
    	 this.setGender(gen);
    	 this.setDateOfBirth(dob);
    	 this.setAddress(addr);
    	 this.setCity(city);
    	 this.setState(state);
    	 this.setPIN(pin);
    	 this.setTelNum(telenum);
    	 this.setEmai(email);
    	 this.setPassword(pwrd);
    	 this.Submit();
    	  
    	 
     }
    
     
}
