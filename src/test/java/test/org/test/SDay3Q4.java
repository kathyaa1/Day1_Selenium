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

public class SDay3Q4 extends BaseClass {
	
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
	private void test() throws InterruptedException {
		urlLaunch("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		
		Thread.sleep(2000);
		
		WebElement fstnme = driver.findElement(By.id("first-name"));
		sendKeys(fstnme, "Abi");
		
		WebElement lstnme = driver.findElement(By.id("last-name"));
		sendKeys(lstnme, "naya");
		
		WebElement eml = driver.findElement(By.id("email"));
		sendKeys(eml, "abinaya@gmail.com");
		
		WebElement mbl = driver.findElement(By.id("mobile"));
		sendKeys(mbl, "0123456789");
		
		WebElement cty = driver.findElement(By.id("country"));
		selectByValue(cty, "90");
		
		WebElement city = driver.findElement(By.id("city"));
		sendKeys(city, "ABC");
		
		WebElement msg = driver.findElement(By.name("message"));
		sendKeys(msg, "Form Complete");
		
		WebElement cap = driver.findElement(By.id("code"));
		sendKeys(cap, "008c");
		
		WebElement sbtn = driver.findElement(By.xpath("//button[text()='Send']"));
		click(sbtn);
		
		
		
		
		
		
		
	}

}
