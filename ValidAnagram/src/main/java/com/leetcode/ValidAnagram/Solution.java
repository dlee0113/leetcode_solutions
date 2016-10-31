package com.leetcode.ValidAnagram;

import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
//		String s = "rat";
//		String t = "car";
		
		Solution solution = new Solution();
		System.out.println(solution.isAnagram(s, t));
	}

	public boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> sHashMap = new HashMap<Character, Integer>();
		
		for (Character character : s.toCharArray()) {
			if (sHashMap.containsKey(character)) {
				sHashMap.put(character, sHashMap.get(character) + 1);
			}
			else {
				sHashMap.put(character, 1);
			}
		}
		
		for (Character character : t.toCharArray()) {
			if (sHashMap.containsKey(character)) {
				sHashMap.put(character, sHashMap.get(character) - 1);
			}
			else {
				sHashMap.put(character, -1);
			}
		}
		
		for (Entry<Character, Integer> entry : sHashMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		for (Entry<Character, Integer> entry : sHashMap.entrySet()) {
			if (entry.getValue() != 0) {
				return false;
			}
		}
		
		return true;
	}
}
