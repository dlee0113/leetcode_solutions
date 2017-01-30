package com.leetcode.AddStrings;

import java.math.BigInteger;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		String sum = solution.addStrings("100", "200");
		
		System.out.println(sum);
	}

	public String addStrings(String num1, String num2) {
		BigInteger num1Int = new BigInteger(num1);
		BigInteger num2Int = new BigInteger(num2);
		
		return num1Int.add(num2Int).toString();
	}
}
