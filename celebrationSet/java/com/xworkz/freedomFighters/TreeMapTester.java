package com.xworkz.freedomFighters;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTester {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<String, String>((a, b) -> b.compareTo(a));
		map.put("Dil se","A R Rahman");
		map.put("Thum hi ho", "Arijith singh");
		map.put("Kali quarter bottle", "Vijay Prakash");
		map.put("Happier", "Marshmellow");
		map.put("yammy", "Justin Bieber");

		Set<Entry<String, String>> entrySet = map.entrySet();
		entrySet.forEach(entry -> System.out.println("Song is : " + entry.getKey() + " Singer is:" + entry.getValue()));

		map.forEach((k, v) -> System.out.println(k + " " + v));
		Properties properties = new Properties();
		properties.setProperty("Name", "Email");
		properties.getProperty("Name");


}
}
