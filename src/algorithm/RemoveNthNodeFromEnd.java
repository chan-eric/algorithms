package algorithm;

import datastructure.Node;

public class RemoveNthNodeFromEnd {

	
	public static void main(String[] args) {
		Node node = new Node(1);
		Node head = node;
		node.next = new Node(2);
		node = node.next;
		node.next = new Node(3);
		node = node.next;
		node.next = new Node(4);
		node = node.next;
		node.next = new Node(5);
		node = node.next;
		
		removeNthFromEnd(head, 2);
	}
	
	public static Node removeNthFromEnd(Node head, int n) {
        
		Node result = head;
		
		
		
		return result;
    }
}
