package algorithm;

public class LongestPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = new String[4];
		str[0] = "abca";
		str[1] = "abcd";
		str[2] = "abd";
		str[3] = "aba";
				
		
		String pref = longestCommonPrefix(str);
		System.out.println(pref);
	}
	
	
	public static String longestCommonPrefix(String[] strs) {
        String result = "";
        
        String longestStr = "";
        for (String str : strs) {
        	if (str.length() > longestStr.length()) {
        		longestStr = str;
        	}
        }
		
		for (int i=0; i< longestStr.length(); i++) {
			String tempStr = longestStr.substring(i, i+1);
			boolean match = true;
			for (int j=0; i<strs.length; j++) {
				if (!strs[j].substring(i, i+1).equals(tempStr)) {
					match = false;
					return result;
				}
			}
			result = result + tempStr;
		}
		
		return result;
    }

}
