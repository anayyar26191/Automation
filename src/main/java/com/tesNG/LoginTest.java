package com.tesNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest  {
	@Test(invocationCount=2)
	public void loginPage() {
	System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.univadis.co.uk/");
	driver.findElement(By.xpath("//a[@title='Sign up free']")).click();
	driver.findElement(By.name("firstName")).sendKeys("Anji");
	driver.findElement(By.name("lastName")).sendKeys("Nayy");
	driver.findElement(By.name("emailAddress")).sendKeys("an@gmail.com");
	driver.findElement(By.name("password")).sendKeys("123qqq");
	driver.findElement(By.name("password_check")).sendKeys("123qqq");
	driver.findElement(By.xpath("//span[text()='Title']/..")).click();
	String titleValue="Prof.";
	driver.findElement(By.xpath("//span[text()='"+titleValue+"']/..")).click();

	driver.findElement(By.xpath("//button[text()='Create Account']")).click();
	
	}

}//button[text()='Create Account']
