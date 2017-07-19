package datastructure;

public class Queue {

	Node queue;
	
	Node head;
	
	
	public void insert (Object val){
		if (queue==null) {
			queue = new Node(val);
			head = queue;
		}
		
		Node next = new Node(val);
		queue.next = next;
		queue = queue.next;
	}
	
	public Node pop(){
		
		Node node = head;
		if (head!=null)head = head.next;
		
		return node;
	}
	
	public Node peak() {
		return head;
	}
	
	public Object getValue() {
		return queue.value;
	}
}
