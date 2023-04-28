package org.keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrolls {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\DELL\\eclipse-Selenium workspace\\DayFour\\ChromeDriver\\chromedriver.exe");
	ChromeOptions opts = new ChromeOptions();
	opts.addArguments("--remte-allow-origins=*");
	WebDriver driver = new ChromeDriver(opts);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement todaysDeal = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].scrollIntoView(true)", todaysDeal);
	
	
}
}
