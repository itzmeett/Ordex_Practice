package com.collection;

import java.util.HashSet;
import java.util.Set;

class Test2{
	void exercise() {
		HashSet<String> set = new HashSet<String>();
		set.add("22");
		set.add("56");
		set.add("62");
		set.add("89");
//		set.add(22);
		System.out.println(set.contains(22));
		set.remove(1);
		String[] str = new String[set.size()];
		set.toArray(str);
//		for (String s : str) {
//		System.out.println(str);
//		}
		System.out.println(set);
		
	}
}

public class CollectionHashSet {
	public static void main(String[] args) {
		Test2 t =new Test2();
		t.exercise();
	}
}
