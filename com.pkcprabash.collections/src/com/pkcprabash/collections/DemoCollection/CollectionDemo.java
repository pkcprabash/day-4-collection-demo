package com.pkcprabash.collections.DemoCollection; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list1 = new ArrayList<Object>();
		list1.add("Apple");
		list1.add(2);
		list1.add(5.5);
		list1.add('a');
		list1.add("Apple");
		
		//print through stream
		list1.stream().forEach(item->System.out.println(item));
		
		//add
		//list1.remove('a');
		list1.remove(2);
		list1.add(2,'b');
		
		System.out.print("a");
		System.out.println(list1.contains(2));
		
		list1.stream().forEach(item->System.out.println(item));
		
		
		//xxxxxx--------------xxxxxx--------------xxxxxxx-------xxxxxx
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(4);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//xxxxxx--------------xxxxxx--------------xxxxxxx-------xxxxxx
		Map<Integer,String> map = new HashMap<>();
		map.put(1,"Apple");
		map.put(2,"Banana");
		map.put(3, null);
		map.put(null, null);
		
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());

	}

}
