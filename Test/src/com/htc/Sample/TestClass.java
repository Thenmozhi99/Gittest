package com.htc.Sample;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestClass {

	private static WebDriver driver = null;

	public static void main(String[] args) {

	// Create a new instance of the Firefox driver

	driver = new FirefoxDriver();

	driver.get("http://newtours.demoaut.com/");
	
	WebElement e=driver.findElement(By.linkText("Home"));
	/*Actions builder=new Actions(driver);
	Action moving=builder.moveToElement(e).build();
	moving.perform();
	driver.get(baseUrl);          
    WebElement link_Home = driver.findElement(By.linkText("Home"));*/
    WebElement td_Home = driver.findElement(By.xpath("//html/body/div"+ "/table/tbody/tr/td"+ "/table/tbody/tr/td"+ "/table/tbody/tr/td"+ "/table/tbody/tr"));
	//WebElement td_Home = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
     
    Actions builder = new Actions(driver);
    Action mouseOverHome = builder.moveToElement(e).build();
     
    String bgColor = td_Home.getCssValue("background-color");
    System.out.println("Before hover: " + bgColor);  
    
    mouseOverHome.perform(); 
    
    bgColor = td_Home.getCssValue("background-color");
    System.out.println("After hover: " + bgColor);
    
    driver.findElement(By.name("userName")).sendKeys("invalidUN");
    driver.findElement(By.name("userName")).clear();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
   /*Action i=builder.moveToElement(e).click().sendKeys(e,"invaliUN").doubleClick
      i.perform();
      builder.keyDown(Keys.CLEAR);*/
    
    
	
	/*driver.findElement(By.linkText("SIGN-ON")).click();
	

	driver.findElement(By.name("userName")).sendKeys("invalidUN"); 


    driver.findElement(By.name("password")).sendKeys("invalidPW");

    driver.findElement(By.name("login")).click();
    
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    
    driver.findElement(By.cssSelector("input[value='oneway']")).click();
    
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    
    Select temp=new Select(driver.findElement(By.name("passCount")));
    temp.selectByValue("2");
    
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    
    temp=new Select(driver.findElement(By.name("fromPort")));
    
    temp.selectByVisibleText("Portland");
    
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    
    temp=new Select(driver.findElement(By.name("passCount")));
    
    temp.selectByValue("1");
    
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

    System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

    //driver.findElement(By.linkText("SIGN-OFF")).click();

    //driver.quit();*/

	}

}


