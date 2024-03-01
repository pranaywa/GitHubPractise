package exceptions;

public class TryCatchHandling {
public static void main(String[]args) {
	try{int i=1; // Risky Code
	int j=0;
	int k=i/j;
	System.out.println(k);} 
	catch (ArithmeticException a) { // By pass code and Exception
     System.out.println("Arithmetic Exception");
	}
	
}
}
