package array2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SuperElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,count=0;
		Map<Integer, Integer> map=new HashMap<>();
				System.out.println("enter no of Elements");
				Scanner sc=new Scanner(System.in);
				n=sc.nextInt();	
		        Integer a[] = new Integer[n];
		        Integer a2[] = new Integer[n];
		        System.out.println("Enter all the elements:");
		        for(i=0;i<a.length;i++) {
		        	
		        	a[i]=sc.nextInt();
		        }
		        Arrays.sort(a);
		        
		        for( i=0;i<a.length;i++) {
		        	count=0;
		        	for (int j=0;j<a.length;j++) {
		        		if (a[i]<a[j]) {
		        			count++;
		        		}
		        		
		        	}
		        	if(count>=2) {
		        	 
		        	map.put(a[i], count);
		        	}
			}
		    System.out.println( map.entrySet());

	}

}
