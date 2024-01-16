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

public class SDay3Q14 extends BaseClass {
	
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
		urlLaunch("https://www.swiggy.com/");
		
		Thread.sleep(2000);
		
		WebElement signUp = driver.findElement(By.className("r2iyh"));
		click(signUp);
		
		WebElement mbl = driver.findElement(By.id("mobile"));
		sendKeys(mbl, "0123456789");
		
		WebElement nme = driver.findElement(By.id("name"));
		sendKeys(nme, "Bill");
		
		WebElement eml = driver.findElement(By.id("email"));
		sendKeys(eml, "Bill@gmail.com");
		
		WebElement cnt = driver.findElement(By.className("a-ayg"));
		click(cnt);
		
		
		
		
		
	}

}
