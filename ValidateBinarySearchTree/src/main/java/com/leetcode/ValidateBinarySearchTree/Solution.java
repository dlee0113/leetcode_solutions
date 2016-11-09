package com.leetcode.ValidateBinarySearchTree;

public class Solution {
	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(3);
		
		treeNode2.left = treeNode1;
		treeNode2.right = treeNode3;
		
		Solution solution = new Solution();
		solution.printInOrder(treeNode2);
	}
	
	public boolean isValidBST(TreeNode root) {
        
		
		
		return true;
    }
	
	public void printInOrder(TreeNode treeNode) {
		if (treeNode != null) {
			System.out.println("printInOrder(" + treeNode.val + ")");
		}
		else {
			System.out.println("printInOrder(" + null + ")");
		}
		
		// end traversal
		if (treeNode == null) {
			return;
		}
		
		printInOrder(treeNode.left);
		System.out.println(treeNode.val);
		printInOrder(treeNode.right);
	}
}
