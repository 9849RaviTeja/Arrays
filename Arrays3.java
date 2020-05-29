package array2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
/*
 *  You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.

Input array   =  [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] 
 */

public class Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n=0;
		System.out.println("enter no of Elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();	
        Integer a[] = new Integer[n];
       
        System.out.println("Enter all the elements:");
        for(i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
System.out.println("Entered elements are");
System.out.print("[");
for(i=0;i<a.length;i++) {
	System.out.print(a[i]+",");
}
System.out.print("]");

Arrays.sort(a);
System.out.println("After Sorting");
System.out.print("[");
for(i=0;i<a.length;i++) {
	System.out.print(a[i]+",");
}
System.out.print("]");

	}

}
