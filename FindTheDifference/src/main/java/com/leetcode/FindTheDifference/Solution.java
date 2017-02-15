package com.leetcode.FindTheDifference;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
//		String s = "abcd";
//		String t = "abcde";
		String s = "a";
		String t = "aa";
		
		char newCharacter = solution.findTheDifference(s, t);
		
		System.out.println(newCharacter);
	}

	public char findTheDifference(String s, String t) {
		char[] sCharacters = s.toCharArray();
		char[] tCharacters = t.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character character : sCharacters) {
			if (map.get(character) == null) {
				map.put(character, 1);
			}
			else {
				map.put(character, map.get(character) + 1);
			}
		}
		
		for (Character character : tCharacters) {
			if (map.get(character) == null || map.get(character) == 0) {
				map.put(character, 1);
			}
			else {
				map.put(character, map.get(character) - 1);
			}
		}
		
		char newCharacter = '\0';
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				newCharacter = entry.getKey();
			}
		}
		
		return newCharacter;
	}
}
