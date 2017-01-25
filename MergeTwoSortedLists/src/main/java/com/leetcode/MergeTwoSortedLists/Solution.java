package com.leetcode.MergeTwoSortedLists;

public class Solution {
	public static void main(String[] args) {
//		ListNode listNode1 = new ListNode(1);
//		ListNode listNode3 = new ListNode(3);
//		ListNode listNode5 = new ListNode(5);
//		
//		listNode1.next = listNode3;
//		listNode3.next = listNode5;
//		
//		ListNode listNode2 = new ListNode(2);
//		ListNode listNode4 = new ListNode(4);
//		ListNode listNode6 = new ListNode(6);
//		
//		listNode2.next = listNode4;
//		listNode4.next = listNode6;
		
		ListNode listNode1 = new ListNode(1);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode5 = new ListNode(4);
		
		listNode1.next = listNode3;
		listNode3.next = listNode5;
		
		ListNode listNode2 = new ListNode(0);
		
		Solution solution = new Solution();
		
		solution.print(listNode1);
		solution.print(listNode2);
		
		ListNode mergedListNode = solution.mergeTwoLists(listNode1, listNode2);
		solution.print(mergedListNode);
	}
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if (l1 == null && l2 == null) {
    		return null;
    	}
    	else if (l1 == null) {
    		return l2;
    	}
    	else if (l2 == null) {
    		return l1;
    	}
    	
    	ListNode currentL1Node = l1;
    	ListNode currentL2Node = l2;
    	ListNode head = null;;
    	ListNode newNode;
    	ListNode currentNode = null;
    	
    	while (currentL1Node != null && currentL2Node != null) {
        	if (currentL1Node.val < currentL2Node.val) {
        		newNode = new ListNode(currentL1Node.val);
        		currentL1Node = currentL1Node.next;
        	}
        	else {
        		newNode = new ListNode(currentL2Node.val);
        		currentL2Node = currentL2Node.next;
        	}
        	
        	if (head == null) {
        		head = newNode;
        		currentNode = head;
        	}
        	else {
        		currentNode.next = newNode;
        		currentNode = currentNode.next;
        	}
    	}
    	
    	// process remaining nodes in l1
    	while (currentL1Node != null) {
    		currentNode.next = currentL1Node;
    		currentNode = currentNode.next;
    		currentL1Node = currentL1Node.next;
    	}
    	
    	// process remining nodes in l2
    	while (currentL2Node != null) {
    		currentNode.next = currentL2Node;
    		currentNode = currentNode.next;
    		currentL2Node = currentL2Node.next;
    	}
    	
    	return head;
    }
    
    public void print(ListNode listNode) {
    	ListNode currentListNode = listNode;
    	
    	while (currentListNode != null) {
    		System.out.print(currentListNode.val);
    		System.out.print(" ");
    		
    		currentListNode = currentListNode.next;
    	}
    	
    	System.out.println();;
    }
}
