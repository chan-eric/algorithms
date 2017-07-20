package algorithm;

public class LinkedListExample {

	public static void main (String args[]) {
	    
	    int x= 15;
	    Node linkedList = convert(x);
	}


	public static Node convert(int num) {
	    Node node = new Node(0);
	    Node head = node;
	    while (num > 0) {
	        int re = num % 10;
	        num = num / 10;
	        Node newNode = new Node(re);
	        node.next = new Node(re);
	        node = node.next;
	    }
	    return head.next;
	}

	private static class Node {
	    int val;
	    Node next;
	    
	    public Node(int x) {
	        this.val=x;
	    }
	}
}
