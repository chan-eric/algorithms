package algorithm;

import datastructure.Stack;
import datastructure.TreeNode;

public class DeptFirstSearch {

	public static void main(String[] args) {

		Stack stk = new Stack();
		stk.push(TreeTestCases.treeTest1());
		
		//preorderDfs(stk);
		
		inorderDfs(TreeTestCases.treeTest1());
	}

	private static void inorderDfs(TreeNode node) {

		if (node == null) {
			return;
		}
		
		if (node.left != null) {
			inorderDfs(node.left);
		} 
		System.out.println(node);
		
		if (node.right !=  null) {
			inorderDfs(node.right);
		}
	}

	private static void preorderDfs(Stack stk) {

		while (stk.peak() != null) {
			TreeNode content = (TreeNode)stk.pop();
			System.out.println(content);
			
			stk.push(content.left);
			stk.push(content.right);
		}
	}

}
