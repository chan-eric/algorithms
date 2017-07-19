package algorithm;

import java.util.ArrayList;

/**TODO inefficient solution*/
public class IsIntPalindrome {

	public static void main(String[] args) {
		
		isPalindrome(1);
		isPalindrome(0);
		isPalindrome(12345);
		isPalindrome(12321);
		isPalindrome(123321);
		isPalindrome(1222222221);
		isPalindrome(1222222231);
		isPalindrome(-121);
	}

	private static boolean isPalindrome(int x) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while (x!=0) {
			int a = x%10;
			x=x/10;
			list.add(a);
		}
		
		int halfSize = isEven(list.size()) ? list.size()/2 : list.size()/2 +1;
		
		for (int i=0; i<halfSize; i++) {
			if (list.get(i) != list.get(list.size()-1-i)) {
				System.out.println("false");
				return false;
			}
		}
		System.out.println("true");
		return true;
	}
	
	private static boolean isEven(int x) {
		return (x%2==0);
	}
}
