package com.leetcode.FirstUniqueCharacterInAString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
//		System.out.println(solution.firstUniqChar("leetcode"));
//		System.out.println(solution.firstUniqChar("loveleetcode"));
//		System.out.println(solution.firstUniqChar("z"));
//		System.out.println(solution.firstUniqChar("aadadaad"));
		System.out.println(solution.firstUniqChar("dddccdbba"));
	}

	public int firstUniqChar(String s) {
		if (s.equals("")) {
			return -1;
		}
		
		if (s.length() == 1) {
			return 0;
		}
		
		char[] characters = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (char character : characters) {
			if (map.get(character) == null) {
				map.put(character, 1);
			}
			else {
				map.put(character, map.get(character) + 1);
			}
		}
		
//		for (Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return s.indexOf(entry.getKey());
			}
		}
		
		return -1;
	}
}
