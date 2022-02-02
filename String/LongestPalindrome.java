import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bb";
		longestPalindrome(s);
	}

	static int longestPalindrome(String s) {
	    

	    HashMap<Character, Integer> freq = new HashMap<>();
	   for(int m=0; m<s.length(); m++) {
		   if(freq.containsKey(s.charAt(m))) {
			   freq.put(s.charAt(m), freq.get(s.charAt(m))+1);
		   }else {
			   freq.put(s.charAt(m), 1);
		   }
	   }
	 int z=0; boolean odd_found=false;
	    for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
	    	  if (entry.getValue() > 0) {
	              System.out.println(entry.getKey()+ " --> "+entry.getValue());
	            }
	    	  
	    	  if(entry.getValue()%2==0) {
	    		  z+=entry.getValue();
	    	  }else if(entry.getValue()%2==1) {
	    		  z+=entry.getValue() -1;
	    		  odd_found=true;
	    	  }
	    	}
	    if(odd_found) {
	    	z++;
	    	System.out.println(z);
	    }
	    System.out.println(z);
		return z;
	    	
	   
	    
	    
	}
}
