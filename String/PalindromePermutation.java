import java.util.HashSet;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s = "code";
		canPermutePalindrome(s);
		
	}
  
	static boolean canPermutePalindrome(String s) {
		HashSet<Character> arr = new HashSet<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(arr.contains(c) ){
			arr.remove(c);
			}else {
				arr.add(c);
			}
		}
		System.out.println(arr.size() <= 1);
		return arr.size() <= 1;
	}
	
	
}
