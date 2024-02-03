package polymorphism;

public class Overriding1 extends Overloading1 
{
	public void marry() {
		System.out.println("marry method from parent class overided in child class");
	}
	public static void m12() {
		System.out.println("static method from child class");
	}
public void m1(int i) {
	System.out.println("this is a overrided m1 method in child class");
}
protected void m1(String s) {
	System.out.println("overidded method");
}
public Overriding1() {
	
}
public static void main(String[] args) {
	Overriding1 ov = new Overriding1();
	ov.m1(2);
	ov.marry();
	Overloading1 ov1 = new Overloading1();
	ov1.m1(2);
	ov1.marry();
	Overloading1 ovv = new Overloading1();
	ovv.marry();
	
}
}
