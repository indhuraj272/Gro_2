package com.groproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class gro_1{
	public static  WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException  {

		System.setProperty("WebDriver.chrome.driver","/home/hp/eclipse-workspace/seleniumDemo/src/com/selenium/learn/Selenium/Driver");
	    driver=new ChromeDriver();
	    driver.get("http://13.232.97.105/");
     driver.manage().window().maximize();
//     gro_2 aa=new gro_2();
//     aa.signin();
    signin();
    profile_type();
    down();
    enter();
    audit_test_customer();
    add_load();
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
	   public static void enter() throws AWTException {
		Robot rs=new Robot();
	    rs.keyPress(KeyEvent.VK_ENTER);
	    rs.keyRelease(KeyEvent.VK_ENTER);
	   }
	   public static void audit_test_customer() throws AWTException {
		  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Audit Test Customer");
		  enter();
           driver.get("http://13.232.97.105/my-loads/shippertabs=all/11211");
             }
	   public static void add_load() throws AWTException, InterruptedException {
		   driver.findElement(By.xpath("//a[@id='dropdownMenuButton']")).click();
           driver.findElement(By.id("load_name")).sendKeys("load1");
           driver.findElement(By.id("load_expiry")).click();
           down();
           down();
           enter();
          driver.findElement(By.id("autocomplete_pickup")).sendKeys("srivilliputtur");
          Thread.sleep(2000);
//          Wait.until(ExpectedConditions.visibilityOf(By.id("autocomplete_pickup"))); 
           down();
           down();
           enter();
           Thread.sleep(2000);
          driver.findElement(By.xpath("//button[@class='btn btn-danger font-weight-bold addressAddPopupCancel mt-6 rounded']")).click();
          Thread.sleep(2000);
           driver.findElement(By.id("loading_incharge")).sendKeys("orphan");
           driver.findElement(By.id("mobile_number")).sendKeys("8787878978");
           
           driver.findElement(By.id("autocomplete")).sendKeys("theni");
           Thread.sleep(2000);
           down();
           down();
           enter();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//button[@class='btn btn-danger font-weight-bold addressAddPopupCancel mt-6 rounded']")).click();
           driver.findElement(By.id("tat")).sendKeys("52");
           
           driver.findElement(By.id("billToAddressName")).click();
           down();
           down();
           enter();
           Thread.sleep(2000);           
           driver.findElement(By.id("selectPriceTypeTon")).click();
           driver.findElement(By.id("price_per_truck")).sendKeys("30000");
           driver.findElement(By.id("vendor_amount")).sendKeys("40000");
           driver.findElement(By.id("weight")).sendKeys("2");
           driver.findElement(By.id("fuel_credit_no")).click();
           driver.findElement(By.id("material_type")).click();
           down();
           down();
           enter();
           Thread.sleep(2000);
//           driver.findElement(By.id("//input[@placeholder='Select Material Type Secondary']")).click();
           driver.findElement(By.xpath("//html/body/div[2]/div/div[4]/div/div[2]/div/form/div[5]/div[2]/div/div[2]/div/span/span/span/ul/li/input")).click();
           down();
           down();
           enter();
           Thread.sleep(2000);
           WebElement packageoption = driver.findElement(By.xpath("//html/body/div[2]/div/div[4]/div/div[2]/div/form/div[5]/div[2]/div/div[2]/div[2]/span/span/span/ul/li/input"));
           packageoption.click();
           down(); 
           enter();
//           Select s=new Select(packageoption);
//           s.selectByValue("Tanker");
//           s.selectByValue("High Density Polyethylene Bags");
//           enter();
           driver.findElement(By.id("packages")).sendKeys("30");
           driver.findElement(By.id("enter-truck-type")).click();
           driver.findElement(By.xpath("//input[contains(@class,' enter-truck-manual')]")).sendKeys("closed truck");
           driver.findElement(By.id("submit")).click();
           driver.findElement(By.xpath("//a[text()='Submit']")).click();
           Thread.sleep(2000);
//            driver.switchTo().alert().accept();
           
         driver.findElement(By.xpath("//button[contains(@class,'swal2-confirm swal2-styled')]")).click();
         driver.findElement(By.xpath("//html/body/div[2]/div/div[4]/div/div[3]/div/div/div/div/div[7]/div/div[4]/div[4]")).click();
           
            }
	   
	   
	  
	   
}
	    
	


