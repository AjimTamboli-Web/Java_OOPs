package java_OOPs.Abstractions;
/*
 * Since Java 8, it can have default and static methods also.
 *⏺️ Default - methods provide implementation inside the interface,Useful for adding new methods to interfaces without breaking existing implementations.
  ⏺️ Static - while static methods belong to the interface itself,and are not inherited by implementing classes.
       THis is called Backward compatibility in java
 * Java 9 introduced private methods in interfaces, which help in code reuse within the interface.
 *⏺️ Private - Private methods are defined within the interface but it cannot be accessed by the implementing classes.
               Private methods cannot be overridden by implementing classes as they are not inherited.
 *  Interfaces avoid the diamond problem since they don’t carry state (only method declarations).
 *              
 */


interface IRemote{
	int button = 10;  // Interface variables are public static final — constants only.
	
	void on();   // public and abstract method
	void off(); // public and abstract method
	
	//Private method for internal use
	private void sliding() {     // Private  method
		System.out.println("Slide Button feature");
	}
	
	// public and default method
	// default is special kind of method not access modifier
	default public void autoSlide() {  // Needs a method body compulsory
		sliding();  // using private method here
	}
	
	// public and static method
	static void companyName() {
		System.out.println("Panasonic Remote");
	}
	
}
class Tv implements IRemote{  // no mention default method (no compulsion)

	Tv(){
		IRemote.companyName(); //static method cannot be overridden
	}
	
	@Override
	public void on() {
		System.out.println("Tv Power On");
		
	}

	@Override
	public void off() {
		System.out.println("Tv Power Off");
		
	}
	
}

class Ac implements IRemote{

	Ac(){ 
		IRemote.companyName();   // get static method in constructor of Ac class
	} 
	
	@Override
	public void on() {
		System.out.println("AC power on");
		
	}

	@Override
	public void off() {
		System.out.println("Ac power off");
	}

	@Override
	public void autoSlide() {     // default method
		System.out.println("Ac auto slide On/Off");
		
	}
	
}

public class AfterJava8_Version {

	public static void main(String[] args) {
		
		IRemote tv = new Tv();
		tv.on();
		tv.off();
		IRemote ac = new Ac();
		ac.on();
		ac.autoSlide();
		ac.off();
	}

}