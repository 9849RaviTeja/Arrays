package array2;

import java.util.Arrays;
import java.util.Scanner;

/*
 *  You are given an array of 0s,  1s and 2s in random order. Segregate 0s, 1s and 2s in the array.

Input array   =  [0, 1, 0, 2, 0, 0, 2, 1, 2, 0] 
Output array =  [0, 0, 0, 0, 0, 1, 1, 2, 2, 2] 
 */

public class Array4 {

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