package algorithm;

import java.util.ArrayList;
import java.util.List;

import datastructure.Stack;
import datastructure.TreeNode;

public class DeptFirstSearch {

	public static void main(String[] args) {

		Stack stk = new Stack();
		stk.push(TreeTestCases.treeTest1());
		
		//preorderDfs(stk);
		
		//inorderDfs(TreeTestCases.treeTest1());
		
		postorderTraversalold(TreeTestCases.treeTest1());
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

	private static ArrayList<Integer> postorderTraversalold(TreeNode in) {
		
		Stack s = new Stack();
		s.push(in);
		
		while (s.peak()!=null) {
			TreeNode node = (TreeNode) s.pop();
		}
		
		return null;
	}
	
	//optimal stack solution
	public List<Integer> postorderTraversal(TreeNode root) {
	    List<Integer> res = new ArrayList<Integer>();
	 
	    if(root==null) {
	        return res;
	    }
	 
	    java.util.Stack<TreeNode> stack = new java.util.Stack<TreeNode>();
	    stack.push(root);
	 
	    while(!stack.isEmpty()) {
	        TreeNode temp = stack.peek();
	        if(temp.left==null && temp.right==null) {
	            TreeNode pop = stack.pop();
	            res.add(pop.val);
	        }
	        else {
	            if(temp.right!=null) {
	                stack.push(temp.right);
	                temp.right = null;
	            }
	 
	            if(temp.left!=null) {
	                stack.push(temp.left);
	                temp.left = null;
	            }
	        }
	    }
	 
	    return res;
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> res = new ArrayList<Integer>();
		
		if (root == null) {
            return null;
        }
        
        //keep the nodes in the path that are waiting to be visited
		java.util.Stack<TreeNode> stack = new java.util.Stack<TreeNode>();
		TreeNode node = root;
         
        //first node to be visited will be the left one
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
         
        // traverse the tree
        while (stack.size() > 0) {
           
            // visit the top node
            node = stack.pop();
           	res.add(node.val);
            if (node.right != null) {
                node = node.right;
                 
                // the next node to be visited is the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
        return res;
	}
}
