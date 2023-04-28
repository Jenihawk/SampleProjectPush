package org.keyboardactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyboardActions {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\DELL\\eclipse-Selenium workspace\\KeyboardActionsHW\\ChromeDriver\\chromedriver.exe");
	ChromeOptions opts = new ChromeOptions();
	opts.addArguments("--remte-allow-origins=*");
	WebDriver driver = new ChromeDriver(opts);
	driver.get("http://www.adactinhotelapp.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	Robot robot = new Robot();
	
	for(int i=1; i<=3; i++) {
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
	}
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_A);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_N);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	
	Thread.sleep(1000);	
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_2);
	robot.keyRelease(KeyEvent.VK_2);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	
	
	
	robot.keyPress(KeyEvent.VK_MINUS);
	robot.keyRelease(KeyEvent.VK_MINUS);
	
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.keyPress(KeyEvent.VK_MINUS);
	robot.keyRelease(KeyEvent.VK_MINUS);
	robot.keyRelease(KeyEvent.VK_SHIFT);
	
	robot.keyPress(KeyEvent.VK_DECIMAL);
	robot.keyRelease(KeyEvent.VK_DECIMAL);	
	
	
}
}
