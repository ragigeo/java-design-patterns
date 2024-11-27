package com.george.designfactory.builder;

import java.util.Objects;

public class EmployeePojo {

	private int id;
	private String fName;
	private String lName;
	private String gender;
	private int age;
	private double salary;
	
	public void printMsg() {
		System.out.println("This is print mesage from EmployeePojo class");
	}

	//Even though few prop is not required to create a object of this class we need to pass at least null. 
	// To void it we can use builder pattern 
	public EmployeePojo(int id, String fName, String lName, String gender, int age, double salary) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}
	
	public EmployeePojo(Builder builder) {
		this.id = builder.id;
		this.fName = builder.fName;
		this.lName = builder.lName;
		this.gender = builder.gender;
		this.age = builder.age;
		this.salary = builder.salary;
	}

	public static class Builder {
		public int id;
		private String fName;
		private String lName;
		private String gender;
		private int age;
		private double salary;

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder fName(String fName) {
			this.fName = fName;
			return this;
		}

		public Builder lName(String lName) {
			this.lName = lName;
			return this;
		}

		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeePojo build() {
			return new EmployeePojo(this);
		}

	}

	public int getId() {
		return id;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePojo other = (EmployeePojo) obj;
		return id == other.id;
	}

}
