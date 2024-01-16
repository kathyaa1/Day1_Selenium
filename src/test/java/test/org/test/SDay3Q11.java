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

public class SDay3Q11 extends BaseClass {
	
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
		urlLaunch("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		Thread.sleep(4000);
		
		WebElement fstnme = driver.findElement(By.name("firstName"));
		sendKeys(fstnme, "Bill");
		Thread.sleep(4000);
		
		WebElement lstnme = driver.findElement(By.name("lastName"));
		sendKeys(fstnme, "Manos");
		Thread.sleep(4000);
		
		WebElement nxt1 = driver.findElement(By.xpath("//span[text()='Next']"));
		click(nxt1);
		Thread.sleep(4000);
		
		WebElement mnth = driver.findElement(By.id("month"));
		selectByValue(mnth, "1");
		enter();
		Thread.sleep(4000);
		
		WebElement dy = driver.findElement(By.id("day"));
		sendKeys(dy, "01");
		Thread.sleep(4000);
		
		WebElement yr = driver.findElement(By.id("year"));
		sendKeys(yr, "2001");
		Thread.sleep(4000);
		
		WebElement gndr = driver.findElement(By.id("gender"));
		selectByValue(yr, "3");
		Thread.sleep(4000);
		
		WebElement nxt2 = driver.findElement(By.className("VfPpkd-RLmnJb"));
		click(nxt2);
		
		
		
		
		
		
		
	}

}
