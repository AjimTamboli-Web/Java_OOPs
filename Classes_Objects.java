package java_OOPs;

/*
 * OOPs -> (Object Oriented Programming System) It means programming using objects and classes.
 *         In OOPs everything is represented as an object that has : Data(Called fields and variables)
 *                                                                   Behavior 
 * Object class -> Object classes is root class of the all classes in java every class has object as a superclass by default.
 *                                                                                 
 */

public class Classes_Objects {

	public static void main(String[] args) {
		
	 User user = new User(); // this new keyword create object
	 System.out.println(user);  // it prints hexa-cade address of store where object is.

	}

}



class User{
	private int key;
	public void setKey(int key) {
		this.key = key;
	}
	
	public int getKey() {
		return this.key;
	}
	
	
	
	
}