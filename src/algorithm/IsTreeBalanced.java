package algorithm;

import datastructure.TreeNode;


/**
 * 
 * @author 319881652
 *
 *	Height-balanced binary tree : is defined as 
 *  a binary tree in which the depth of the two subtrees of every node never differ by more than 1
 */
public class IsTreeBalanced {

	public static void main(String[] args) {

		System.out.println(isBalanced(TreeTestCases.treeTest0()));
		
	}
	
	public static int isBalanced(TreeNode a) {
		if (checkBalanced(a)) {
			return 1;
		}
		return 0;
	}

	
	public static boolean checkBalanced(TreeNode node) {
		
		if (node==null) return true;
		boolean leftBalanced = node.left == null ? true :  checkBalanced(node.left);
		boolean rightBalanced = node.right == null ? true: checkBalanced(node.right);
		int heightDiff = height(node.left ) - height(node.right);
		if (node.left == null && node.right != null) {
			heightDiff = height(node.right)+1;
		} else if (node.left != null & node.right == null) {
			heightDiff = height(node.left)+1;
		} 
		boolean rootBalanced = heightDiff < 2 && heightDiff > -2;
		
		return leftBalanced && rightBalanced && rootBalanced;
	}
	
	public static int height(TreeNode node) {
		if (node==null || (node.left==null && node.right==null)) {
			return 0;
		}
		if (node.left != null || node.right != null) {
			
			int leftHeight = height(node.left);
			int rightHeight = height(node.right);
			
			if (leftHeight >= rightHeight) {
				return 1+leftHeight;
			} else {
				return 1+rightHeight;
			}
		}
		
		return 0;
	}
	
	
}
