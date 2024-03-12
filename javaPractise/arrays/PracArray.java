package arrays;

public class PracArray {
public static void main(String[] args) {
	int a [] = {1,2,3,1,2,3,4,};
	int sum =0;
	for(int i=0;i<a.length;i++) { // a[0] =1
	    for(int j=i+1;j<a.length-1;j++) { //a[1]=2,3
	    	if(a[i] == a[j+1]) {
               sum = sum+a[i];
	    	}
	    			}
	}
	System.out.println(sum);
}
}
