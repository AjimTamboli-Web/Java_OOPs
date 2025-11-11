package java_OOPs.Abstractions;
/*
 * Abstraction => 4th pillar of oops in java - it hides the complexity from the user as well as other parts of the program
 *                            In the abstraction you only concern about what instead of how.
 * Using abstract keyword you initialized abstract class or method. (its fixed the behavior) add functionality
 * A method ends with the semicolon or incomplete method that is called abstract method.it does not have object,but constructors are allowed.
 * THe method is need for overridden,and it set the compulsion.In abstract class not compulsion to have all abstract methods.  
 * It may have both abstract and non-abstract methods(methods with bodies).
 * only abstract method can be declare in abstract method.
 * Private abstract method are not possible in class,only default,protected and public.
 * We can define static methods in an abstract class.
 * If a subclass does not implement all abstract methods of an abstract class, it must be declared abstract 
 *                                                            itself, otherwise, a compile-time error occurs.
 *                                                            
 * Why? => Security - hides internal code logic, Flexibility, Maintainability, Polymorphism support - work with dynamic method dispatch
 *         cleaner design - separates what to do from how to do. 
 */

abstract class Vehicle{
	private int wheels;  // it can be accept private variable only
	
	abstract void start();    // incomplete method
	abstract void stop();
	
	void insurence() {              //concrete method
		 System.out.println("Get a Insurence");
	 }
	static void greet() {
		System.out.println("This vehicle is ");
	}
	public void setWheel(int w) {
		this.wheels = w;
	}
	public int getWheel() {
		return this.wheels;
	}
      final protected static void license() {
    	  System.out.println("License is compulsary to drive.");
      }
}

class Bike extends Vehicle{
	Bike(){           // default constructor for overridden child class
		System.out.println("********** BIKE ***********");
	}
	 void start() { 		// implemented of abstract method
		System.out.println("Bike starts with a kick");
	}
	 void stop() {  		// implemented of abstract method
		System.out.println("Bike stop manually ");
	}
	
}

class Truck extends Vehicle{
	Truck(){
		System.out.println("********* TRUCK **********");
	}
	void start() {
		System.out.println("Truck starts with a key");
	}
	void stop() {
		System.out.println("Truck stops with brakes");
	}
}

public class Abstraction_details {

	public static void main(String[] args) {
		
		Vehicle v1 = new Bike();
		v1.start();
		v1.stop();
		v1.setWheel(2);
		System.out.println("Bike can be number of wheel is " + v1.getWheel());
		
		Vehicle v2 = new Truck();
		Vehicle.greet();  // static method
		v2.start();
		v2.stop();
        v2.insurence();    // common behavior
        Vehicle.license();  // final protected static method
	}

}

