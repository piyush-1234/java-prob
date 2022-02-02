import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ValidPalindromes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="eedede";
		validPalindrome(s);
	}
	static boolean validPalindrome(String s) {
		
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else {
			
					
				return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
			}
		}
		return true;
	    }
	
	static boolean isPalindrome(String s, int i, int j) {
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}
}



