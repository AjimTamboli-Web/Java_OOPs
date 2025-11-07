package java_OOPs.polymorphism_types;
/*
 * DMD is the process of resolving which overridden method to call at runtime, not compile time.
 * When a parent class reference is used to refer to a child class object, and both have the same method, Java
     decides which version to call during execution, not compilation.
 * Even though the reference of type Parent, the Child's method is executed because the object type decides at runtime.
 * When an overridden method is called through a superclass reference, Java determines which version(superclass/subclasses) 
   of that method is to be executed based upon the type of the object being referred to at the time the call occurs. 
 *  You can not override the final and static method but you can use method hiding for static method.
 *    static is class level use that's why its not use overriding.
 *   
 *   Method Hiding ->> It happens only Static methods when you create same name method in child class that time
                                parent class method got hidden.
                         Because static work on classes directly .
 *** At compile time it shows it run parent class method but actual runtime it runs child's class methods using polymorphic object(parent reference child's object) 
       that's called dynamic method dispatch.
 */
public class Dynamic_Method_Dispatch {

	public static void main(String[] args) {
		
		Parent1 para = new Child1(); // Parent reference, Child Object
		
	// Even though the reference type is parent, the method of the actual object (Child) will execute.
		// That's Dynamic Method Dispatch - Java dynamically chooses which method version to call.
		
		para.greet1(); // which greet1() runs? Depends on the object (Child)
        para.show();
        
        Parent1.paren();
        Child1.paren();
        
//        para.paren();  //o/p-> parent static because static does'nt work on object it shared all over same.
      // paren() method is hide the parent paren() method.  
        
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
	public static void paren() {
		System.out.println("Static Method from Parent......");
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
     
     public static void paren() {
    	 System.out.println("Static Method from Child......");
     }
}