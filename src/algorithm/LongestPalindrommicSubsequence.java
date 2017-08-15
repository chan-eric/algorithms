package algorithm;

public class LongestPalindrommicSubsequence {

	public static void main(String[] args) {
		
		
		String in = "ADBAC";
		LongestPalindrommicSubsequence sol = new LongestPalindrommicSubsequence();
		System.out.println(sol.lps(in.toCharArray(), 0, in.length()-1));
	}

	
	private int max (int x, int y) { return (x > y)? x : y; }
	 
	// Returns the length of the longest palindromic subsequence in seq
	public int lps(char[] seq, int i, int j)
	{
	   // Base Case 1: If there is only 1 character
	   if (i == j)
	     return 1;
	 
	   // Base Case 2: If there are only 2 characters and both are same
	   if (seq[i] == seq[j] && i + 1 == j)
	     return 2;
	 
	   // If the first and last characters match
	   if (seq[i] == seq[j])
	      return lps (seq, i+1, j-1) + 2;
	 
	   // If the first and last characters do not match
	   return max( lps(seq, i, j-1), lps(seq, i+1, j) );
	}
}
