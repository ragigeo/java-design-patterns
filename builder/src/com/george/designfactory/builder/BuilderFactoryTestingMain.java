package com.george.designfactory.builder;

public class BuilderFactoryTestingMain {
	
	public static void main(String[] args) {
		
		EmployeePojo objeFromBuildePattern = 	new EmployeePojo.Builder().id(1).fName("george").salary(23.56).build();
		objeFromBuildePattern.printMsg();
		
		EmployeePojo objAllConstructor = 	new EmployeePojo(2 , "Tom", null, null, 0, 34.89);
		objAllConstructor.printMsg();
		
	}

}
