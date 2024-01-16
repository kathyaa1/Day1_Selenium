package test.org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		
		switch(browsername) {
		
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		case"firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
}
		return driver;
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);

	}
	
	public static void close() {
		driver.close();

	}
	
	public static void quit() {
		driver.quit();

	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void sendKeys(WebElement w, String value) {
		w.sendKeys(value);
	}
	
	public static void click(WebElement w) {
		w.click();
	

	}
	
	public static void enter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void selectByValue(WebElement w, String value) {
		Select s=new Select(w);
		s.selectByValue(value);

	}
	
	public static void mouseOver(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();

	}
	
	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a=new Actions(driver);
		a.clickAndHold(src).release(des).perform();

	}

}
