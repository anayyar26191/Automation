package com.tesNG;

import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class Sample2Test {
	//Execute Alphabetically and @Test method will always execute without annotation not execution
	@Test(priority=3)
	public void apple() {
		System.out.println("apple");
	}
	@Test(priority=4)
	public void orange() {
		System.out.println("orange");
	}
	@Test(priority=2)
	public void carrot() {
		System.out.println("carrot");
	}
	@Test(priority=1)
	public void watermelon() {
		System.out.println("watermelon");
	}
}
