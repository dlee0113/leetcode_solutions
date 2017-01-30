package com.leetcode.ContainsDuplicate;

import java.util.HashSet;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] nums = {1, 2, 3, 2, 5};
		
		System.out.println(solution.containsDuplicate(nums));
	}

	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for (int num : nums) {
			if (!hashSet.add(num)) {
				return true;
			}
		}
		
		return false;
	}
}
