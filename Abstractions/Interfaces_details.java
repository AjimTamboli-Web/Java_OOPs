package java_OOPs.Abstractions;

/*
 * Interface is a blueprint of a class that defines what a class must do —  but not how it does it.
  		👉 Interface tells what to do (method names),
		👉 Classes tell how to do it (method body).
 * Why Interface? ✅	100% abstraction (till Java 7), ✅Multiple inheritance, ✅Loose coupling (low dependency between classes)
                  ✅Standardization — every class follows the same method structure.
 * A class that implements an interface must implement all the methods of the interface.All members of an interface are public, static, and final by default.
 * Prior to Java 8, interfaces could only have abstract methods (no bodies). 
    Since Java 8, they can also include default and static methods (with implementation), and since Java 9, private methods are allowed.
 * 			⭕ Private methods can only be called inside default or static methods.
			⭕ Static methods are accessed using the interface name, not via objects.
			⭕ To implement an interface, use the implements keyword.
* If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.
* 			
 */

public class Interfaces_details {

	public static void main(String[] args) {

		Icalculator cal = new Calsy();
		cal.add(12, 3);
		cal.sub(23, 12);
		cal.mul(3, 5);
		cal.div(45, 2);
		System.out.println(Icalculator.i);
		((Calsy)cal).mod(23, 4);  // type casting
		
	}
}
interface Icalculator{  // interface declare
	int i = 10;  		// public, static and final
	void add(int a,int b); // public and abstract
	void sub(int a,int b);
	void mul(int x,int y);
	void div(int x,int y);
}
interface Iadvances{
	void mod(int a,int b);
}
// class implementing interfaces

class Calsy implements Icalculator,Iadvances{  //Multiple Inheritance
	
	// implementing the capability of interface
	@Override
	public void add(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("substraction: " + (a - b));
	}

	@Override
	public void mul(int x, int y) {
		System.out.println("Multiplication: " + (x * y));
	}

	@Override
	public void div(int x, int y) {
		System.out.println("Division: " + (x / y));
	}
	
	void display() {
		System.out.println("This is Calsy for calculation.");
	}

	@Override
	public void mod(int a, int b) {
		System.out.println("Modulas: " + (a % b));
		
	}
	
	
}