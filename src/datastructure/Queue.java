package datastructure;

public class Queue {

	Node queue;  //the data structure
	
	Node head;  //the pointer to head
	
	
	public void insert (Object val){
		if (queue==null) {
			queue = new Node(val);
			head = queue;
		} else  {
			Node next = new Node(val);
			queue.next = next;
			queue = queue.next; 
		}
	}
	
	public Object pop(){
		
		Node node = head;
		if (head !=null) {
			if (head == queue) {
				queue = queue.next;
			}
			head=head.next;
		}
		
		return node.value;
	}
	
	public Node peak() {
		return head;
	}
	
	public Object getValue() {
		return queue.value;
	}
}
