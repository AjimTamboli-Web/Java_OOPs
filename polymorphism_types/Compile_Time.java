package java_OOPs.polymorphism_types;

/*
 *  Compile-Time Polymorphism ->It is implemented through Method overloading and Operator overloading. 
 *   Compile-time polymorphism is also known as static polymorphism or early binding.
 *   Compile-time polymorphism is a polymorphism that is resolved during the compilation process.
 *   Overloading of methods is called through the reference variable of a class. 
 *   Compile-time polymorphism is achieved by method overloading and operator overloading.
 *  We can have one or more methods with the same name that are solely distinguishable by argument numbers, type, or order.
 *  Java decide which method call at compile time, based on the arguments.
 *  It binds the correct method before running the program. ➡️ Hence called Static Binding.
 *  In compile-time you can also use static methods and final methods in overloading.
 *  In overloading when someone change another method's return type or access modifier change still it consider the same method.
 */

public class Compile_Time {

	public static void main(String[] args) {
		
	 	Mathema math = new Mathema();
	 	math.multi(34,5);
        math.multi(45, 45.4);
        math.multi(3.4,5);
        math.multi(2.6, 3.4);
      
        //Static method
        Mathema.div(23, 4);
        Mathema.div(12, 4l);
       
        //Final method
        math.add(12, 32);
        math.add(12, 32.9f);
        math.add(12.9, 12.3);
        
        math.add("Previous Operarator + addition, ", " Current Operator + Concatination");
	}

}

class Mathema{
	public void multi(int a,int b) {
		System.out.println( "Method 1 : " + a * b);
	}
	public void multi(double a, double b) {
		System.out.println( "Method 2 : " + a * b);
	}
	public void multi(int a, double b) {
		System.out.println( "Method 3 : " + a * b);
	}
	public void multi(double a, int b) {
		System.out.println( "Method 4 : " + a * b);
	}
	
	// it does not overload the primitive using it get error it happen only signature method using
//	public int multi(double a, int b) {
//		System.out.println("mehtod 5 " + a * b);
//		return 23;
//	}
	
	// In Compile time polymorphism Static method can be overloaded.
	public static void div(int a,int b) {
		System.out.println("Static Method 1 : " + a / b);
	}
	public static void div(int a,long b) {
		System.out.println("Static Method 2 : " + a / b);
	}
	
	// In Compile time polymorphism Final method can be overloaded.
	final void add(int a, int b) {
		System.out.println("Final Mathod1 : " + (a + b));
	}
	final void add(int a,float b) {
		System.out.println("Final Method2 : " + (a + b));
	}
	final void add(double a, double b) {
		System.out.println("Final Method3 : " + (a + b));
	}
	void add(String a,String b) {
		System.out.println("Operator Overloading: " + a + b);
	}
}

