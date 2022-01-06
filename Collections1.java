package com.handson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections1 {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(131, 26);
		map.put(136, 18);
		map.put(142, 20);
		map.put(127, 23);
		map.put(128, 16);
		map.put(123, 19);
		Collections1 c = new Collections1();
		List result = c.votersList(map);
		System.out.println(result);
	}
	public List votersList(Map map) {
		Set<Integer> keys = map.keySet();
		List list = new ArrayList();
		for(Integer val:keys) {
			int res = (int)map.get(val);
			if(res>18) {
				list.add(res);
			}
		}
		return list;
	}

}
