package com.xworkz.freedomFighters;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MarkerTester {

	public static void main(String[] args) {
		Map<String, Integer> maps=new HashMap<String, Integer>();
		String name="Aishu";
		int age=24;
		maps.put("Vishalaxi", 23);
		maps.put("vena", 23);
		maps.put("Varsha", 24);
		maps.put("Spoorti", 34);
		maps.put("kirti", 30);
		maps.put(null, null);
		System.out.println(maps.size());
		
		
		Integer value=maps.get("Spoorti");
		System.out.println(value);
		
		Set<String> keys=maps.keySet();
		keys.forEach(a->{
			Integer r=maps.get(a);
			System.out.println(a + "age is "+r);
		});
		
        Collection<Integer> values=maps.values();
		
		values.forEach(a->System.out.println(a));

		Set<Entry<String,Integer>> entrySet=maps.entrySet();
		System.out.println(entrySet.size());
		entrySet.forEach(r->{
			System.out.println(r.getKey());
			System.out.println(r.getValue());
		});
		
			
		
		

		
		

	}

}
