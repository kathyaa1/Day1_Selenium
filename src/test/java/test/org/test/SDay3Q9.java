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

public class SDay3Q9 extends BaseClass {
	
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
		urlLaunch("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		click(login);
		
		WebElement phn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		sendKeys(phn, "123456789");
		
		WebElement otp = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		click(otp);
		
		
		
		
		
		
		
	}

}
