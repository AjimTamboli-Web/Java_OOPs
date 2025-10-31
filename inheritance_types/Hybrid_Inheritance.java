package java_OOPs.inheritance_types;

/*
 * Hybrid Inheritance -> It is a mix of two or more of the above types of inheritance. 
 * we can achieve hybrid inheritance only through Interfaces if we want to involve multiple inheritance to implement Hybrid inheritance.
  
 *  Java does NOT support hybrid inheritance with classes directly because it leads to the “Diamond Problem” 
    (ambiguity when two parent classes have the same method).
   
 * Java allows hybrid inheritance using interfaces (because interfaces support multiple inheritance safely).   
 */

public class Hybrid_Inheritance {

	public static void main(String[] args) {
	
		B b = new B();
		b.show();
		
        C c = new C();
        c.show();
        
        A a = new A();
        a.show();
	}

}
class A {
    void show() {
        System.out.println("Class A method");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B method");
    }
}

class C extends A {
    void show() {
        System.out.println("Class C method");
    }
}

 // ❌ Not allowed in Java:
 //class D extends B, C {
//	  void show() {
//		  System.out.println("Class D methods");
//	  }
 //}   // Compilation Error
// You cannot use extends B, C in Java — multiple inheritance not supported for classes.