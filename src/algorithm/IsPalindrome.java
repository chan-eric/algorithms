package algorithm;

public class IsPalindrome {

	public static void main(String[] args) {
		IsPalindrome sol = new IsPalindrome();
		
	//	String s ="A man, a plan, a canal: Panama";
		
		String s="A man, a plan, a canal: Panama";
		//String s="3s3";
		System.out.println(sol.isPalindrome(s));
	}

	public int isPalindrome(String str) {
		
		
		int i=0;
		int j=str.length()-1;
		
		while (j - i > 0) {
			char front=str.charAt(i);
			char back=str.charAt(j);
			if (!Character.isDigit(front) && Character.isLetter(front))
				i++;
			else if (!Character.isDigit(back) && Character.isLetter(back))
				j--;
			else if (Character.toLowerCase(front) != Character.toLowerCase(back) ) {
				return 0; 
			} else {
				i++;
				j--;
			}
			
		}
		
		
		return 1;
	}
	
	public boolean isPalindromee(String s) {
		if (s==null)
			throw new IllegalArgumentException();
		String b =  s.replaceAll("[^A-Za-z0-9]+", "");
		if (b.equalsIgnoreCase(reverse(b))) {
			return true;
		}
		
		return false;
	}
	
	public String reverse(String s) {
		
		if (s==null) 
			return "";
		if (s.length()==0)
			return "";
		if (s.length()==1)
			return s;
		
		
		return reverse(s.substring(1)).concat(s.substring(0,1));
		
		
	}
}
