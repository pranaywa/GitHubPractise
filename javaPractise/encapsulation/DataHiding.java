package encapsulation;

public class DataHiding {
private int balance = 1000;
	
public void getBalance(int pin) {
	if(pin == 123) {
		System.out.println("the current balance is = "+balance);
	}
	else {
		System.out.println("Incorrect pin, please try again later");
	}
}
	
	
}
