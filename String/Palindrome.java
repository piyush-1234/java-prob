package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1001;
		isPalindrome(x);
		System.out.println(isPalindrome(x));
	}

	 static boolean isPalindrome(int x) {
	     
		   String str = Integer.toString(x);
		      
		        for(int i=0; i<str.length()/2; i++)
		        {
		             int start = i;
		             int end = str.length() - 1 - i;
		            if(start <= end && str.charAt(start) != str.charAt(end))
		            {
		                return false;
		            }
		        }
		        return true;
		}
}
