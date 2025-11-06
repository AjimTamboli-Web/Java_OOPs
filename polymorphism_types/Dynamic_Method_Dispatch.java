package java_OOPs.polymorphism_types;
/*
 * DMD is the process of resolving which overridden method to call at runtime, not compile time.
 * When a parent class reference is used to refer to a child class object, and both have the same method, Java
     decides which version to call during execution, not compilation.
 * Even though the reference of type Parent, the Child's method is executed because the object type decides at runtime.
 * When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses) 
   of that method is to be executed based upon the type of the object being referred to at the time the call occurs. 
 *   
 *   Method Hiding ->> 
 *   
 */
public class Dynamic_Method_Dispatch {

	public static void main(String[] args) {
		
		Parent1 para = new Child1(); // Parent reference, Child Object
		
	// Even though the reference type is parent, the method of the actual object (Child) will execute.
		// That's Dynamic Method Dispatch - Java dynamically chooses which method version to call.
		
		para.greet1(); // which greet1() runs? Depends on the object (Child)
        para.show();
	}

}

class Parent1{
	String name = "Parent";
	
      void greet1() {
		System.out.println("Hello From Parent.");
	}
	
	void show() {
		System.out.println("This is show Method from Parent Class.");
	}
	
	Parent1(){
		System.out.println("Parent Object/Constructor.");
	}
}

class Child1 extends Parent1{
     void greet1() {
    	    // here by default child firstly created parent object and then create child object for greet1 method
   
    	 // super.Parent1   -object created or call constructor
		System.out.println("Hello From Child.");
	}
     Child1(){
    	 
    	 System.out.println("Child Object/Constructor.");
     }
}