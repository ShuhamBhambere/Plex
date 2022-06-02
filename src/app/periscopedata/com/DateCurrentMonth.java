package app.periscopedata.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateCurrentMonth 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java-Project\\May2022\\JavaMay2022\\SoftFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.periscopedata.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("partners-anthemse@xumo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Pbv5LCFWw4r2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='submit-button button'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Current Month']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='icon'])[4]")).click();
		
		
		
		
		
		
		
	}
	

}
