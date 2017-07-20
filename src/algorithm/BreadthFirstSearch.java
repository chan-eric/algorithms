package algorithm;

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
		
		//print all the nodes with breadth first search
		
		Queue q = new Queue();
		q.insert(a);
		
	}
	
	private static void printAllNodes(TreeNode node) {
		if (node != null) {
			System.out.println(node.val);
		}
		
		if (node.left != null) {
			System.out.println(node.left.val);
		}
		
		if (node.left != null) {
			System.out.println(node.left.val);
		}
	}

}
