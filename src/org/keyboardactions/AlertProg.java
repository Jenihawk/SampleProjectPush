package org.keyboardactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertProg {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\DELL\\eclipse-Selenium workspace\\DayFour\\ChromeDriver\\chromedriver.exe");
	ChromeOptions opts = new ChromeOptions();
	opts.addArguments("--remte-allow-origins=*");
	WebDriver driver = new ChromeDriver(opts);
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	Thread.sleep(1000);
//simple Alert	
WebElement btn1 = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
btn1.click();
Thread.sleep(1000);
//without taking return type
driver.switchTo().alert().accept();
Thread.sleep(1000);
//confirm Alert
WebElement tab1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
tab1.click();
Thread.sleep(1000);
WebElement btn2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
btn2.click();
Thread.sleep(1000);
driver.switchTo().alert().dismiss();
Thread.sleep(1000);
//Prompt Alert
WebElement tab2 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
tab2.click();
Thread.sleep(1000);
WebElement btn3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
btn3.click();
Thread.sleep(1000);
//to take the prompt or info in the alert box
String text = driver.switchTo().alert().getText();
System.out.println(text);
Thread.sleep(1000);
driver.switchTo().alert().sendKeys("Jenifer");
driver.switchTo().alert().accept();
//Thread.sleep(1000);
String text2 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
System.out.println(text2);
}
}
