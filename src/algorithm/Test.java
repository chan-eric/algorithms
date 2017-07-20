package algorithm;

import datastructure.SimpleNode;

/**TODO inefficient way of adding two linkedList*/
public class Test {

	public static void main(String[] args) {

//		int[] data = {2, 7, 11, 15};
//		int[] result=twoSum(data, 22);
//		System.out.println(result[0]+","+result[1]);
		
		SimpleNode n0 = new SimpleNode(0);
		SimpleNode n1 = new SimpleNode(2);
		n0.next = n1;
		n1.next = new SimpleNode(4);
		SimpleNode n2 = n1.next;
		n2.next = new SimpleNode(3);
		
		
		SimpleNode reverse = reverse(n0);

		SimpleNode result = addTwoNumbers(n0, n0);
		while (result!=null) {
			System.out.println(result.val);
			result=result.next;
		}
	}

	

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums.length; j++) {
				if (i==j) continue;
				
				if (nums[i]+nums[j]==target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		
		return result;
		
	}
	
	public static SimpleNode addTwoNumbers(SimpleNode l1, SimpleNode l2) {
		
		
		int num1=0,num2=0;
		int factor1=1, factor2=1;
        while (l1.next != null)
        {
        	l1 = l1.next;
        	num1=num1+l1.val * factor1;
        	factor1=factor1*10;
        }
        System.out.println(num1);
        
        while(l2.next != null) {
        	l2 = l2.next;
        	num2=num2+l2.val * factor2;
        	factor2=factor2*10;
        }
        System.out.println(num2);
        
        int sum = num1+num2;
        
        SimpleNode curr = new SimpleNode(0);
        SimpleNode head = curr ;
        while (sum > 0) {
        	SimpleNode n = new SimpleNode (sum %10);
        	sum = sum / 10;
        	curr.next = n;
        	curr = curr.next;
        }
        
        return head.next;
    }
	
	
	
	
	private static SimpleNode reverse(SimpleNode node) {

		if (node == null) {
			return null;
		}
		if (node.next == null) {
			return node;
		}
		
		SimpleNode temp = new SimpleNode(node.val);
		node = reverse(node.next);
		return concatNode(node, temp);
	}
	
	private static SimpleNode concatNode(SimpleNode n0, SimpleNode n1) {
		if (n0 == null) {
			return n1;
		}
		
		SimpleNode head = n0;
		while (n0.next != null) {
			n0 = n0.next;
		}
		
		n0.next = n1;
		return head;
	}
}
