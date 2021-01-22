package com.tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement listbtn=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		WebElement Giftbtn=driver.findElement(By.xpath("//span[text()='Find a Gift']"));
		act.moveToElement(listbtn).moveToElement(Giftbtn).click().build().perform();

	}

}
