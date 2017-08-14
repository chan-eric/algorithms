package algorithm;

import datastructure.TreeNode;
/**
 * Minimum difference between any adjacent nodes 
 * @author ericchan
 *
 */
public class MinDiffAdjacentNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getMinimumDifference(TreeNode root) {
        
        int min = Integer.MAX_VALUE;
        if (root==null) return min;
        
        if (root.left != null) {
            min = getAbsMin(root.left.val - root.val, min);
        }
        if (root.right != null) {
            min = getAbsMin(root.right.val - root.val, min);
        }
        
        return minabc(min, getMinimumDifference(root.left), getMinimumDifference(root.right));
    }
    
    public int minabc(int a, int b, int c) {
        return getAbsMin(getAbsMin(a,b), c);
    }
    
    public int getAbsMin(int a, int b) {
        if (a<0) a*=-1;
        if (b<0) b*=-1;
        return a>b?b:a;
    }
}
