package com.leetcode.MergeSortedArray;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] nums1 = new int[7];
		
		nums1[0] = 1;
		nums1[1] = 3;
		nums1[2] = 4;
		nums1[3] = 6;
		
		int[] nums2 = {2, 5, 8};
		
		solution.merge(nums1, 4, nums2, 3);
		
		System.out.println(Arrays.toString(nums1));
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] mergedArray = new int[m + n];
		int mergedArrayIndex = 0;
		int nums1Index = 0;
		int nums2Index = 0;
		
		while (nums1Index < m && nums2Index < n)	{
			if (nums1[nums1Index] < nums2[nums2Index]) {
				mergedArray[mergedArrayIndex] = nums1[nums1Index];
				
				mergedArrayIndex++;
				nums1Index++;
			}
			else {
				mergedArray[mergedArrayIndex] = nums2[nums2Index];
				
				mergedArrayIndex++;
				nums2Index++;
			}
		}
		
		while (nums1Index < m) {
			mergedArray[mergedArrayIndex] = nums1[nums1Index];
			
			mergedArrayIndex++;
			nums1Index++;
		}
		
		while (nums2Index < n) {
			mergedArray[mergedArrayIndex] = nums2[nums2Index];
			
			mergedArrayIndex++;
			nums2Index++;
		}
		
		for (int k = 0; k < mergedArray.length; k++) {
			nums1[k] = mergedArray[k];
		}
	}
}
