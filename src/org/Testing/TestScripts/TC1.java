package org.Testing.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Testing.Base1.Base1;
import org.Testing.Pages.Login;
import org.Testing.Utilities.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class TC1 extends Base1
{
	/*
	ChromeDriver driver;
	ChromeOptions options = new ChromeOptions();
	
	@BeforeMethod
	public void browser_launch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Jars\\chromedriver_win32\\chromedriver.exe");
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();	
	}
	
	*/
	@Test
	public void Trending() throws InterruptedException, IOException
	{
		try 
		{
			Login l = new Login(driver, pr);
			l.login_method("sahil.thapar2012@gmail.com", "Youtube@10");
			
			org.Testing.Utilities.Logs.TakeLogs("TC1", "Login Successful");
			/*
			//WebElement sign_in_button = driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
			WebElement sign_in_button = driver.findElement(By.xpath(pr.getProperty("signInButton")));
			sign_in_button.click();
			
			//WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
			WebElement email = driver.findElement(By.xpath(pr.getProperty("email")));
			email.sendKeys("sahil.thapar2012@gmail.com");
			
			//WebElement next_button = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]"));
			WebElement next_button = driver.findElement(By.xpath(pr.getProperty("emailNext")));
			next_button.click();
			Thread.sleep(2000);
			
			//WebElement password = driver.findElement(By.xpath("//*[contains(@type,'password')]"));
			WebElement password = driver.findElement(By.xpath(pr.getProperty("password")));
			password.sendKeys("Youtube@10");
			
			//WebElement password_next = driver.findElement(By.xpath("//*[contains(@id,'passwordNext')]"));
			WebElement password_next = driver.findElement(By.xpath(pr.getProperty("passwordNext")));
			password_next.click();
			
			*/
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
			//WebElement trend = driver.findElement(By.xpath("//a[@title=\"Trending\"]"));
			WebElement trend = driver.findElement(By.xpath(pr.getProperty("trending_button")));
			String t = trend.getText();
			System.out.println(t);
			trend.click();
			Screenshot.TakeScreenshot(driver, "D:\\Screenshots\\TC1_Passed.png");
			org.Testing.Utilities.Logs.TakeLogs("TC1", "TC1 is passed");
		}
		
		catch (Exception e) 
		{
			Screenshot.TakeScreenshot(driver, "D:\\\\Screenshots\\\\TC1_Failed.png");
			org.Testing.Utilities.Logs.TakeLogs("TC1", "TC1 is failed");
			System.out.println("code failure");
		}	
	}
	
	/*
	@AfterMethod
	public void close_browser()
	{
		driver.close();
	}
	*/
}