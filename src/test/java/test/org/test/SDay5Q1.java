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

public class SDay5Q1 extends BaseClass {
	
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
		urlLaunch("http://demo.guru99.com/test/drag_drop.html");
		
		/*Thread.sleep(2000);
		
		WebElement rejAll = driver.findElement(By.xpath("//span[text()='Reject All']"));
		click(rejAll);
		
		Thread.sleep(2000);
		
		WebElement rej = driver.findElement(By.xpath("//span[text()='Reject']"));
		click(rej);*/
		
		Actions a =new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement des = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		// a.dragAndDrop(src, des).perform();
		a.clickAndHold(src).moveToElement(des).perform();
		
		WebElement src1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		//a.dropAndDrop(src,des).perform();
		a.clickAndHold(src1).moveToElement(des1).perform();
		
		 
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
			
		WebElement des2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		//a.dragAndDrop(src,des).perform();
		
		a.clickAndHold(src2).moveToElement(des2).perform();
		
		WebElement src3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement des3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		//a.dragAndDrop(source, target).perform();
		a.clickAndHold(src3).release(des3).perform();
	}

}
