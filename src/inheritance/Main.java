package inheritance;

public class Main {
	public static void main(String[] args) {

		ClassA a = new ClassB(); // upcasting .(creating an instance of ClassB to a reference of type Class A)
		a.name = " Arshdeep";
		a.methodOne();
		a.methodTwo();
		

//		 allowed to access only parent class members and child class specified members (overridden methods, etc.) but not all members. 

//		ClassB b = (ClassB) (new ClassA()); // This will throw Class cat exception
//		b.methodOne();
//		b.methodThree();
//		b.methodTwo();

		ClassB c = (ClassB) a; // This will work (downcast a to ClassB and call the methods specific to ClassB)
		c.methodOne();
		c.methodThree();
		c.methodTwo();
		c.id = 1001;

// object must truly be an instance of the subclass for downcasting to work correctly.

		ClassA d = new ClassA();
		ClassC e = (ClassC) d; // This will throw Class cat exception
		e.name = " Arsh";
		e.methodOne();
		e.methodTwo();
		e.age = 30;

	}
}
