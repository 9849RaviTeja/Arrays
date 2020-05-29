package array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class LeaderElement {
	
	public static void main(String[] args) {
int i,n,count=0;
Map<Integer, Integer> map=new HashMap<>();
Map<Integer, Integer> map1=new HashMap<>();
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
        		if (a[i]==a[j]) {
        			count++;
        		}
        		
        	}
        	 
        	map.put(a[i], count);
        	
	}
    System.out.println( map.entrySet());
   
    Set<Entry<Integer, Integer>> set=map.entrySet();
    for (Entry<Integer, Integer> entry : set) {
	int count1=	entry.getValue();
		if(count1>n/2) {
		map1.put(entry.getKey(), entry.getValue());
		}
		
	}
    if(map1.size()==0) {
    	System.out.println("no leader element");
    }else {
    	System.out.println("no of leader elements"+map1.size());
    }
    //sorting map
    map1.entrySet().stream().sorted();
System.out.println(map1.entrySet());
}}
