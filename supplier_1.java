package com.groproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class supplier_1 extends gro_1 {
	public static  WebDriver driver;
	public static void main(String[] args) throws AWTException {
		System.setProperty("WebDriver.chrome.driver","/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/Driver");
	    driver=new ChromeDriver();
	    driver.get("http://13.232.97.105/");
     driver.manage().window().maximize();
     signin();
     profile_type();
     down();
     shreeji();
     driver.findElement(By.xpath("//html/body/div[2]/div/div[4]/div/div[3]/div/div/div/div/div[7]/div/div[4]/div[4]")).click();
     	}
	 public static void signin() { 
		    driver.findElement(By.xpath("//a[text()='TE Admin Login']")).click();
		    driver.findElement(By.id("email")).sendKeys("super_admin@hlf.com");
		    driver.findElement(By.id("password")).sendKeys("12345678");
		    driver.findElement(By.xpath("//button[.='Sign In']")).click();
		    	   }
	 public static void profile_type() {
	     driver.findElement(By.id("profile_type")).click();
          }
	   public static void down() throws AWTException {
	    Robot rs=new Robot();
	    rs.keyPress(KeyEvent.VK_DOWN);
	    rs.keyRelease(KeyEvent.VK_DOWN);
	   }
	   public static void shreeji() throws AWTException {
			  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("shreeji");
			  enter();
	           driver.get("http://13.232.97.105/my-bids/suppliertabs=all/444");
	             }
	   

}
