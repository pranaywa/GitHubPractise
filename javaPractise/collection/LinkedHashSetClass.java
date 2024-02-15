package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
//Insertion order is preserved.
//Null values allowed only once.
//Duplicate value are not allowed.
public static void main(String[]args) {
	LinkedHashSet<String> hs = new LinkedHashSet<String>();
	hs.add("firstone");
	hs.add("third");
	hs.add(null);
	hs.add(null);
	hs.add("fifth");
	hs.add("first");
	System.out.println(hs);
}
}
