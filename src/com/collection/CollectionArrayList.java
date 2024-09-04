//PRACTICAL-21:Write a Java program to create an array list, add some colors (strings) and 
//print out the collection.
package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test{
	
	public void example() {
	List<Integer> list = new ArrayList<Integer>();
	list.add(56);
	list.add(23);
	list.add(56);
	list.add(78);
	list.add(0, 44); //1. insert element at first position
	list.get(4); //2. Get element at specific index 
	list.set(2, 42); //3. update element at specific index
	Collections.sort(list); //5. sorting a list using Collections
	for(Integer i : list) { //4. iteration using for each loop
		System.out.println(i);
	}
	}
}

public class CollectionArrayList {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.example();
	}
}
