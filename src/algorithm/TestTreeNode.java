package algorithm;

import datastructure.Queue;
import datastructure.TreeNode;

public class TestTreeNode {

	public static void main(String[] args) {
	
		int num = 12345678;
				
		TreeNode node = new TreeNode(-1) ;
		Queue queue = new Queue();
		while (num > 0) {
			int x = num % 10;
			TreeNode.insert(node, x, queue);
			num = num / 10;
		}
	}

}
