package com.tesNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample4Test {
@BeforeTest
public void one() {
	System.out.println("Hello Everyone ");
}
@BeforeSuite
public void two() {
	System.out.println("Test two");	
}
@Test
public void third() {
	System.out.println("Test three");	
}

@AfterSuite
public void fourth() {
	System.out.println("Test four");	
}

@AfterTest
public void five() {
	System.out.println("Test five");	
}

}
