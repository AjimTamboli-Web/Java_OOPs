package java_OOPs.Abstractions;
/*
 * Problem -> Two different interface have same method signature(same parameter,same name) but different return type,
 *      when i inherit both interface in one class to override those methods that is a diamond problem.
 * The Diamond Problem happens in multiple inheritance, when two parent classes have a method with the same name,
		     and a child class tries to inherit from both.
 * Java does not allow multiple inheritance with classes (only single inheritance),allowed in only interface.
 * 		     
 */
public class Diamond_Problem {

	public static void main(String[] args) {
	
		Problem pro = new Problem();
		pro.run();
        pro.jump();
	}
                                     //                 pro           when create a object of Problem class
}                                    //               /     \            it confuse which one to call
                                     //              /       \ 
interface I_one{						//            I_one    I_two        same method different return type
//	void run();                     //               \       /   
}                                   //                \     /
interface I_two{                    //                Problem    implements both 
	int run();
}

interface I_three{
	default void jump() {
		System.out.println("Jump from three.");
	}
}
interface I_four{
	default void jump() {
		System.out.println("Jump from four.");
	}
}

class Problem implements I_one,I_two,I_three,I_four{
//	The compiler gets confused about which parent’s method to use, that is diamond problem
	@Override
	public int run() {   // occurred error - Problem class confuse which one is implement run() method
		System.out.println("Override from which one");
		return 0;
	}

// Java lets you use InterfaceName.super.methodName() to call a specific interface’s method.
	// This resolves the ambiguity safely.
@Override
//resolve conflict by overriding
public void jump() {
	// Explicitly call one of them
	I_four.super.jump();      // I_three.super.jump();
     System.out.println("Jump from Problem class.");
}
	
	
}