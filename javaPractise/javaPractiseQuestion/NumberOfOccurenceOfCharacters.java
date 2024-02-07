package javaPractiseQuestion;

public class NumberOfOccurenceOfCharacters {
public static void main(String[] args) {
	String s = "sewdfasseasdaaafsersa";
	int count =1;
	for(int i=0; i<=s.length()-1; i++) {
		char c=s.charAt(i);
		if(c == 'a') {
			count = count +1;
		}
	}
	System.out.println("Total no of count of a character is "+count);
	
}
}
