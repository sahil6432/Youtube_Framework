package org.Testing.Base1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base1 
{
	public ChromeDriver driver;
	public ChromeOptions opt = new ChromeOptions();
	public Properties pr;
	
	@BeforeMethod
	public void browser_launch() throws IOException, InterruptedException
	{
		File f = new File("../YT_Framework1/src/OR.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Jars\\chromedriver_win32\\chromedriver.exe");
		opt.addArguments("disable-notifications");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void close_browser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	
}
