package com.javapro.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {
	public static void main(String[] args) {

		/**
		 * @Setting the Map key value pairs
		 */
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "8892998492");
		map.put("b", "9632437341");

		/**
		 *  @Iterating over the Key Value pairs
		 */
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.err.println(key + "'s Phone Number is " + map.get(key));
		}
	}
}
