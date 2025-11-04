package java_OOPs;

/*
 * Polymorphism -> (Many forms) and it occurs when we have many classes that are related to each other by inheritance.
 * Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods
                                                                to perform a single action in different ways.   
 * In short a same thing can perform/ can have different implementation.
 *  - The ability of an object, method or operator to take on different behaviors based on context.
 *  Why use? -> Code Reusability, Flexibility, Abstraction, Dynamic Behavior.
 
 *  Types of Polymorphism :-
 *  1) Compile-time/ static/ Early binding/ method overloading Polymorphism.
 *  2) Rum-time/ Dynamic/ Late binding/ method overriding Polymorphism.
 */

public class Polymorphisms {

	public static void main(String[] args) {
	
		Book book = new Book();
		book.read();
		book.read("Jeorge");
		book.read(2);

		Book book1 = new Got();
		book1.read();
		
		Book book2 = new HotD();
		book2.read();
	}

}

class Book{
	public void read() {         
		System.out.println("Recommended Books for reading...");
	}
	// Compile time Polymorphism
	public void read(String name) {
		System.out.println("This book written by ..." + name);
	}
	// Compile time Polymorphism
	public void read(int parts) {
		System.out.println("Book of Series - " + parts);
	}
}

class Got extends Book{
	Got(){
		System.out.println("Game of Thrones Based on ...");
	}
	// Run time Polymorphism
	public void read() {
		System.out.println("Song of Ice and Fire Book ");
	}
}

class HotD extends Book{
	HotD(){
		System.out.println("House of the Dragons Based on....");
	}
	// Run time Polymorphism
	public void read() {
		System.out.println("Dance of  Dragons");
	}
}
