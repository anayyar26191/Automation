package com.tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson02 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username =driver.findElement(By.cssSelector("input#txtUsername"));
		username.sendKeys("admin");
		WebElement password =driver.findElement(By.cssSelector("input#txtPassword"));
		password.sendKeys("admin123");
		password.submit();
		//WebElement login =driver.findElement(By.cssSelector("input#btnLogin"));
		//login.submit();
	}

}
