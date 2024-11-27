# Builder Design Pattern
This project explain Builder Design Pattern in Java. The Builder Pattern is a creational design pattern that allows step-by-step construction of complex objects. It is particularly useful when an object has numerous optional fields or when the construction process involves complex logic.

##### Benefits of the Builder Pattern
> Clarity: Construction code is more readable and easier to maintain.
> Flexibility: Allows the addition of optional parameters without altering the class constructor.
> Control: Ensures that the object is always in a valid state by using the builder.

##### Screenshot of the Full code 
Builder Pattern in Action

 ```   
public class EmployeePojo {

	private int id;
	private String fName;
	private String lName;
	private String gender;
	private int age;
	private double salary;
	
	public void printMsg() {
		System.out.println("This is print message from EmployeePojo class");
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


}

```