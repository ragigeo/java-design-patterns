# Builder Design Pattern
This project explain Builder Design Pattern in Java. The Builder Pattern is a creational design pattern that allows step-by-step construction of complex objects. It is particularly useful when an object has numerous optional fields or when the construction process involves complex logic.

##### Benefits of the Builder Pattern
* Clarity: Construction code is more readable and easier to maintain.
* Flexibility: Allows the addition of optional parameters without altering the class constructor.
* Control: Ensures that the object is always in a valid state by using the builder.

#### Problem with Traditional Constructor Approach
In traditional object creation using constructors, this class has multiple properties, especially with optional parameters like last name (lName), you might end up with several constructor overloads to handle various combinations of required and optional parameters or mark optional parameter as null . 
This makes the code cumbersome and less readable.
* ```public EmployeePojo(int id, String fName, String lName, String gender, int age, double salary) { .... ```

#### Drawbacks of This Approach
* Redundancy: You must pass null or default values for optional parameters even if they are not relevant.
* Readability: It's hard to understand what null or 0 represents just by looking at the constructor call.
* Extensibility: Adding new optional parameters means creating additional constructors, leading to constructor overloading and bloated code.

### How the Builder Pattern Solves This Problem
The Builder Pattern eliminates the need to pass null or default values for unused optional properties by allowing you to construct an object step-by-step using method chaining. This makes the code cleaner, more readable, and easier to maintain.

Here’s how it works:

Only the required fields are passed to the builder during its initialization.
Optional fields can be set using dedicated methods that are self-explanatory.
If an optional field is not set, it automatically takes a default value or remains unset.
Like
* ``` EmployeePojo objeFromBuildePattern = 	new EmployeePojo.Builder().id(1).fName("george").salary(23.56).build();```  <br />
 Here I only want to create a employee objcet with Id, FirstName and Salary rest I omitted. 
 
 
#### Advantages:
You don’t need to pass irrelevant or unused fields like null or 0.
Each method explicitly indicates what field it sets, improving readability.
The builder enforces a clean separation between mandatory and optional fields.

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