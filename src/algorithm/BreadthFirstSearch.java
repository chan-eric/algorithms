package algorithm;

import datastructure.Node;
import datastructure.Queue;
import datastructure.TreeNode;

/**
 * print all the nodes with breadth first search
 * @author ericchan
 *
 */
public class BreadthFirstSearch {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		q.insert(TreeTestCases.treeTest1());
		
		traverse(q);
	}
	
	private static void traverse(Queue q) {
		
		while (q.peak() != null) {
			Node next = q.pop();
			TreeNode node = (TreeNode)next.value;
			System.out.println(node.val);
			
			if (node.left != null) q.insert(node.left);
			if (node.right != null) q.insert(node.right);
		}
		
		
	}

}
