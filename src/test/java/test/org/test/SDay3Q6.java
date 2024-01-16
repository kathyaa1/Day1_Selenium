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

public class SDay3Q6 extends BaseClass {
	
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
		urlLaunch("https://www.redbus.in/");
		
		Thread.sleep(2000);
		
		WebElement acc = driver.findElement(By.xpath("//span[text()='Account']"));
		click(acc);
		
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
		click(signIn);
		
		Thread.sleep(8000);
		
		WebElement mob = driver.findElement(By.id("mobileNoInp"));
		sendKeys(mob, "123456789");
		
		WebElement rob = driver.findElement(By.xpath("//div[@role='presentation']"));
		click(rob);
		
		WebElement rotp = driver.findElement(By.id("otp-container"));
		click(rotp);
		
		
		
	}

}
