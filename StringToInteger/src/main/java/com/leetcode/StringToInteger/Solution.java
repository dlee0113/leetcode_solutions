package com.leetcode.StringToInteger;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
//		System.out.println(solution.myAtoi("123"));
//		System.out.println(solution.myAtoi("+"));
//		System.out.println(solution.myAtoi("+1")); // 1
//		System.out.println(solution.myAtoi("-1")); // -1
//		System.out.println(solution.myAtoi("+-1")); // 0
//		System.out.println(solution.myAtoi("-+1")); // 0
//		System.out.println(solution.myAtoi("-1+1")); // 0
//		System.out.println(solution.myAtoi("  -0012a42")); // -12
//		System.out.println(solution.myAtoi("   +0 123"));
//		System.out.println(solution.myAtoi("2147483648"));
		System.out.println(solution.myAtoi("   - 321"));
	}

	public int myAtoi(String str) {
		if (str.length() == 0) {
			return 0;
		}
		
		String validString = "";
		long number = 0;
		boolean positiveSign = false;
		boolean negativeSign = false;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && (!validString.equals("") || positiveSign || negativeSign)) {
				break;
			}
			else if (str.charAt(i) == ' ') {
				continue;
			}
			
			if (str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9) {
				validString += str.charAt(i);
			}
			else if (str.charAt(i) == '+') {
				if (positiveSign == true || negativeSign == true) {
					return 0;
				}
				else {
					positiveSign = true;
				}
			}
			else if (str.charAt(i) == '-') {
				if (positiveSign == true || negativeSign == true) {
					return 0;
				}
				else {
					negativeSign = true;
				}
			}
			else {
				break;
			}
		}
		
		System.out.println("validString: " + validString);
		
		if (validString.equals("")) {
			return 0;
		}
		
		int power = validString.length() - 1;
		
		for (int i = 0; i < validString.length(); i++) {
			number += (validString.charAt(i) - '0') * Math.pow(10, power);
			
			power--;
		}
		
		if (negativeSign) {
			number *= -1;
		}
		
		if (number < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		else if (number > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		
		return (int) number;
	}
}
