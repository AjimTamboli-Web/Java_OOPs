package java_OOPs;

/*
 * Encapsulation -> is make sure that sensitive data is hidden from users. To achieve this, you must declare 
 *                   class variables/ attributes as private.
 *                   Provide public get and set methods to access and update the values of a private variables.
 *   Encapsulation means combining data and the functions that work on that data into a single unit, like a class.                
 *   - Better control of class attributes and methods. increase the security of data.                
 */  

public class Encapsulations {

	public static void main(String[] args) {
		
		Encap en = new Encap();
		
		en.setPass("ABC");
		System.out.println(en.getPass());

	}

}

class Encap{
	
	private String pass;
	
	public void setPass(String p) {
		this.pass = p;
	}
	public String getPass() {
		return pass;
	}	
	
}