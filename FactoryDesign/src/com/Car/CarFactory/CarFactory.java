package com.Car.CarFactory;

public class CarFactory {
	public static Car getCar(String type)
	{
		if(type.equalsIgnoreCase("Innova"))
		{
			return new Innova();
		}
		else if(type.equalsIgnoreCase("Thar"))
		{
			return new Thar();
		}
		else
		{
			System.out.println("this car is not available");
			return null;
		}
	}

}
