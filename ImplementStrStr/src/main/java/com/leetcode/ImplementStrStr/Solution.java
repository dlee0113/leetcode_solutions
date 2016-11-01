package com.leetcode.ImplementStrStr;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
//		System.out.println(solution.strStr("abcde", "cd"));
//		System.out.println(solution.strStr("abcdcd", "cd"));
//		System.out.println(solution.strStr("abcdcd", "cde"));
//		System.out.println(solution.strStr("a", ""));
//		System.out.println(solution.strStr("", ""));
		System.out.println(solution.strStr("aaaaaaaaaaa", "aaaaaaaaaab"));
	}

	public int strStr(String haystack, String needle) {
//		return haystack.indexOf(needle);
		
		char[] haystackArray = haystack.toCharArray();
		char[] needleArray = needle.toCharArray();
		
		if (needleArray.length == 0) {
			return 0;
		}

		for (int i = 0; i < haystackArray.length; i++) {
			if (needleArray.length > haystackArray.length - i) {
				break;
			}
			
			for (int j = 0; j < needleArray.length; j++) {
				if (i + j >= haystackArray.length || 
					needleArray[j] != haystackArray[i + j]) {
					
					break;
				}
				
				if (j == needleArray.length - 1) {
					return i;
				}
			}
		}
		
		return -1;
	}
}
