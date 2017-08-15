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
	
	
	public int removeElementOptimal(ArrayList<Integer> A, int B) {
	    
	    int count = 0;
	    int k = 0;
	    
	    for (int i = 0; i < A.size(); i++) {
	        
	        if (A.get(i) == B) {
                count++;
	        } else {
	            A.set(i - count, A.get(i));
	        }
	        
	    }
	    
	    for (int i = 0; i < count; i++)
	        A.remove(A.size() - 1);
	    
	    return A.size();
	}
}
