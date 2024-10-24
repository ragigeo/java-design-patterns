package com.ragigeo.factory;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
public class VehicleFactoryTest {
	
	  @Test
	  void shouldReturnBikeInstance() {
	    final var vehicle =  new TwoWheelerVehicleFactory().letsGo("Bike");
	    assertTrue(vehicle instanceof Bike);
	  }
	  @Test
	  void shouldReturnCarInstance() {
	    final var vehicle =  new TwoWheelerVehicleFactory().letsGo("Scooter");
	    assertTrue(vehicle instanceof Scooter);
	  }
	  
	  @Test
	  void shouldReturnNullInstance() {
	    final var vehicle =  new TwoWheelerVehicleFactory().letsGo("none");
	    assertNull(vehicle);
	  }
	  
	  @Test
	  void shouldExecuteWithoutExceptions() {
	    assertDoesNotThrow(() -> App.main(new String[]{}));
	  }

}
