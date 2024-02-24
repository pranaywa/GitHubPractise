package modifier;

 public class AccessModifiers {
//Access modifire can be define over a class , methods and variables
//There are different type of the access modifiers that are
//class level -   public - access through out the project
//                default - access with in the package
//                final  - class cannot be inherite or overide
//                abstract - class can have the incomplete or complete methods.
//Method level -  public - method access through out the project
//	              default - method access with in the package.
//	              private - method access with in the class
//	              protected - method access with in the package and outside it can be access by the child class ref_variable 
//	              final - method cannot be overide
//                abstract - incomplete method define as abstract method in abstract class
	 final void m1() {
		 System.out.println("final method of parent class");
	 }
//Variable level - public - Variable access throughout the project
//	               default - Variable access with in the package 
//	               private - Variable access with in the class 
	 private int i = 1000;
	 public void privateV() {
		 System.out.println(i);
	 }
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
	
}

