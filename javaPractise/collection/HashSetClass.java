package collection;

import java.util.HashSet;

public class HashSetClass {
//HashSet is an class implements the set interface.
//Used when we want to define only the unique.
//HashSet doesnot persevered the insertion order.
//only unique value are allowed.
//Duplicate value are not allowed.
//Null value are allowed only once.
	public static void main(String[]args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(1);
		hs.add(6);
		hs.add(7);
		hs.add(3);
		hs.add(3);
		hs.add(null);
		hs.add(4);
		System.out.println(hs);
	}
}
