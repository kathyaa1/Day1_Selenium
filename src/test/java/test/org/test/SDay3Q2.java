package test.org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.org.base.BaseClass;

public class SDay3Q2 extends BaseClass {
	
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
	private void test() {
		urlLaunch("https://www.facebook.com/");
		
		WebElement eml = driver.findElement(By.id("email"));
		sendKeys(eml, "bill@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		sendKeys(pwd, "12345");
		
		WebElement lgnbtn = driver.findElement(By.name("login"));
		click(lgnbtn);
		
		
		
		
		
		
	}

}
