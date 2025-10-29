package java_OOPs;

/*
 * Inheritance ->It means acquiring properties(variables) and behaviors(methods) of one class into another class.
 *    It allows one class to use the fields and methods of another class without rewriting the same code again.
 *    It promotes code reusability and method overriding.
 *    The keyword (extends) is used to inherit from a parent class.
 *     
 */

public class Inheritance {

	public static void main(String[] args) {
		
		Dog bob = new Dog();
		bob.bark();  // Dog's own method
		bob.eat();   // inherited from Animal
		bob.run();   // inherited from Animal
	}

}

// Single level inheritance

class Animal{     // Parent claa/ Super class/ Base class
	
	public void run() {
		System.out.println("Running fast......");
	}
	public void eat() {
		System.out.println("Eating......");
	}
	public void hunting() {
		System.out.println("Hunting......");
	}	
}

class Dog extends Animal {    // Child class/ Subclass
	public void bark() {
		System.out.println("bow bow...");
	}
}
