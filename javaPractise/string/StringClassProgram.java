package string;

public class StringClassProgram {
public static void main(String[] args) {
	String s = new String("String");
	String s1 = "String";
	s1=s1.concat("first");
	System.out.println(s1);
	
	StringBuffer sb = new StringBuffer("tony");
	sb.append("stark");
	System.out.println(sb);
	
	String s2 = "this is a string";
	String []s3 = s2.split("");
	for(int i=s3.length-1;i>=0;i--) {
		System.out.print(s3[i]+",");
	}
	String rev="";
	for(int j =s2.length()-1;j>=0;j--){
		char c = s2.charAt(j);
		rev=rev+c+",";
		
	}
	System.out.println();
	System.out.println(rev+",");
	
	String s4="asdf232asdf234f3r2r32r";
	
	boolean bb = s4.equals(s2);
	String sss="this is a atring";
	boolean b1 =sss.equalsIgnoreCase(s2);
	System.out.println(b1);
	
	
	String s5=s4.replaceAll("[^0-9]","");
	System.out.println(s5);
	String num ="";
	
	int sum = 0;
	for(int k=0; k<=s4.length()-1;k++) {
		char c1=s4.charAt(k);
	    boolean b = Character.isDigit(c1);
		if(b) {
			num=num+c1;
			int n = Integer.parseInt(num);
			num="";
			sum=sum+n;
			
			}
		}
	System.out.println(sum);
	}
	
	
	
	
	
	
}

