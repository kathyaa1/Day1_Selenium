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

public class SDay4Q10 extends BaseClass {
	
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
		urlLaunch("https://www.flipkart.com/");
		
		WebElement srch = driver.findElement(By.className("Pke_EE"));
		sendKeys(srch, "Blender");
		enter();
		
		WebElement blend = driver.findElement(By.xpath("//a[text()='USHA 250 W (Black)STAINLESS STEEL BAR Silent Operation ...']"));
		click(blend);
		
		
		
		
	}

}
