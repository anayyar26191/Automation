package com.tutorials;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		button.click();
		Alert alert= driver.switchTo().alert();	
		alert.dismiss();
		WebElement confirmbutton=driver.findElement(By.cssSelector("span.text-success"));
		String al=confirmbutton.getText();
		System.out.println(al);
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
	}

}
