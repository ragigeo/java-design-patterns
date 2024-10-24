package com.ragigeo.factory;

public class TwoWheelerVehicleFactory  {
	
	//https://www.baeldung.com/java-factory-pattern

	
	public TwoWheelerVehicle letsGo(String vehicleType) {
		TwoWheelerVehicle vehicle;
		
		if(vehicleType.equalsIgnoreCase("Bike")) {
			vehicle = new Bike();
			vehicle.start();
			return vehicle;
		}else if(vehicleType.equalsIgnoreCase("Scooter")) {
			vehicle = new Scooter();
			vehicle.start();
			return vehicle;
		}else {
			System.out.println("Please walk.... no vehicle");
			return null;
		}
		
	}

}
