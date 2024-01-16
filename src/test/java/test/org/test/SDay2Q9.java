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

public class SDay2Q9 extends BaseClass {
	
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
		urlLaunch("http://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		
		WebElement fstnme = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		sendKeys(fstnme, "Abi");
		
		WebElement lstnme = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		sendKeys(lstnme, "naya");
		
		WebElement add = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		sendKeys(add, "123 Abc nager, ABC");
		
		WebElement eml = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		sendKeys(eml, "abinaya@gmail.com");
		
		WebElement phn = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		sendKeys(phn, "0123456789");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@ng-model='Password']"));
		sendKeys(pwd, "12345");
		
		WebElement cpwd = driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		sendKeys(cpwd, "12345");
		
		
		
		
		
		
	}

}
