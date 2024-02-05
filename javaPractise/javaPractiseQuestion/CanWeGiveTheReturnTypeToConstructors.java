package javaPractiseQuestion;

public class CanWeGiveTheReturnTypeToConstructors {
public void m1() {
	System.out.println("this is a m1 method");
}
 CanWeGiveTheReturnTypeToConstructors() {
System.out.println("we cannot give the return type to the costructors because if provide return constructor"
		+ "will became a method");
}
// Constructor cannot be static its a illegal modifier for constructors
// Constructor cannot be final 
// public,default,private and protected are access modifier that are allowed for constructors.
}
