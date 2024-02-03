package inhertiance;

public class Parent1 {
public void m1() {
	System.out.println("this is a m1 method from parent class");
}
public void m2() {
	System.out.println("this is a m2 method from parent class");
}
public Parent1(int i) {
	System.out.println("this is a constructor from parent class");
}
public static void main(String[] args) {
	Parent1 p = new Parent1(1);
	p.m1();
	p.m2();
}
}
