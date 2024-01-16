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

public class SDay3Q12 extends BaseClass {
	
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
	private void test() throws InterruptedException, AWTException {
		urlLaunch("https://www.snapdeal.com/");
		
		Thread.sleep(2000);
		
		WebElement acc = driver.findElement(By.className("accountInner"));
		click(acc);
		
		WebElement rgr = driver.findElement(By.className("newUserRegister"));
		click(rgr);
		
		Thread.sleep(7000);
		
		WebElement usr = driver.findElement(By.id("userName"));
		sendKeys(usr, "bull@gmail.com");
		
		WebElement cnt = driver.findElement(By.id("checkUser"));
		click(cnt);
		
		
		
		
		
		
		
		
	}


}
