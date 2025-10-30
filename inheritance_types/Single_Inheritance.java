package java_OOPs.inheritance_types;

/*
 * Single Inheritance -> A sub-class is derived from only one super class.  
 *  It inherits the properties and behavior of a single-parent class. Sometimes, it is also known as simple inheritance.
 *  
 */

public class Single_Inheritance {

	public static void main(String[] args) {
	
	// creating object of subclass invokes base class constructor.
		
		Car obj = new Car();

	}

}

// Super class
class Vehicle{
	public Vehicle() {
		
		System.out.println("This is Vehicle.....");
	}
}

// Sub class
class Car extends Vehicle{
	
	public Car() {
		System.out.println("This vehicle is car.");
	}
}