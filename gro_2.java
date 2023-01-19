package com.groproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gro_2 {
	public static  WebDriver driver;
	public  void signin() { 
		  driver.findElement(By.xpath("//a[text()='TE Admin Login']")).click();
	    driver.findElement(By.id("email")).sendKeys("super_admin@hlf.com");
	    driver.findElement(By.id("password")).sendKeys("12345678");
	    driver.findElement(By.xpath("//button[.='Sign In']")).click();
	    	   }
	   public  void profile_type() {
	    WebElement profile_type = driver.findElement(By.id("profile_type"));
         profile_type.click();
	   }
	   public  void down() throws AWTException {
	    Robot rs=new Robot();
	    rs.keyPress(KeyEvent.VK_DOWN);
	    rs.keyRelease(KeyEvent.VK_DOWN);
	   }
	   public void enter() throws AWTException {
		Robot rs=new Robot();
	    rs.keyPress(KeyEvent.VK_ENTER);
	    rs.keyRelease(KeyEvent.VK_ENTER);
	   }
	   public  void audit_test_customer() throws AWTException {
		   WebElement ship1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		   ship1.sendKeys("Audit Test Customer");
	       enter();
           driver.get("http://13.232.97.105/my-loads/shippertabs=all/11211");
           WebElement addload = driver.findElement(By.xpath("//a[@id='dropdownMenuButton']"));
           addload.click();
	   }
	    
	


}
