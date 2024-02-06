package javaPractiseQuestion;

public class ReverseString {
public static void main(String[] args) {
	String s = "Pranay";
	String [] as =s.split("");
	for(int i=as.length-1;i>=0;i--) {
		System.out.print(as[i]+",");
	}
	System.out.println();
	
	String a = "Pranay";
	for(int j =a.length()-1;j>=0;j--) {
		char c =a.charAt(j);
		System.out.print(c+",");
	}
	System.out.println();
	
	String b = "Pranay";
	String rev ="";
	for(int k=b.length()-1;k>=0;k--) {
		rev=rev+b.charAt(k)+",";
	}
	System.out.println(rev);
}
}
