#### Factory Pattern in Java: Streamlining Object Creation

#### "Learn the Factory Design Pattern in Java with detailed examples and explanations. Understand how to create flexible and scalable code using the Factory Pattern. Ideal for developers looking to improve their object-oriented design skills."
### Category: Creational design pattern

# tag:
  - Abstraction
  - Encapsulation
  - Gang of Four
  - Instantiation
  - Polymorphism
---

## What is Factory Design Pattern

The Factory Design Pattern in Java is a creational pattern that defines an interface for creating an object but allows subclasses to alter the type of objects that will be created. This pattern promotes flexibility and scalability in your codebase.

## Detailed Explanation of Factory Pattern with Real-World Examples

Real-world example

> Imagine a scenario in a Vehicle factory  where different types of vehicle are build using a Factory Design Pattern. The vehicle's `TwoWheelerVehicleFactory` handles the creation process, allowing easy creation of new vehicle types without altering the core vehicle-making process. The `VehicleFactory` can produce various types of vehicle such as Scooter, Bike. Instead of the vehicle factory staff manually selecting building process and following specific process for each type of vehicle, they use the `TwoWheelerVehicleFactory` to handle the process. The company simply requests a vehicle type, and the `TwoWheelerVehicleFactory` determines the appropriate build process  then creates the specific type of vehicle. This setup allows the manufactoring unit to easily add new vehicle types without modifying the core vehicle-making process, promoting flexibility and scalability.

Wikipedia says

> Factory is an object for creating other objects – formally a factory is a function or method that returns objects of a varying prototype or class.


