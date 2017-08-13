package algorithm;

import java.util.ArrayList;

public class MinSumPathInMatrix {

	public static void main(String args[]) {
		
	}
	
	public static int minPathSum(ArrayList<ArrayList<Integer>> a) {
		//null check after
		
		int bottomWall = a.size()-1;
		int rightWall = a.get(0).size()-1;
		
		
		return -1;
	}
	
	private static int[] goRight(int[] current, int rightWall) {
		int next[] = new int[2];
		if (current[1] == rightWall) {
			return next;
		}
		next[0] = current[0];
		next[1] = current[1]+1;
		return next;
	}
	
	private static int[] goDown(int[] current, int bottomWall) {
		int next[] = new int[2];
		if (current[0] == bottomWall) {
			return next;
		}
		next[0] = current[0]+1;
		next[1] = current[1];
		return next;
	}
}
