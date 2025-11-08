package java_OOPs.inheritance_types;

/*
 * Hierarchical Inheritance ->  more than one subclass is inherited from a single base class.
 *                             i.e. more than one derived class is created from a single base class.
 *                             One parent → multiple children.
 */

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		IronMan tony = new IronMan();
		System.out.println(tony);
		Captain steve = new Captain();
		System.out.println(steve);
	}

}

class Marvel{
	Marvel(){
		System.out.println("This is Marvel Comic Universe Character.........");
	}
}

class IronMan extends Marvel{
	IronMan(){
		System.out.println("I am Iron Man...");
	}
}

class Captain extends Marvel{
	Captain(){
		System.out.println("I can do this all day......");
	}
}

class BlackPanther extends Marvel{
	BlackPanther(){
		System.out.println("Wakanda Forever!....");
	}
}