package algorithm;

import datastructure.Node;
import datastructure.Queue;
import datastructure.TreeNode;

public class BreadthFirstSearch {

	public static void main(String[] args) {

		TreeNode a = new TreeNode(10);
		TreeNode b = new TreeNode(9);
		TreeNode c = new TreeNode(12);
		TreeNode d = new TreeNode(11);
		TreeNode e = new TreeNode(1);
		TreeNode f = new TreeNode(6);
		TreeNode g = new TreeNode(3);
		
		//Test case 1 balanced
		a.left=b;
		a.right=c;
		b.left=d;
		c.right=e;
		d.right=f;
		e.left=g;
		
		//
		b.right = new TreeNode(2);
		c.left = new TreeNode(4);
		d.left = new TreeNode(5);
		e.right = new TreeNode(7);
		f.left = new TreeNode(8);
		
		
		//print all the nodes with breadth first search
		
		Queue q = new Queue();
		q.insert(a);
		
		traverse(q);
	}
	
	private static void traverse(Queue q) {
		
		//Queue newQ = new Queue();
		
		while (q.peak() != null) {
			Node next = q.pop();
			TreeNode node = (TreeNode)next.value;
			System.out.println(node.val);
			
			if (node.left != null) q.insert(node.left);
			if (node.right != null) q.insert(node.right);
		}
		
		
	}

}
