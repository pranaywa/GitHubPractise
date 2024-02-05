package javaPractiseQuestion;

import java.util.Arrays;

public class SwappingTheLargestToSmallestInArray {
public static void main(String[] args) {
	int a [] = {1,3,66,53,3,2};
	int b [] = Arrays.copyOf(a,a.length);
	Arrays.sort(b);
	for(int c:b) {
		System.out.print(c+",");
	}
	System.out.println("the smallest no in b array is "+b[0]);
	System.out.println("the largest no in b array is "+b[b.length-1]);
	int sI = 0;
	int sL = 0;
	for(int i =0; i<=a.length-1; i++) {
		if(b[0]==a[i]) {
			System.out.println("the smallest value index no is "+i);
			sI=i;
		}
		if((b[b.length-1])==a[i]) {
			System.out.println("the largest value index no is "+i);
			sL=i;
		}
	}
	int n =0;
	n = a[sI];
	a[sI]=a[sL];
	a[sL]=n;
	for(int arr:a) {
		System.out.print(arr+",");
	}
	
}
}
