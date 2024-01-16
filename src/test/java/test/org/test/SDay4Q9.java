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

public class SDay4Q9 extends BaseClass {
	
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
	private void test() throws AWTException {
		urlLaunch("https://www.snapdeal.com/");
		
		WebElement srch = driver.findElement(By.name("keyword"));
		sendKeys(srch, "Mixer");
		enter();
		
		WebElement orp = driver.findElement(By.xpath("//p[text()='Orpat Kitchen Star 1200 Watt 3 Jar Juicer Mixer Grinder']"));
		click(orp);
		
		
		
		
	}

}
