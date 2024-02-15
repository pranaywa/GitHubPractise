package arrays;

import java.util.Arrays;

public class ArraysClass {
public static void main(String[] args) {
	String []arr = new String[5];
	arr[0]="zero";
	arr[1]="one";
	arr[2]="two";
	System.out.println(arr[0]);
	for(String s:arr) {
		System.out.println(s);
	}
	int arri[] = {1,2,3,4,5};
	Arrays.sort(arri);
	int newarr[] = Arrays.copyOf(arri, 5);
    for(int ar:arri) {
    	System.out.println(ar);
    }
    int totallength=arri.length;
    System.out.println(totallength); 
    System.out.println(totallength-1);
}
}
