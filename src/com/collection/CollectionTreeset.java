package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

class Test3{
	void exercise() {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Yellow");
		ts.add("Green");
		ts.add("Red");
		ts.add("Blue");
		
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Yellow");
		ts1.add("Green");
		ts1.add("Red");
		ts1.add("Blue");
		ts1.add("Brown");
		
		TreeSet<String> ts2 = (TreeSet<String>)ts.clone();
		System.out.println(ts2); 
		 	
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(" " + it.next());
		}
	}
}

public class CollectionTreeset {
	public static void main(String[] args) {
		Test3 t =new Test3();
		t.exercise();
	}
}
