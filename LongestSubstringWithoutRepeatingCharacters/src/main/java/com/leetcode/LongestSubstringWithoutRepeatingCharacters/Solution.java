package com.leetcode.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/articles/longest-substring-without-repeating-characters
public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();

		System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
		System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
	}

	public int lengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<Character>();
		int ans = 0, i = 0, j = 0;
		
		while (i < n && j < n) {
			// try to extend the range [i, j]
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}

		return ans;
	}
}
