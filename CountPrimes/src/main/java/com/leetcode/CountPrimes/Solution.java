package com.leetcode.CountPrimes;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int count = solution.countPrimes(2);
		
		System.out.println(count);
	}

	public int countPrimes(int n) {
		int count = 0;
		
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		
		return count;
	}
	
	private boolean isPrime(int n) {
		for (int i = 2; i < n; i ++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
