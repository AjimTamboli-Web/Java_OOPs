package java_OOPs;
import java_plane.Access_Subclass;  // Access From different Package

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

}
