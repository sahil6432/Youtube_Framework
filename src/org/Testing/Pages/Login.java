package org.Testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public Properties pr;
	public ChromeDriver driver;
	
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void login_method(String user, String password) throws InterruptedException 
	{
		WebElement sign_in_button = driver.findElement(By.xpath(pr.getProperty("signInButton")));
		sign_in_button.click();
		
		WebElement email = driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys(user);
		
		WebElement next_button = driver.findElement(By.xpath(pr.getProperty("emailNext")));
		next_button.click();
		Thread.sleep(2000);
		
		WebElement pw = driver.findElement(By.xpath(pr.getProperty("password")));
		pw.sendKeys(password);
		
		WebElement password_next = driver.findElement(By.xpath(pr.getProperty("passwordNext")));
		password_next.click();
		
	}
}
