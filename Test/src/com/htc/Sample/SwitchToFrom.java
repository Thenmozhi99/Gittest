package com.htc.Sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SwitchToFrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		String url;
		
		driver.get("http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		/*driver.findElement(By.linkText("Deprecated Interfaces")).click();
		driver.findElement(By.linkText("No Frames")).click();
		driver.findElement(By.linkText("Index")).click();
		driver.findElement(By.linkText("Frames")).click();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();*/
		//driver.quit();
	}

}
