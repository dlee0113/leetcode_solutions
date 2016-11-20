package com.leetcode.RemoveElement;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		
		Solution solution = new Solution();
		int length = solution.removeElement(nums, val);
		
		System.out.println(Arrays.toString(nums));
		System.out.println(length);
	}
	
    public int removeElement(int[] nums, int val) {
    	int i = 0; // pointer for new array
    	
    	for (int j = 0; j < nums.length; j++) {
    		System.out.println("i: " + i + ", j: " + j);
    		
    		if (nums[j] != val) {
    			nums[i] = nums[j];
    			i++;
    			
    			System.out.println(Arrays.toString(nums));
    		}
    	}
    	
    	return i;
    }
}
