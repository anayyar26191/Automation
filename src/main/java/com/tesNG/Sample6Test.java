package com.tesNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample6Test {
	@Test
	public void wePageTile()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		System.out.println(driver.getCurrentUrl()); 
		System.out.println(driver.getTitle());
	}

}
