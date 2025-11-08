package java_OOPs.polymorphism_types;
/*
 * super keyword is a reference variable that is used to refer to the immediate parent class object.
 * Whenever you create a subclass(child class),it automatically has a reference to its parent class — and that reference is super.
 * super.variable -> Access parent class variable when it is hidden by subclass variable.
 * super.method -> call parent class method when it is overridden by subclass method.
 * super()    ->  Call parent class constructor from subclass constructor, and must be first statement in a subclass constructor.
 * You cannot use super in static methods, because super is related to objects, not the class itself.
 * 
 * Why we need??? =>> To Avoid Confusion Between Parent and Child Variables,Methods(when overridden),
                       Constructor(initialize parent part). To Improve Code Reusability and Maintenance
 *                    
 */
public class Super_keyword {

	public static void main(String[] args) {
		
		Childe child = new Childe();
		child.relation(); // class child
  System.out.println("*********************************************************************");      
		Greatpa pa = new Childe();   // Object called -> Polymorphic object/ Subtype Polymorphism
		pa.relation(); // class Greatpa   // only show common methods
  // ⬆️⬆️⬆️⬆️⬆️⬆️⬆️⬆️⬆️ That whole process called Dynamic method Dispatch 	⬆️⬆️⬆️⬆️⬆️⬆️⬆️⬆️⬆️
 // Even though the reference type is parent,the method of the actual object(Child) will execute,↙️⬇️
//➡️ That's Dynamic Method Dispatch - Java dynamically chooses which method version to call.	
  System.out.println("*********************************************************************");		
		((Childe)pa).car(); // Type Casting  -> Parent reference but child's method execution
  System.out.println("*********************************************************************");		
		child.stay();
		
	}

}

class Greatpa{  // when no one extends parent class by default it extends Object class
	
	void relation() {
		System.out.println("This is Great Grandfather class.....");
	}	
	
	void walk() {
		System.out.println("Walking.... 🚶");
	}
}
class Grandpa extends Greatpa{
	String home = "Flat";
	Grandpa(){
		System.out.println("Grandpa Constructor....");
	}
	Grandpa(int a){
		System.out.println("Value you Entered: " + a);
	}
	void relation() {
		System.out.println("This is Grandfather class... ");
	}
	 
	void cycle() {
		System.out.println("Cycling....... 🚲");
	}
}
class Father extends Grandpa{
	String home = "Banglow";
	Father(){
		super(23); // call parent constructor / Must be first statement in subclass.
		System.out.println("Father Constructor....");
		// super();  you can't write here constructor it will give you error must be in first line
	}
	void relation() {
		System.out.println("This is Father class....");
	}
	void bike() {
		System.out.println("Biker....... 🏍️");
	}
}
class Childe extends Father{
	String home = "Mansion";
	void relation() {
		super.relation();  // call parent class method when it is overridden by child relation() method
		System.out.println("This is child class.......");
	}
	void car() {
		super.bike();  // when you want method call from another class
		System.out.println("Road King.... 🚗");
	}
	void stay() {  // access parent class variable using super when its hidden by subclass variable
		System.out.println("You can stay at " + new Grandpa().home);
		System.out.println("You can stay at " + super.home);
		System.out.println("child stay right now " + home);
	}
}