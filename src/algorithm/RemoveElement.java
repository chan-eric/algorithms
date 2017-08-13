package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
	
	public static void main(String args[]) {
		
		//init an array list
		int[] ai = {1,2,3,4,5,6};
		ArrayList<Integer> a = (ArrayList)Arrays.asList(ai) ;
		
		removeElement(a, 5);
	}

	public static int removeElement(ArrayList<Integer> a, int b) {
	
		
		int i=0;
		while (i<a.size()) {
			
			if (a.get(i) == b) {
				a.remove(i);
			}
			else 
				i++;
		}
		
		return a.size();
	}
}
