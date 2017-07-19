package algorithm;

import datastructure.Node;

public class AddTwoNumber {
	

	public static void main(String[] args) {
		
		int num = 3425;
		
		Node ll = toLinkedList(num);
		
		while (ll != null)
		{
			System.out.println(ll.value);
			ll=ll.next;
		}
		
	}
	
	
	private static Node insertNode(Node inputNode, int val) {
		Node node = new Node(val);

		inputNode.next=node;
		inputNode=inputNode.next;

		return inputNode;
		
	}
	
	private static Node toLinkedList(int num) {
		Node curr = new Node(0);
		Node head = curr;
		while (num != 0) {
			int x = num %10;
			num = num / 10;
			
			curr = insertNode(curr, x);
		}
		return head.next;
	}

	
}
