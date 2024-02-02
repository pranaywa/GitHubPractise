package polymorphism;

public class Overloading {
public void m1() {
	System.out.println("this is a m1 method form parent class");
}
public void m1(int i) {
	int j = i+2;
	System.out.println("the value of the number is + by 2 ="+i);
}
public void m1(int i, int j) {
	int k = i+j;
	System.out.println("the value of "+i+" and "+"the value of "+j+" is the sum = "+k);
}
public void m1(int i,String name) {
	System.out.println("the first argument is = "+i);
	System.out.println("the second argumnet is = "+name);
}
public void m1(String name, int i) {
	System.out.println("this is the m1 overloading method with two arguments");
}
void m1(boolean b) {
	System.out.println("this is the m1 overloaded method with default access modifier");
}
public String m1(String name) {
	System.out.println("this is the m1 overloaded method with return type and one argument");
	return "";
}
public Overloading() {
	System.out.println("this is the constructor of overloading class");
}
public Overloading(int i) {
	System.out.println("this is the constructor overloaded with one argument");
}
Overloading(String n){
	System.out.println("this is the another constructor overloaded with an argurment");
}
public static void main(String[]args) {
	Overloading o = new Overloading();
	o.m1();
	o.m1(false);
	o.m1(10, 3);
}







}
