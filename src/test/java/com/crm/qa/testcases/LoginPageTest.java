package com.crm.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;	
	public LoginPageTest() {
		super();		
	}
	
	
	@BeforeMethod
	public void setUp() {		
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		AssertJUnit.assertEquals(title,"Cogmento CRM");
		
	}
	
	@Test(priority=2)
	public void loginTest() {
	homepage =	loginPage.login(prop.getProperty("username"), prop.getProperty("pass"));	
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
