package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatAndMissingArray {

	public static void main(String[] args) {

		List<Integer> list =  Arrays.asList(1, 2, 3, 5);
		repeatedNumber(list);
	}

	// DO NOT MODIFY THE LIST
	public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		ArrayList<Integer> result = new ArrayList<>();
		int repeat = -1;
		int missing = -1;
		
		for (int i=1; i<a.size()+1; i++) {
			if (!a.contains(i)) {
				missing = i;
			}
			
			if (a.indexOf(i) != a.lastIndexOf(i)) {
				repeat = i;
			}
		}
		result.add(repeat);
		result.add(missing);
		return result;
	}
	
}
