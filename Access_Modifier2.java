package java_OOPs;
import java_plane.Access_Subclass;  // Access From different Package

/*  In Java, access modifiers are essential tools that define how the members of a class, like variables,
      methods, and even the class itself, can be accessed from other parts of our program.
 
 * Default- package access modifiers called
 
 * Private  ****=> The methods or data members declared as private are accessible only within the class in which they are declared.
 * Default   ***=> When no access modifier is specified for a class,method,data member, it is said to have the default 
 *                   access modifier by default. This means only classes within the same package can access it.
 * Protected  **=> The methods or data members declared as protected are accessible within the same package or subclasses in different packages.(using inheritance)
 * public      *=> Public members are accessible from everywhere in the program.There is no restriction on the scope of public data members.
 
 ** How to react in Overriding   
 * You can change the access modifier in the child class provided that it is same or less secure than parent class
 */

public class Access_Modifier2 extends Access_Subclass{

	public static void main(String[] args) {
		
		Sub2 sub = new Sub2();
		//System.out.println(sub.w);   ❌Private - not accessible
		//System.out.println(sub.x); //❌default - different package
		//System.out.println(sub.y); //❌protected- Not subclass reference
		  System.out.println(sub.z); //☑️public - everywhere
		  
//		    sub.showPrivate();
//		    sub.showDefault();     
//		    sub.showProtected();     (not by creating parent object)
		    sub.showPublic();
		 
		// ✅ Accessible through inheritance
		  Access_Modifier2 ac = new Access_Modifier2(); 		 
		  System.out.println(ac.y); // // ✅ protected via subclass
//          ac.showPrivate();
//		    ac.showDefault();
		    ac.showProtected();   // Accessible only through inheritance
            ac.showPublic();
	}

}

class Sub2 extends Access_Subclass{

	private void disp() {              //here you cannot override this method because it's private
		                                   // access only same class
		System.out.println("Private disp....");
	}
	void display(int a) {   // default
		System.out.println("Default display.." + a);
	}
	public void method() {
		System.out.println("Public Method....");
	}
}

class Sub3 extends Sub2{
	protected void disp() {   //different method
		System.out.println("Protected disp...");
	}
	protected void display(int a) {
		System.out.println("Protected display..." + a);
	}
//	void method() {         // visibility error
//		System.out.println("Default Method.....");
//	}
}

class Sub4 extends Sub3{
	public void display(int a) {
		System.out.println("Public display...." + a);
	}
	
//	void disp() {  //error = cannot reduce the visibility
//		System.out.println("Default disp.....");
//	}
	
}



