package java_OOPs.polymorphism_types;

/*
 * RunTime Polymorphism -> It is implemented through Method overriding, also known as Dynamic Method Dispatch.
 *  It is a process in which a function call to the overridden method is resolve at runtime. 
 *  Occurs when a subclass provides its own version of a method that already exist in the parent class.
 * The method that runs is decided at runtime based on the object type, not the reference type.
 * Rules ->> Method name and parameters must be identical, Must be in subclass, Access modifier cannot be more restrictive,
 *           Only non-static methods can be overridden, Use @override annotation to ensure correctness.
 * super() -> child constructor call parent constructor by default. 
 * It follows Is-A relation Parent to Child  
 * Overriding always happens child class.   and JVM consider and accept only signature type.
 * JVM Override identify the only method signature not return type(primitive) or access modifier 
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
        
		Subclass sub = new Subclass();
		sub.uniq();
	}

}

class Parent{
	 Parent() {
			System.out.println(" this is constructor form Parent");
		}
	public void greet() {
		System.out.println("Hello from Parent.");
	}
}

//  Subclass Is-A Parent
class Subclass extends Parent{
	
	Subclass() {
		super(); // it present by default to call constructor of parent class
		System.out.println(" this is sub  constructor");
	}
	
	public void greet() {       // Overriding always happens in child class
		
		System.out.println("Hello from Subclass.");
	}
	
	public void uniq() {
		System.out.println("this method is only present in Subclass.");
	}
}

// Child Is-A Parent
 class Child extends Parent{
//	 Child() {
//	        super();  // this will create automatically  / inverse call 
//			System.out.println(" this is child constructor");
//		}

	 public void greet() {       // Overriding always happens in child class
		 super.greet();   // Call Parent Version
		 System.out.println("Hello from Child");
	 }
 }
 








