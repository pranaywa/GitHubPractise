package collection;

import java.util.ArrayList;

public class ArrayListClass {
//ArrayList is class of List Interface.
//Insertion order is preserved
//Duplicate and null value are allowed.
//ArrayList Structure is the Grouped Structure.
//ArrayList does not perfer for addition and deletions of data because of shifting operations.
//ArrayList perfers for searching operations 
//Default size is 10. if data add it became 16 by formula currentsize*3/2+1.
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("pranay");
		al.add("pranay");
		al.add(null);
		al.add(null);
		al.add("tony");
		System.out.println(al);
		ArrayList<String> all = new ArrayList<String>();
		all.add("first");
		all.add("second");
		System.out.println(all);
		al.addAll(all);
		System.out.println(al);
	    all.addAll(al);
	    System.out.println(all);
	    al.remove(al.size()-2);
		System.out.println(al);
	    
		
		
		
		
	}
}
