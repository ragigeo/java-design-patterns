package com.ragigeo.factory;


import java.util.logging.Logger;


/**
* Factory is an object for creating other objects. It provides a static method to 
* create and return objects of varying classes, in order to hide the implementation logic 
* and makes client code focus on usage rather than objects initialization and management.
*
* <p>In this example an alchemist manufactures coins. CoinFactory is the factory class, and it
* provides a static method to create different types of coins.
*/

public class App {
	
	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

 /**
  * Program main entry point.
  */
 public static void main(String[] args) {
   LOGGER.info("Lets select bike vehicle and go");
   new TwoWheelerVehicleFactory().letsGo("Bike");
   LOGGER.info("Lets select car vehicle and go");
   new TwoWheelerVehicleFactory().letsGo("Scooter");
   
 }
}