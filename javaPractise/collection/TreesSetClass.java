package collection;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesSetClass {
//TreeSet is class implements the set interface.
//TreesSet is used when we want to define the data in asencending or descending order.
//TreeSet is not allowing the null value as it throws the NullPointerException.
//Duplicate value are not allowed.
//By default the values are defines in asencending order.
public static void main(String[]args) {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(1);
	ts.add(66);
	ts.add(1);
	ts.add(3);
	ts.add(5);
	System.out.println(ts);
	
	NavigableSet<Integer> ns = ts.descendingSet();
	System.out.println(ns);
	
	
}
}
