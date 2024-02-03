package inhertiance;

public class Child1 extends Parent1
{
public void m3() {
	System.out.println("this is a m3 method from child class");
}
public void m4() {
	System.out.println("this is a m4 method from child class");
}
public Child1(int i) {
	super(1);
	System.out.println("this is a constructor of child class1");
}
public static void main(String[] args) {
	Child1 c = new Child1(1);
	c.m3();
	c.m4();
	c.m1();
	c.m2();
}
}
