package inhertiance;

public class GrandChild extends Child
{
public void m11() { 
	System.out.println("this is m11 method of grandchild class");
}
public void m12() {
	System.out.println("this is a m12 method of grandchild class");
}
public void m13() {
	System.out.println("this is a m13 method of grandchild class");
}

public GrandChild() {
	System.out.println("this is a constructor of the grandchild class");
}

public static void main(String[] args) {
	GrandChild g = new GrandChild();
	g.m11();
	g.m12();
	g.m13();
	g.m1();
	Child.m5();
}

}

