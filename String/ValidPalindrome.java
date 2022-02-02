package String;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "A man, a plan, a canal: Panama";
		isPalindrome(str);
		System.out.println(isPalindrome(str));
		
	}

    static boolean isPalindrome(String str) {
    
    	str = str.toLowerCase();
    	str = str.replaceAll("[^a-zA-Z0-9]", "");
    	System.out.println(str);
    	
    	for(int i=0; i<str.length()/2; i++) 
    	{
    		int start = i;
    		int end = str.length()-1-i;
    		if(start<end && str.charAt(start) != str.charAt(end)) 
    		{
    			return false;
    		}
    	}
    	return true;
    }
}
