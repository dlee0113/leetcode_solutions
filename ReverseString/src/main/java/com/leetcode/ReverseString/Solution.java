package com.leetcode.ReverseString;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String reversedString = solution.reverseString("hello");
		
		System.out.println(reversedString);
	}
	
    public String reverseString(String s) {
    	char[] charArray = s.toCharArray();
    	StringBuilder reversedString = new StringBuilder();
    	
    	for (int i = s.toCharArray().length - 1; i >= 0; i--) {
    		reversedString.append(charArray[i]);
    	}
    	
    	return reversedString.toString();
    }
}
