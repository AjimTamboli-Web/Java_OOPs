package java_OOPs.inheritance_types;

/*
 * Multilevel Inheritance ->  a derived class will be inheriting a base class and as well as the derived class
 *                             also acts as the base class for other classes.
 *                             
 */

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		
		FastFive five = new FastFive();
		

	}

}
class FastandFurious{      // base class 1
	FastandFurious(){
		System.out.println("Dom and brian duo introduces......1");
	}
}

class TwoFast2Furious extends FastandFurious{    // base class 2
	TwoFast2Furious(){
		System.out.println("Brian and Roman duo......2");
	}
}

class TokyoDrift extends TwoFast2Furious{        // base class 3
	TokyoDrift(){
		System.out.println("Han introduce.......3");
	}
}

class FastFour extends TokyoDrift{          // base class 4
	FastFour(){
		System.out.println("Letty into gang.....4");
	}
}

class FastFive extends FastFour{           // child class
	FastFive(){
		System.out.println("Heist begin......Luke Hobbs chase....5");
	}
}




