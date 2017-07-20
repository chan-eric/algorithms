package algorithm;

import datastructure.TreeNode;

public class TreeTestCases {
	
	public static TreeNode treeTest0() {
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
		return a;
	}

	public static TreeNode treeTest1() {
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
		
		return a;
	}
	
	public static TreeNode treeTest2() {
		TreeNode a = new TreeNode(5);
		TreeNode b = new TreeNode(3);
		TreeNode c = new TreeNode(6);
		TreeNode d = new TreeNode(1);
		TreeNode e = new TreeNode(4);
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		
		return a;
	}
}
