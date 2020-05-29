package array2;

import java.util.Scanner;

/*
 Given an array of N elements and the task is to print the elements of an array after right rotating array elements by p positions.

Input: Read array elements and read no.of positions (p) to rotate.

Output: Array elements after positions rotation.

	
	Input:
    	array elements: 1 2 3 4 5 
	position = 2
    

    Output: 
    4 5 1 2 3
 */
public class RightRotation {

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
    	System.out.println("enter postion");
		int position=sc.nextInt();
	
	for(i=a.length-position;i<a.length;i++) {
		System.out.print(a[i]);
	}
	for(i=0;i<a.length-position;i++) {
    	System.out.print(a[i]);
    }
	
		}

}
