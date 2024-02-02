package polymorphism;

public class Child extends Parent
{
public void m1() {
	System.out.println("this is m1 method overided in child class");
}
public void m1(int i) {
	System.out.println("this is m1 method with argument overided in child class");
}
public void m2() {
	System.out.println("this is m2 method overided with public access modifier");
}
void m3() {
System.out.println("this is the m3 method not overided because it define as private in the parent class");	
}
public String m4() {
	System.out.println("this is the m4 method overided in the class");
	return "m4 method";
}
public static void m5() {
	System.out.println("this the m5 static method not overided in the child class");
}
public Child() {
	super(1);
	System.out.println("we have to first the parent class constructor if it has an argument in it");
	System.out.println("we have to call with the help super keyword in first line of child class constructor");
}
public static void main(String[]args) {
	Child c = new Child();
	c.m1();// calling only the child class method as execution based on the object
	Parent p = new Parent(1);
	p.m1();// calling the parent class method by creating the parent class object.
	Parent p1 = new Child();
	p1.m1();// here execution is based on the refrence variable if we combinely create the object of parent and child class.
	
}
}


