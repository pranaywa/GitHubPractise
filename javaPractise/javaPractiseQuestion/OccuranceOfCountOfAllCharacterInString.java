package javaPractiseQuestion;

import java.util.HashMap;
import java.util.TreeSet;

public class OccuranceOfCountOfAllCharacterInString {
public static void main(String[] args) {
	String s = "asfasdfasdasdfsadfasdf";
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	for(int i = 0; i<=s.length()-1; i++) {
		char charV = s.charAt(i);
		if(hm.containsKey(charV)) {
			hm.put(charV,hm.get(charV)+1);
		}
		else {
			hm.put(charV, 1);
		}
	}
	System.out.println(hm);
	
}
}
