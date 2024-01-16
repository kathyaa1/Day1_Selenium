package test.org.test;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.org.base.BaseClass;

public class SDay1Q2 extends BaseClass {

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
	private void test() {
		urlLaunch("http://www.greenstechnologys.com/");

	}
	
	@Test
	private void test1() {
		urlLaunch("http://gmail.com/");

	}
	
	@Test
	private void test2() {
		urlLaunch("http://www.flipkart.com/");

	}
	
	@Test
	private void test3() {
		urlLaunch("http://greenstech.in/selenium-course-content.html");

	}
}
