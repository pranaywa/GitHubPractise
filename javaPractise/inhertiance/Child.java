package inhertiance;

public class Child extends Parent
{
public static void m5() {
	System.out.println("this is static m5 method from child class");
}
public void m6() {
	System.out.println("this is m6 method from the child class");
}
public void m7() {
	System.out.println("this is m7 method from the child class");
}

public Child() {
	System.out.println("this is a constructor of the child class");
}

public static void main(String[]args) {
	Child c = new Child();
	//c.m5();
	Child.m5();
	c.m6();
	c.m7();
	c.m1();
	c.m2();
	c.m3();
	
}

}
