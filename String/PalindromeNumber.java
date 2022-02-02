import java.util.Scanner;

public class PalindromeNumber {
	 static boolean isPalindrome(int x) {
	        int number = x;
	        int rev = 0; 
	         while(number != 0){
	             int remain = number%10;
	        
	         rev = rev*10 + remain;
	        number = number/10;
	         }
	
	        if(x!=rev){
	          return false;  
	        }else{
	        	System.out.println("true");
	            return true;
	        }
	             
	    }
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	isPalindrome(x);

}
}
