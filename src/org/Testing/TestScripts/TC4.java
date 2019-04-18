package org.Testing.TestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.Testing.Base1.Base1;
import org.Testing.Pages.Login;
import org.Testing.Pages.Video;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class TC4 extends Base1
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
	public void Subscribe() throws InterruptedException
	{
		try 
		{
			Login l = new Login(driver, pr);
			l.login_method("sahil.thapar2012@gmail.com", "Youtube@10");
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
			
			
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			
			//List<WebElement> video = driver.findElements(By.id("video-title"));
			List<WebElement> video = driver.findElements(By.id(pr.getProperty("video_click")));
			video.get(0).click();
			Thread.sleep(2000);
			*/
			Video vid = new Video(driver, pr);
			vid.video_play();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			//WebElement subscribe = driver.findElement(By.xpath("//*[contains(@class,'subscribe-button')]"));
			WebElement subscribe = driver.findElement(By.xpath(pr.getProperty("subscribe_button")));
			subscribe.click();
			Thread.sleep(5000);
		}
		catch (Exception e) 
		{
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
