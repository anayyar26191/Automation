package com.tesNG;

import org.testng.annotations.Test;

public class Practice3 {
	@Test(dependsOnMethods= {"stopAtLights"})
	public void opencarDoor() {
		System.out.println("Door open");
	}
	@Test(dependsOnMethods= {"speedUP"})
	public void startCar() {
	
			System.out.println("Car Started");
		}
	@Test(dependsOnMethods= {"parkedatParking"})
	public void speedUP() {
		
		System.out.println("Car Speed 40KM");
	}
	@Test(dependsOnMethods= {"startCar"})
	public void stopAtLights() {
		
		System.out.println("Car stopped");
	}
	@Test
	public void parkedatParking() {
		
		System.out.println("Car Parked");
	}
	}

