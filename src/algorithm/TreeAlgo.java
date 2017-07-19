package algorithm;

import datastructure.Queue;
import datastructure.Stack;
import datastructure.TreeNode;

public class TreeAlgo {

	public static void main(String[] args) {
		
		
		int num = 12345678;
		
		Queue q = new Queue ();
		Stack s = new Stack();
		
		while (false &&num > 0) {
			
			q.insert(num%10);
			s.push(num%10);
			num = num /10;
			System.out.println(q.getValue());
		}
		
		System.out.println(11111111);
		
		
		TreeNode node = new TreeNode(-1) ;
		Queue queue = new Queue();
		while (num > 0) {
			int x = num % 10;
			TreeNode.insert(node, x, queue);
			num = num / 10;
		}
	}

	
	
	
	
	
}
