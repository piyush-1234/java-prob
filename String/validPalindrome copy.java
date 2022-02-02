
public class validPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "A man, a plan, a canal: Panama";
		isPalindrome( s);
	}

	static void isPalindrome(String s) {
	        String ss = s.replaceAll("[^a-zA-Z0-9]","");
	      
	        String ssr = ss.toLowerCase();
	       
	        char[] arr = new char[ss.length()];
	       
	        for(int i = 0; i<arr.length; i++){
	           arr[i] = ssr.charAt(arr.length-1-i);
	          
	        }
	       String a =String.valueOf(arr);
	   System.out.println(ssr);
	   System.out.println(a);
	   
	        if(ssr.equals(a)){
	            System.out.println(true);
	        }else{
	            System.out.println(false);}
	    }

	
}
