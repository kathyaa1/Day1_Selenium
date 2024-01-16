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

public class SDay4Q6 extends BaseClass {
	
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
	private void test() throws InterruptedException {
		urlLaunch("https://www.facebook.com/");
		
//		WebElement dec = driver.findElement(By.id("u_0_j_wr"));
//		click(dec);
//		
	/*	WebElement eml = driver.findElement(By.id("email"));
		sendKeys(eml, "Bill@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		sendKeys(pwd, "12345");*/
		Thread.sleep(4000);
		WebElement emltxt = driver.findElement(By.xpath("//input[contains(@id='email')]"));
		String text = emltxt.getText();
		System.out.println(text);
		
		WebElement pwdtxt = driver.findElement(By.xpath("//input[contains(@id='pass')]"));
		String text2 = pwdtxt.getText();
		System.out.println(text2);
		
	}

}
