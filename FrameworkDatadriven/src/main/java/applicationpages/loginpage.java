package applicationpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mongodb.util.Util;

import com.relevantcodes.extentreports.LogStatus;

import TestBase.TestBase;
import Utility.util;

public class loginpage extends TestBase {

	
	
	@FindBy(xpath =("//input[@type='text' and @name='vUsername' and @id='vUsername']"))
	WebElement username;
	
    @FindBy(xpath=("//input[@type='password' and @name='vPassword' and @id='vPassword']"))
	WebElement password;

    @FindBy(xpath=("//a[@id='btn_sign_in']"))
    WebElement sub;
    
    

	public loginpage(WebDriver driver){
		
		this.driver=driver;
		
	   PageFactory.initElements(driver, this);
	}
	
	
		
	public void login(String usert,String passg) throws InterruptedException {
		
		util.waitForWebElement(driver,username,20).sendKeys(usert);
		test.log(LogStatus.PASS,"Entered username");
		util.waitForWebElement(driver,password,20).sendKeys(passg);
		test.log(LogStatus.PASS,"Entered password");
		util.waitForWebElement(driver,sub,20).click();
		test.log(LogStatus.PASS,"submited");
		
		

	}
	
}
