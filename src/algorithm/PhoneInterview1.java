package algorithm;

import java.util.Stack;

public class PhoneInterview1 {
	

	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	}

	boolean isSumTree(TreeNode node) {
	    
	    boolean result=false;
	    boolean leftIsSumTree=false;
	    boolean rightIsSumTree=false;
	    
	    if (node == null) return true;
	    
	    if (node.left!=null)
	        leftIsSumTree = isSumTree(node.left);
	    
	    if (node.right!=null)
	        rightIsSumTree = isSumTree(node.right);
	        
	    
	    boolean sumOk = false;
	    
	    if (node.left != null || node.right !=null)
	        sumOk = (sumOfNode(node.left) + sumOfNode(node.right) == node.val);
	    else if (node.left == null && node.right == null)
	        return true;
	    
	    result = leftIsSumTree && rightIsSumTree && sumOk;
	    return result;
	}

	private int sumOfNode(TreeNode node) {
	    int result = 0;
	    if (node==null) return 0;
	    
	    Stack<TreeNode> stack = new Stack();
	    stack.push(node);
	    
	    while (!stack.empty()) {
	        TreeNode top = stack.pop();
	        result += top.val;
	        if (top.left != null)
	            stack.push(top.left);
	        if (top.right != null)
	            stack.push(top.right);
	    }
	    
	    return result;
	}

	
}
