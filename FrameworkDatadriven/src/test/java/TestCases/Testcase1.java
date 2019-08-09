package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import ExcelReader.ExcelReader;
import TestBase.TestBase;
import applicationpages.loginpage;

public class Testcase1 extends TestBase{

	String sheetName = "testdata";
		
	loginpage loginpa;
	
	
	@Test(dataProvider="getCRMTestData")
		public void loginTest(String us, String pa) throws Exception {
		loginpage loginpa=new loginpage(driver);
	    	 
	            loginpa.login(us, pa);
	            
		
	}
		
		
		@DataProvider
		public Object[][] getCRMTestData(){
			Object data[][] = ExcelReader.getTestData(sheetName);
			return data;
		}
	}
	
	

