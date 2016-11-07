package com.leetcode.KthLargestElementInAnArray;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = { 3, 2, 1, 5, 6, 4 };

		int num = solution.findKthLargest(nums, 2);

		System.out.println(num);
	}

	// http://algorithms.tutorialhorizon.com/find-the-kth-smallestlargest-element-in-an-array/
	public int findKthLargest(int[] nums, int k) {
		// priority queue for min-heap
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		// priority queue for max-heap
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(nums.length, Collections.reverseOrder());
		
		for (int i = 0; i < nums.length; i++) {
			pq.offer(nums[i]);
		}
		
		int n = -1;
		
		while (k > 0) {
			n = pq.poll();
			k--;
		}
		
		return n;
	}
}
