package algorithm;

import datastructure.Node;

public class ReverseLinkedList {

	public static void main(String[] args) {

		
		String s = "asdfasdfa";
		System.out.println(reverseString(s));
		
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		b.next=c;
		a.next=b;
		
		Node d  = reverseList(b);
		while (d!=null) {
			System.out.println(d.value.toString());
			d=d.next;
		}
		
	}
	
	private static Node reverseList(Node node) {
		
		if (node == null) {
			return null;
		}
		if (node.next == null) {
	        return node;
	    }
		
		Node result = reverseList(node.next);
		node.next=null;
		Node temp = result;
		
		while (temp.next!=null) {
			temp = temp.next;
		}
		temp.next=node;
		return result;
		
	}

	//reverse string
	public static String reverseString(String s) {
	       
        char[] c = s.toCharArray();
        
        for (int i=0; i<c.length/2; i++) {
            char temp = c[i];
            c[i] = c[c.length - 1 - i];
            c[c.length - 1 - i] = temp;
        }
        return String.valueOf(c);
    }
}
