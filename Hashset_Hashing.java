package com.hash;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset_Hashing {

	public static void main(String[] args) {
		//creating
		HashSet<Integer> set=new HashSet<>();
		
		//Insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		//Search  -contains
		if(set.contains(1)) {
			System.out.println("set conatins 1");
		}
		if(!set.contains(6)) {
			System.out.println("does not contains");
		}
		
		//Delete
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("doesnot contains 1-we deleted 1");
		}
		
		//size 
		System.out.println("size="+set.size());
		
		//print all elements
		//System.out.println(set);
		
		//Iterator
		//hasNext ;next function for iterate..
		Iterator<Integer> it=set.iterator();	
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}

}
