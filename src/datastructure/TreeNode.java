package datastructure;

import java.util.List;

public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x) { val = x; }
	
	
	public static void insert(TreeNode node, int num, Queue q) {
		
		q.insert(num);
		
		TreeNode newNode = new TreeNode(num);
		if (node.val==-1) {
			node.val=num;
		} else if (node.left == null) {
			node.left = newNode;
		} else if (node.right == null) {
			node.right = newNode;
		} else {
			q.pop();
		}
		q.insert(newNode);
	}
	
	public static void insertNumbers(List<Integer> list) {
		
		Queue q = new Queue();
		TreeNode node = new TreeNode(0);
		
		q.insert(node);
		while (true) {
			if (q.peak()==null) break;
			
			if (list.isEmpty()) break;
			
			Node tempNode = q.pop();
			
		}
	}
	
	public String toString() {
		return String.valueOf(this.val);
	}
}
