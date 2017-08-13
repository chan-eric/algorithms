package algorithm;

import java.util.Arrays;

import datastructure.TreeNode;

public class ContructMaxBinaryTree {

	public static void main(String[] args) {
		ContructMaxBinaryTree sol = new ContructMaxBinaryTree();
		
		int[] nums = {3,2,1,6,0,5};
		TreeNode result = sol.constructMaximumBinaryTree(nums);
	}
	
	public TreeNode constructMaximumBinaryTree(int[] nums) {
        
		if (nums==null || nums.length==0) {
			return null;
		}
		
        int[] max = findMax(nums);
        TreeNode tree = new TreeNode(max[1]);
        
        int[] left = Arrays.copyOfRange(nums, 0, max[0]);
        tree.left = constructMaximumBinaryTree(left);
        
        if (max[0] != nums.length -1) {
	        int[] right = Arrays.copyOfRange(nums, max[0]+1, nums.length);
	        tree.right = constructMaximumBinaryTree(right);
        }
        
        return tree;
    }
	
	
	public int[] findMax(int[] nums) {
		int[] max = {-1, Integer.MIN_VALUE};
		
		for (int i=0; i<nums.length; i++) {
			if (max[1] < nums[i]) {
				max[1] = nums[i];
				max[0] = i;
			}
		}
		return max;
	}

}
