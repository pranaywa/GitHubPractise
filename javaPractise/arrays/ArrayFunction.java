package arrays;

public class ArrayFunction {
public static int addition(int arr[]) {
int sum =0;
for(int num:arr) {
	sum+=num;
}
return sum;
}
public static void main(String[]args) {
	int a[]= {1,3,4,5,5};
    int summ = addition(a);
    System.out.println(summ);
}
}
