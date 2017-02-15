package com.leetcode.MaxConsecutiveOnes;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {1,1,0,1,1,1};
		int max = solution.findMaxConsecutiveOnes(nums);
		
		System.out.println(max);
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int max = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			}
			
			if (nums[i] == 0 || i == nums.length - 1) {
				if (count > max) {
					max = count;
				}
				
				count = 0;
			}
		}
		
		return max;
	}
}
