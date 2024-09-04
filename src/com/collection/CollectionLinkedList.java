package com.collection;

import java.util.LinkedList;
import java.util.List;

class Test1{
	void exericise() {
	List<String> list = new LinkedList<>();
	list.add("Yellow");
	list.add("Green");
	list.add("Red");
	list.add("Blue");
	
	List<String> list1 = new LinkedList<>();
	list1.add("Orange");
	list1.add("Brown");
	
	list.addAll(list1);
	System.out.println(list);
	}
}

public class CollectionLinkedList {
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.exericise();
	}
	
}
