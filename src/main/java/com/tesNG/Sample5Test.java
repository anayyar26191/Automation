package com.tesNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample5Test extends Sample6Test{
	@Test(dependsOnMethods= {"wePageTile"})
	public void loginCRM()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.univadis.co.uk/");
		driver.findElement(By.xpath("//a[@title='Sign up free']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Anji");
		driver.findElement(By.name("lastName")).sendKeys("Nayy");
	}

}
