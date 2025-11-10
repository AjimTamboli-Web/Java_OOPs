package java_OOPs.Abstractions;

public class Abstraction_details {

	public static void main(String[] args) {
		
		Vehicle v1 = new Bike();
		v1.start();
		v1.stop();
		Vehicle v2 = new Truck();
		v2.start();
		v2.stop();
        v2.insurence();  // common behavior
	}

}

abstract class Vehicle{
	abstract void start();
	abstract void stop();
	void insurence() {    //concrete method
		 System.out.println("Get a Insurence");
	 }
}

class Bike extends Vehicle{
	Bike(){
		System.out.println("********** BIKE ***********");
	}
	 void start() { // implemented of abstract method
		System.out.println("Bike starts with a kick");
	}
	 void stop() {  // implemented of abstract method
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