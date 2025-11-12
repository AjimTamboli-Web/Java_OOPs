package java_OOPs.Abstractions;
/*
 * An Anonymous Class in Java is a class without a name, that is declared and instantiated at the same time.
 * It is a shortcut way to create a subclass or implement an interface without separately declaring a new class.
 * You use it when you need a temporary class with custom behavior, but you don’t want to create a separate .java file.
 * Anonymous Class Introduced Java 1.1 version its work with Any class/interface.
 * Why? -> ✅ To reduce boilerplate (extra class definitions). ✅ When a class is used only once
 *         ✅ When you need to override methods on the fly. ✅ Commonly used in event handling, threads, comparators, etc.
 * You can also create an anonymous subclass from a normal (non-abstract) class.
 * Anonymous functions, also known as lambda expressions.It introduced in Java 8 as a way to provide more concise and readable code. 
 * semicolon is required to end the line of code that creates the object
 */
public class Anonymous_class {

	public static void main(String[] args) {
		//1. Anonymous Class from Concrete Class
       // ✅ Anonymous subclass overrides open() and close() without needing a named subclass.
		Shop shop = new Shop() {
			
		      protected void open() {
				System.out.println("Dmart Open 10:00 AM");
			}
			void close() {
				System.out.println("Close at 11:00 PM");
			}
		};   // semicolon is required to end the line of code that creates the object
//		You can also create an anonymous subclass from a normal (non-abstract) class.
		shop.open();
		shop.close();
// *********************************************************	
		//2. Anonymous Class with Constructor Arguments 👇
		 // Can only use parent’s constructors
			Person per = new Person("Tom") {
				public void condition() {
					System.out.println("I'm an anonymous Person!");
				}
			};
//			You can also pass arguments to the parent class constructor 
			per.condition();
		
// *********************************************************			
         //3. Anonymous Class Implementing Interface
		//Anonymous class extending Anon 
		Anon an1 = new Anon() {

			@Override
			public void name() {
				System.out.println("Anonymous Class");
			}
			@Override
			public void amount() {
				System.out.println("One time use class Created on the spot.");	
			}
		};
//		✅ This creates an anonymous implementation of the (Anon) interface — useful for quick actions or callbacks.
		an1.name();
		an1.amount();
		
// *********************************************************
//		Anonymous Class from Abstract Class
		Movies move = new Movies() {

			@Override
			void theater() {
			System.out.println("No need to create a separate (Move) class.");		
			}
		};
//		✅ No need to create a separate (Move) class — we define it right inside main().
		move.theater();
		
// *********************************************************		
	}

}

class Shop{
	void open() {
		System.out.println("Open Monday to Sunday at 10:00AM");
	}
	void close() {
		System.out.println("Second and Fourth Saturday close at 05:00PM");
	}
}

class Person{
	Person(String name){ // Parameterized constructor
		System.out.println("Hello!... " + name);
	}
	void condition() {
		System.out.println("I'm a normal person.");
	}
}

// Anonymous Class from Abstract Class
abstract class Movies{
	abstract void theater();
}

// Anonymous Class Implementing Interface
interface Anon{
	void name();   // abstract and public method
	void amount();
}