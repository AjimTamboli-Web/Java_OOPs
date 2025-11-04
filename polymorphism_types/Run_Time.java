package java_OOPs.polymorphism_types;

/*
 * RunTime Polymorphism -> It is implemented through Method overriding, also known as Dynamic Method Dispatch.
 *  It is a process in which a function call to the overridden method is resolve at runtime. 
 *  Occurs when a subclass provides its own version of a method that already exist in the parent class.
 * The method that runs is decided at runtime based on the object type, not the reference type.
 * Rules ->> Method name and parameters must be identical, Must be in subclass, Access modifier cannot be more restrictive,
 *           Only non-static methods can be overridden, Use @override annotation to ensure correctness.
 *           
 */

public class Run_Time {

	public static void main(String[] args) {
		
		Parent par = new Parent();
		par.greet();
		System.out.println("*************");
		par = new Subclass();
		par.greet();
		System.out.println("*************");
		par = new Child();
		par.greet();

	}

}

class Parent{
	public void greet() {
		System.out.println("Hello from Parent.");
	}
}

class Subclass extends Parent{
	public void greet() {
		
		System.out.println("Hello from Subclass.");
	}
}

 class Child extends Parent{
	 public void greet() {
		 super.greet();   // Call Parent Version
		 System.out.println("Hello from Child");
	 }
 }








