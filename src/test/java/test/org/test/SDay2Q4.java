package test.org.test;

import java.awt.AWTException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.org.base.BaseClass;

public class SDay2Q4 extends BaseClass {

	@BeforeClass
	private void beforeClass() {
		browserLaunch("chrome");
		System.out.println("Before Class");
	}

	@AfterClass
	private void afterClass() {
		//close();
		System.out.println("After Class");

	}
	
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method" + new Date());

	}
	
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method" + new Date());

	}
	
	@Test
	private void test() throws AWTException, InterruptedException {
		urlLaunch("https://infinity.icicibank.com/corp/Login.jsp");
		
		
		
		
		WebElement usr = driver.findElement(By.id("DUMMY1"));
		
		Thread.sleep(1000);
		sendKeys(usr, "Abi777");
		
		WebElement go = driver.findElement(By.id("user-id-goahead"));
		click(go);
		
		
		WebElement pwd = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		sendKeys(pwd, "12345");
		
		
		
		
		
	}
}
