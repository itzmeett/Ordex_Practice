package com.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class Test4 {
	public Integer key;
	public String value;
	void exercise() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(44, "Meet");
		map.put(63, "Rahul");
		map.put(24, "John");
		map.put(49, "William");
		map.put(24, "Smith");
		
		HashMap<Integer, String> map1 = new HashMap<>();
		map.put(22, "Suresh");
		map.put(32, "Ramesh");
		map.put(24, "John");
		map.put(49, "William");
		map.put(24, "Smith");
		
//		map.entrySet(Entry<Integer, String>);
//		map.putAll(map1);
//		String result = map.get(22);
//		System.out.println(result);
//		System.out.println(map.keySet());
//		System.out.println(map.values()); 
//		System.out.println(map);
//		System.out.println(map1);
		System.out.println(map);
		
	}
	public static Comparator<Test4> ct = new Comparator<>() {

		@Override
		public int compare(Test4 o1, Test4 o2) {
			// TODO Auto-generated method stub
			return o1.value.compareTo(o2.value);
		}
		
	};

}


public class CollectionHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(12, "Chhagan");
		map.put(44, "Meet");
		map.put(63, "Rahul");
		map.put(24, "John");
		map.put(49, "William");
		map.put(24, "Smith");
		Test4 t1 =new Test4();
		
//		Collections.sort(map, Test4.ct);
//		t.exercise();
	}
}
