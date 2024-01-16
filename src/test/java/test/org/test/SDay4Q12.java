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

public class SDay4Q12 extends BaseClass {
	
	@BeforeClass
	private void beforeClass() {
		browserLaunch("chrome");
		System.out.println("Before Class");
	}

	@AfterClass
	private void afterClass() {
		close();
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
		urlLaunch("https://www.shopclues.com/wholesale.html");
		
		WebElement srch = driver.findElement(By.id("autocomplete"));
		sendKeys(srch, "Mixer Jar");
		enter();
		
		Thread.sleep(4000);
		
		WebElement mxr = driver.findElement(By.xpath("//h2[text()='Maharaja Whiteline MX-220 1000 W Ultramax HD 3 Stainles']"));
		click(mxr);
		
		
		
	}

}
