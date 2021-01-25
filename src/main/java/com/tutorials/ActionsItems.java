package com.tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsItems {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.suvideals.ooo/Login.action");
		driver.switchTo().frame("GTM-MB6K42");
		WebElement deal=driver.findElement(By.linkText("Deals of the Day"));
		Actions act = new Actions(driver);
		act.moveToElement(deal).click().build().perform();
		Thread.sleep(6000);
		
	}

}
