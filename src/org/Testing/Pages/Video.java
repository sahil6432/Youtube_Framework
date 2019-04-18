package org.Testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video 
{
	public Properties pr;
	public ChromeDriver driver;
	
	public Video(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void video_play()
	{
		List<WebElement> video = driver.findElements(By.id(pr.getProperty("video_click")));
		video.get(0).click();
	}
}
