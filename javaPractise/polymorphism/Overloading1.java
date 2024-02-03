package polymorphism;

public class Overloading1 {
public void marry() {
	System.out.println("marry method from parent class");
}
public static void m12() {
	System.out.println("static method from parent class");
}
public void m1(int i) {
	System.out.println("method 1 with argument");
}
public void m1(int i, int j) {
	int k = i+j;
	System.out.println(k);
}
protected void m1(String s) {
	System.out.println("method 1 with string argument");
}
public Overloading1() {
	System.out.println("constructor1");
}
public Overloading1(int i) {
	System.out.println("constructor2");
}
public static void main(String[] args) {
	Overloading1 o = new Overloading1();
	o.m1("String");
}
}
