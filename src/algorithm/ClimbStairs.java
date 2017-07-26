package algorithm;
import java.util.ArrayList;

public class ClimbStairs {

	public static void main(String[] args) {

		ClimbStairs sol = new ClimbStairs();
		
		
		
		sol.climbStairs(6);
	}

	private int climbStairs(int n) {
		ArrayList<Integer> cache = new ArrayList<>();
		cache.add(0);
		cache.add(1);
		cache.add(2);
		
		if (n<3) return cache.get(n);
		
		for (int i=3; i<n; i++) {
			int temp = cache.get(i-1) + cache.get(i-2);
			cache.add(temp);
		}
		
		long result = cache.get(n-1) + cache.get(n-2);
		return (int)result;
	}
	
}
