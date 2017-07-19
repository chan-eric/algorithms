package algorithm;
/**
 * @author ericchan
 * 
 *Implement int sqrt(int x).
 *Compute and return the square root of x.
 *If x is not a perfect square, return floor(sqrt(x))
 *
 *Example, input 11, output will be 3
 */
public class BinarySearch {

	public static void main(String[] args) {

		
		//input 11, expect 3
		int num = 930675566;
		int root = sqrt(num);
		System.out.println(root);
		
		num = 0;
	    root = sqrt(num);
		System.out.println(root);
		
		num = 1;
	    root = sqrt(num);
		System.out.println(root);
		
		num = 2;
	    root = sqrt(num);
		System.out.println(root);
		
		num = 101;
	    root = sqrt(num);
		System.out.println(root);
		
		num = 16;
	    root = sqrt(num);
		System.out.println(root);
	}
	
	private static int sqrt(int x) {
		
		if (x==0 || x==1) return x;
		return search(0, x, x);
	}
	
	private static int search(int lo, int hi, int tar) {
		long num = ((long)hi + lo + 1) / 2;
		if (num*num <= tar && (num+1) * (num+1) > tar) {
			return (int)num;
		}
		
		if (num*num > tar) {
			return search(0, (int)(num-1), tar);
		}
		
		if (num*num < tar) {
			return search((int)(num+1), hi, tar);
		}

		return -1;
	}
	
}
