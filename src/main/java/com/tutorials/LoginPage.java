package com.tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.suvideals.ooo/Login.action");
		driver.findElement(By.name("userHandle")).sendKeys("anj");
		driver.findElement(By.id("password")).sendKeys("anj1");
		driver.findElement(By.xpath("//button[@class='btn btn-login']")).click();
	}
	}


