package java_OOPs.polymorphism_types;
/*
 * A Polymorphic Object is an object that can take many forms —
       meaning it can be referenced by different types of variables (usually parent class or interface types).
 * When parent class reference points to a child class object,that child object is called polymorphic object.      
    it gives the access those who both in common properties or behavior.
 *  JVM looks at the object, not the reference, It calls the overridden method from Aot.This is runtime polymorphism
             and the object involved is a polymorphic object.
 *  You can't change the return type of the method in method overriding if it's primitive or void.
 *  in non primitive you can change the return type provided that the next return type are the children of the first return type.
 *   
 *   Why use? -> Flexibility(one reference can point to many object types), Extensibility(add new classes without
                 changing base logic), Clean code(Reduce code duplication), Runtime Decision(which method runs is decided dynamically)
 * Cannot call child-specific methods directly, you can only access methods available in the reference type.
 * Use casting to access child-specific features -> ((Aot)ente).uniq(); 
 * Since variables are not overridden, so the statement "ente.john" will always refer to data member of super class.              
 
 */

public class Polymorphic_Object {

	public static void main(String[] args) {
		
		Got ente = new Aot(); // parent reference,child object
//        ente.gots();  
		ente.show();
//		ente.watch(); //o/p -> denaryes  because it's static method it should access in static way(direct call using class name) it can't override
		                 //  or call in child, child have own static method to run particular range in class 
	  
	  ente.role().tar();
//	  ente.uniq(); // Not possible because ente show only common methods.
	  ((Aot)ente).uniq();  // using casting it's possible (Allowed after type casting)
	  
	  
	  System.out.println(ente.john);  // Variable not overridden because it always refer to the data member of super class.
	}

}

class Got{
	String john = "Snow";
	public void gots() {
		System.out.println("THis is game of thrones universe.");
	}
	
	public void show() {
		System.out.println("These are best show......");
	}
	
	public static void watch() {
		System.out.println("Denaryes Targaryen");
	}
	
	public Aegon role() {
		return new Aegon();
	}
}

class Aot extends Got{
	String john = "Targaryen";
	public void aots() {
		System.out.println("This is Attack on titan universe..");
	}
	public void show() {
		System.out.println("This is best anime....");
	}
	public static void watch() {
		System.out.println("Eron Eager.");
	}
	
	public Dany role(){  // method can change using return type because it's not primitive or void 
		return new Dany();        //       it's parent have Dany's parent access in Aot's parent
	}
	
	public void uniq() {
		System.out.println("Only present in Aot Class.");
	}
}



// It use to return type in method overriding in Aot's class
class Aegon{
	public void tar() {
		System.out.println("Aegon the conquerer..");
	}
}
class Aemond extends Aegon{
	public void tar() {
		System.out.println("Aemond Targaryen.");
	}
}
class Dany extends Aemond{
	public void tar() {
		System.out.println("Denaryes Targaryen.");
	}
}