package palindrome;

public class Palindrome {
	
	public static String reverse (String s) {
		
		StringBuffer towards = new StringBuffer();
		
		for( int i=0; i<s.length(); i++) {
			towards.append(s.charAt(s.length()-i-1));
		}
		
		return new String(towards);
		
	}
	


}
