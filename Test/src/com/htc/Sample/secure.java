package com.htc.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.Select;

public class secure {
	private static WebDriver driver = null;

	public static void main(String[] args) {

	driver = new FirefoxDriver();
	/*	DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		AndroidDriver driver = new AndroidDriver(caps);
	driver = new AndroidDriver();
*/
	driver.get("http://172.16.10.204:10080/HTC_secureIT_UI/login");
	
	//driver.findElement(By.linkText("SIGN-ON")).click();
	

	driver.findElement(By.name("emailId")).sendKeys("manikandan.r@htcindia.com"); 
    driver.findElement(By.name("password")).sendKeys("manikandanr");
    driver.findElement(By.id("signin-submit")).click();
    
 /*   driver.findElement(By.cssSelector("input[value='oneway']")).click();
    
    Select temp=new Select(driver.findElement(By.name("passCount")));
    temp.selectByValue("4");
    
    temp=new Select(driver.findElement(By.name("fromPort")));
    temp.selectByVisibleText("Paris");
    
    temp=new Select(driver.findElement(By.name("passCount")));
    temp.selectByValue("4");
    */

    System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

    driver.findElement(By.linkText("user_menu")).click();
    driver.findElement(By.id("signout"));
    

//    driver.quit();

	}

}
