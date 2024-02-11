package javaPractiseQuestion;

public class FindArmstrongNo {
public static void main(String[] args) {
	int n=153;
	int r=0;
	int c=0;
	int arm=0;
	c=n;
	while(n>0) {
		r=n%10;//3
		arm=(r*r*r)+arm;
		n=n/10;
	}
	if(c==arm) {
		System.out.println("This is an armstrong number");
	}
	else {
		System.out.println("This is not an armstrong number");
	}
}
}
