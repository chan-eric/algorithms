package algorithm;

import datastructure.Queue;
import datastructure.Stack;

public class TestQueueStack {

	public static void main(String[] args) {

		int num =12345678;
		Queue q = new Queue ();
		Stack s = new Stack();
		
		while (false &&num > 0) {
			
			q.insert(num%10);
			s.push(num%10);
			num = num /10;
			System.out.println(q.getValue());
		}
	}

}
