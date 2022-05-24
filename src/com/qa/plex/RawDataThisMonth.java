package com.qa.plex;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RawDataThisMonth {
	   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java-Project\\May2022\\JavaMay2022\\SoftFiles\\chromedriver.exe");
		 
		String downloadfilepath ="C:\\Download file selenium";
		
		HashMap <String,Object> chromeprefs =new HashMap<String,Object>();
		chromeprefs.put("profile.default_content_settings.popups", 0);
		chromeprefs.put("download.default_directory", downloadfilepath);
		
		ChromeOptions options =new ChromeOptions();
		options.setExperimentalOption("prefs", chromeprefs);
		options.addArguments("--test-type");
		options.addArguments("--disable-extensions");
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		
		     driver=new ChromeDriver(options);
		     driver.get("https://reporting.plex.tv/livetv");
		
	  
    	driver.manage().window().maximize();
        Thread.sleep(2000);
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement frame1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='ih2Tp']")));
    	driver.switchTo().frame(frame1);
       
    	Thread.sleep(2000);
     	driver.findElement(By.xpath("//div[text()='Continue with Email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("reporting@anthemse.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='CTsIq oYmvn t42gm']")).sendKeys("!Anthemse123");
     	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("(//div[@align='center'])[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='content-holder'])[1]")).click();
		 Thread.sleep(8000);
			driver.findElement(By.xpath("//md-select-value[@class='md-select-value']")).click();
			Thread.sleep(2000);
//This Month
			driver.findElement(By.xpath("(//md-option[@ng-value='option'])[14]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='md-button md-raised']")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//div[@class='chart-menu-button header-menu-button']")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("(//button[@role='menuitem'])[3]")).click();
			Thread.sleep(2000);
			
			
			Set<String> ids1 = driver.getWindowHandles();
			for(String id:ids1)
			{
				System.out.println(ids1);
			}
			
			 ArrayList<String> al1=new ArrayList(ids1);
			 driver.switchTo().window(al1.get(0));
	    	 Thread.sleep(5000);
		     driver.findElement(By.xpath("(//span[@class='mat-radio-label-content'])[2]")).click();
		     Thread.sleep(5000);
		     driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-ra')]")).click();
		     Thread.sleep(5000);
		     driver.close();
		     
		
	}
	
}
