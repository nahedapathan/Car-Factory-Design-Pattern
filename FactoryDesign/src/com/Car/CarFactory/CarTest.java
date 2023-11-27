package com.Car.CarFactory;

import java.util.Scanner;

public class CarTest {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the car");
			String type=sc.next();
			Car c=CarFactory.getCar(type);
			c.eightSeater();
			c.offroad();
			c.touchDisplay();
		

	}

}
