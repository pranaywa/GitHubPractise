package polymorphism;

public class Parent {
public void m1() {
	System.out.println("this is a m1 method from the parent class");
}
public void m1(int i) {
	System.out.println("this is a m1 overloaded method from the parent class");
}
void m2() {
	System.out.println("this is a m2 method from the parent class");
}
private void m3() {
	System.out.println("this is a m3 method from the parent class");
}
public String m4() {
	System.out.println("this is a m4 method with return type from parent class");
	return "m4 method";
}
public static void m5() {
	System.out.println("this is a m5 static method from the parent class");
	System.out.println("defining the static method in parent class is called method hiding");
}

public Parent(int i) {
	System.out.println("this is constructor of parent class");
}

}
