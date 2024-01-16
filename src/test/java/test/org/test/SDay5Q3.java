package test.org.test;

import java.awt.AWTException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.org.base.BaseClass;

public class SDay5Q3 extends BaseClass {

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
		urlLaunch("http://www.flipkart.com");
		
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		
		WebElement hme = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		click(hme);
		
		Thread.sleep(3000);
		
		WebElement hmeFrn = driver.findElement(By.className("_2I9KP_"));
	
		a.moveToElement(hmeFrn).perform();
		
		Thread.sleep(5000);
		
		WebElement twl = driver.findElement(By.xpath("//a[@title='Bath Towels']"));
		a.moveToElement(twl).perform();
		
		
	}
}
