package javaPractiseQuestion;

public class AddingTheIntegersAvailableInString {
public static void main(String[] args) {
	String a = "10asew3asdf20sdf4";
	String num ="";
	int flag = 0;
	int sum =0;
	for(int i=0;i<=a.length()-1;i++) {
		boolean isNum=Character.isDigit(a.charAt(i));
		if(isNum) {
			num = num+a.charAt(i);
            flag =1;
		if(i != a.length()-1) {
			continue;
		}
		}
		if(flag == 1) {
			Integer value = Integer.parseInt(num);
			num="";
			sum = sum+value;
			flag = 0;
		}
		
		}
	System.out.println("The total of the integer is "+sum);
}
}
