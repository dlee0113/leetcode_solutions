package com.leetcode.DeleteNodeInALinkedList;

// http://algorithms.tutorialhorizon.com/reverse-a-linked-list/
public class Solution {
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		
		node1.next = node2;
		node2.next = node3;
		
		Solution solution = new Solution();
		solution.print(node1);
		
		ListNode reversedLinkedList = solution.reverseList(node1);
		solution.print(reversedLinkedList);
	}
	
    public ListNode reverseList(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;
        ListNode nextNode = null;
        
    	while (currentNode != null) {
    		nextNode = currentNode.next;
    		currentNode.next = previousNode;
    		previousNode = currentNode;
    		currentNode = nextNode;
    	}
    	
    	return previousNode;
    }
    
    public void print(ListNode node) {
    	ListNode currentNode = node;
    	
    	while (currentNode != null) {
    		System.out.print(currentNode.val + " ");
    		
    		currentNode = currentNode.next;
    	}
    	
    	System.out.println();
    }
}