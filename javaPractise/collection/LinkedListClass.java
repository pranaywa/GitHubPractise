package collection;

import java.util.LinkedList;

public class LinkedListClass {
// LinkedList preserved the insertion order
//LinkedList have the doubly Structure.
//Searching operation is not prefered in the linkedList as it used the starting and ending address.
//adding and deleting operation is prefered in the Linkedlist as there no shifting of data 
//instead of link is break and add the data or delete the data.
//the size of the linkedlist is not defined when data is added it will the make the size double.
//Duplicate and null value is allowed in the linkedlist.
	
public static void main(String[]args) {
	LinkedList<String> ls = new LinkedList<String>();
	ls.add("first");
	ls.add("second");
	ls.add(null);
	ls.add(null);
	ls.add("second");
	ls.add("third");
	System.out.println(ls);
}
}
