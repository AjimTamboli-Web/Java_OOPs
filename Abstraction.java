package java_OOPs;

/*
 * Abstraction => Abstraction means hiding the implementation details and showing only the essential features of an objects.
 * show only what is necessary, hide how it works.  ** abstract class using abstract keyword.
 * It allows to focus on what an object does rather than how it does it. The unnecessary details are not displayed to the user.
 * They provide a blueprint for other teams to follow, and some methods remain undefined. 
 *  Rules ->  You cannot create an object of abstract class ❌new Bank(); not allowed.
 *            It can have abstract and non-abstract methods,☑️both allowed.
 *            Subclass must implement all abstract methods.unless subclass is also abstract.
 *            Abstract can have Constructors,variables,static methods.✔️
 *            It can be extended only once(no multiple inheritance) ⚠️ limitation
 *            
 * Java provides two ways to implement abstraction, which are listed below:
					 ⏺️ Abstract Classes (Partial Abstraction 0 to 100%) Incomplete class
					 ⏺️ Interface (100% Abstraction) before java 8   
 * 							   
 */

public class Abstraction {

	public static void main(String[] args) {
 
		Bank sbi = new SBI();  // Parent reference (Abstraction)
		sbi.name();
		sbi.pay();
		sbi.holiday();       // common behavior
		sbi.time();         // Interface
		Bank ici = new ICICI();
		ici.name();
		ici.pay();
		ici.holiday();
		ici.time();       // Interface
		
     // we don't know what's bank name internally we just call the abstract method, and it behave accordingly. 
	}

}

abstract class Bank implements RBI{ //(incomplete class)
	Bank(){  // it is used to inherit classes
		System.out.println("Abstract constructor.....");
	}
	abstract void name();   // no body ➡️ must be overridden
	abstract int pay();       // abstract method
	
	public void holiday() {  // concrete method / normal method
		System.out.println("Second and Fourth saturday is bank closed.");
	}
	 
}

class SBI extends Bank{
	void name() { // implementation of abstract method
		System.out.println("State Bank of India");
	}
	int pay() {  // implementation of abstract method
	    System.out.println("Amount Payble in sbi");
		return 12_564_65;
	}
	public void time() {
		System.out.println("Time 10:00 to 05:00");
	}
}
class ICICI extends Bank{
	void name() {
		System.out.println("ICICI Bank");
	}
	int pay() {
		System.out.println("Amount Payble in icici");
		return 234_4545_46;
	}
	public void time() {
		System.out.println("Time 09:00 to 06:00");
	}
}
interface RBI{
	void time();  // abstract method (by default public & abstract)
}
