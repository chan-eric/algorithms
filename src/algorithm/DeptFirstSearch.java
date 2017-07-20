package algorithm;

import datastructure.Node;
import datastructure.Stack;
import datastructure.TreeNode;

public class DeptFirstSearch {

	public static void main(String[] args) {

		Stack stk = new Stack();
		stk.push(TreeTestCases.treeTest1());
		
		dfsMidLeftRight(stk);
	}

	private static void dfsMidLeftRight(Stack stk) {

		while (stk.peak() != null) {
			Node node = stk.pop();
			TreeNode content = (TreeNode)node.value;
			System.out.println(content);
			
			stk.push(content.left);
			stk.push(content.right);
		}
	}

}
