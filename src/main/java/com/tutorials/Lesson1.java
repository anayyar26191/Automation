package com.tutorials;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lesson1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.getCurrentUrl();
	

		Actions act= new Actions(driver);
		WebElement userId=driver.findElement(By.name("txtUsername"));
		WebElement password= driver.findElement(By.cssSelector("input#txtPassword"));
		WebElement login= driver.findElement(By.cssSelector("input#btnLogin"));
		act.sendKeys(userId, "admin").sendKeys(password,"admin123").click(login).build().perform();
	
;	}

}
